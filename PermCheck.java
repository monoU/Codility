package sandbox;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		int[] A = {4,3,2,1,5,7,8,6,9};
		System.out.println(sophisticatedSolution(A));
	}

	private static int solution(int[] A) {
		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			if (A[i] != i+1) {
				return 0;
			}
		}

		return 1;
	}

	private static int sophisticatedSolution(int[] A) {
        int[] counter = new int [A.length];

        for(int i= 0; i< A.length; i++){
            if (A[i] < 1 || A[i] > A.length) {
                // Out of range
                return 0;
            } else if(counter[A[i]-1] == 1) {
                // met before
                return 0;
            } else {
                // first time meet
                counter[A[i]-1] = 1;
            }
        }
        return 1;
	}

}
