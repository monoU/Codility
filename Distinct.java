package sandbox;

import java.util.Arrays;

public class Distinct {

	public static void main(String[] args) {
		int[] A = {2,-1,-1,-2,3,-1};
		System.out.println(solution(A));
	}

	private static int solution(int[] A) {
		int cnt = 0;
		int currentValue = 0;

		Arrays.sort(A);
		for (int i=0; i<A.length; i++) {
			if (i==0) {
				currentValue = A[i];
				cnt++;
			} else {
				if (A[i] > currentValue) {
					currentValue = A[i];
					cnt++;
				}
			}
		}
		return cnt;
	}

}
