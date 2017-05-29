package sandbox;

import java.util.Stack;

public class EquiLeader {

	public static void main(String[] args) {
		int[] A = {0};
		System.out.println(solution(A));
	}

	private static int solution(int[] A) {
		int N = A.length;
		Stack<Integer> stack = new Stack<Integer>();

		for (int a : A) {
			if (stack.isEmpty()) {
				stack.add(a);
			} else if (stack.peek() != a) {
				stack.pop();
			} else {
				stack.add(a);
			}
		}

		int leader = 0;
		if (stack.isEmpty()) {
			return 0;
		} else {
			leader = stack.pop();
		}

		boolean[] leaderArrayLeft = new boolean[N-1];
		boolean[] leaderArrayRight = new boolean[N-1];
		Stack<Integer> stackLeft = new Stack<Integer>();
		Stack<Integer> stackRight = new Stack<Integer>();

		for (int i=0; i<N-1; i++) {
			if (stackLeft.isEmpty()) {
				stackLeft.push(A[i]);
			} else {
				if (A[i] != stackLeft.peek()) {
					if (A[i] != leader && stackLeft.peek() != leader) {
						stackLeft.push(A[i]);
					} else {
						stackLeft.pop();
					}
				} else {
					stackLeft.push(A[i]);
				}
			}

			if (!stackLeft.isEmpty() && stackLeft.peek() == leader) {
				leaderArrayLeft[i] = true;
			} else {
				leaderArrayLeft[i] = false;
			}

			if (stackRight.isEmpty()) {
				stackRight.push(A[N-1-i]);
			} else {
				if (A[N-1-i] != stackRight.peek()) {
					if (A[N-1-i] != leader && stackRight.peek() != leader) {
						stackRight.push(A[N-1-i]);
					} else {
						stackRight.pop();
					}
				} else {
					stackRight.push(A[N-1-i]);
				}
			}

			if (!stackRight.isEmpty() && stackRight.peek() == leader) {
				leaderArrayRight[N-2-i] = true;
			} else {
				leaderArrayRight[N-2-i] = false;
			}
		}


		int equiLeaderCnt = 0;
		for (int i=0; i<N-1; i++) {
			if (leaderArrayLeft[i] && leaderArrayRight[i]) {
				equiLeaderCnt++;
			}
		}

		return equiLeaderCnt;
	}
}
