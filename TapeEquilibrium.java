package sandbox;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] A = {5,6,2,4,1};
		System.out.println(solution(A));
	}

	private static int solution(int[] A) {
		int sum = 0;

		for (int a : A) {
			sum += a;
		}

		int left = 0;
		int right = sum;
		int diff = Math.abs(A[0] - A[1]);

		for (int i = 0; i < A.length - 1; i++) {
			left += A[i];
			right -= A[i];
			if (Math.abs(left-right) < diff) {
				diff = Math.abs(left-right);
			}
		}

		return diff;
	}

}
