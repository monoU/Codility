package sandbox;

public class MissingInteger {

	public static void main(String[] args) {
		int[] A = {1,2,3,4};
		System.out.println(solution(A));
	}

	private static int solution(int[] A) {
		int N = A.length;
		int[] existingInteger = new int[N];

		for (int i=0; i<N; i++) {
			existingInteger[i] = 0;
		}

		for (int a : A) {
			if (a> 0 && a<=N) {
				existingInteger[a-1] = 1;
			}
		}

		for (int i=0; i<N; i++) {
			if (existingInteger[i]==0) {
				return i+1;
			}
		}

		return N+1;
	}
}
