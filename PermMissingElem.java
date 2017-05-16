package sandbox;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {
		int[] A = {1};
		System.out.println(solution(A));
	}


	public static int solution(int[] A) {
		int N = A.length;

		Arrays.sort(A);
		for (int i = 0; i < N; i++) {
			if (A[i] != i+1) {
				return i+1;
			}
		}
		return N+1;
	}
}
