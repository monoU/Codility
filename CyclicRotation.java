package sandbox;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] A = {1,2,3,4,-995};
		int[] rotA = sophisticatedSolution(A, 102);
		rotA = solution(A, 102);

		String ans = "";
		for (int a : rotA) {
			ans += Integer.toString(a) + ", ";
		}

		System.out.println(ans.substring(0, ans.length() - 2));
	}

	private static int[] solution(int[] A, int K) {
		int[] b = new int[A.length];

		for (int i = 0; i < A.length; i++ ) {
			int indexAfterRotation = i + K;

			if (indexAfterRotation > A.length - 1) {
				indexAfterRotation = indexAfterRotation % A.length;
			}
			b[indexAfterRotation] = A[i];
		}


		return b;
	}

	private static int[] sophisticatedSolution(int[] A, int K) {
		int N = A.length;

		if (N == 0)
			return A;
		if (K >= N)
			K %= N;
		if (K == 0)
			return A;

		int[] rotA = new int[N];

		for (int i = 0; i<N; i++) {
			rotA[i] = i<K ? A[N+i-K] : A[i-K];
		}
		return rotA;
	}

}
