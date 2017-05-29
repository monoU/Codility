package sandbox;

import java.util.Stack;

public class StoneWall {

	public static void main(String[] args) {
		int[] H = {8,8,5,7,9,8,7,4,8};
		System.out.println(solution(H));

	}

	private static int solution(int[] H) {
		Stack<Integer> stack = new Stack<Integer>();
		int blockCnt = 0;

		for (int i=0; i<H.length; i++) {
			if (stack.isEmpty()) {
				stack.push(H[i]);
				blockCnt++;
			} else {
				while (!stack.isEmpty() && H[i] < stack.peek()) {
					stack.pop();
				}

				// 新しくブロック追加
				if (stack.isEmpty() || H[i] != stack.peek()) {
					stack.push(H[i]);
					blockCnt++;
				}
			}
		}

		return blockCnt;
	}
}
