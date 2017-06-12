package codility;

public class MaxSliceSum implements Codility {

	public static void main(String[] args) {
		int[] A = {1,1,1};
		System.out.println(new MaxSliceSum().solution(A));
	}

	@Override
	public int solution(int[] A) {
		int N = A.length;
		int[] current = new int[N];
		int max = 0;

		for(int i=0; i<N; i++) {
			if (i == 0) {
				current[i] = A[i];
				max = A[i];
			} else {
				current[i] = Math.max(A[i], A[i] + current[i-1]);
				max = Math.max(current[i], max);
			}
		}

		return max;
	}
}
