package sandbox;

public class MinAvgTwoSlice {

	public static void main(String[] args) {
		int[] A = {-3,-5,-8,-4,-10};
		System.out.println(solution(A));
	}

	// 最小値は2項間の平均しかないという前提 → 実際は3項間の方が小さい場合がある
	private static int solution(int[] A) {
		int N = A.length;
		double[] pair = new double[N];
		double avg = 0;
		int startingPosition = 0;

		for (int p=0; p<N-1; p++) {
			if (p==0) {
				pair[0] = A[0] + A[1];
				avg = pair[0]/2;
				startingPosition = 0;
			} else {
				pair[p] = A[p] + A[p+1];
				System.out.println("p = " + p + " avg = " + pair[p]/2);
				if (avg > pair[p]/2) {
					avg = pair[p]/2;
					startingPosition = p;
				}
			}
		}

		return startingPosition;
	}
}
