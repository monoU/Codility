package codility;

import java.util.Stack;

public class Dominator {

	public static void main(String[] args) {
		int[] A = {0,1};
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		Stack<Integer> stack = new Stack<>();

		for (int a : A) {
			if (stack.isEmpty()) {
				stack.push(a);
			} else if (stack.peek() != a) {
				stack.pop();
			} else {
				stack.push(a);
			}
		}

		int dominatorCandidate = 0;
		if (stack.isEmpty()) {
			return -1; // no dominator exists
		} else {
			dominatorCandidate = stack.pop();
		}

		int N = A.length;
		int count = 0;
		for (int i=0; i<N; i++ ) {
			if (A[i] == dominatorCandidate) {
				if (++count > N/2) {
					return i;
				}
			}
		}

		return -1;
	}
}
