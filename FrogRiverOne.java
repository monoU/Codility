package sandbox;

public class FrogRiverOne {

	public static void main(String[] args) {
		int[] A = {1,2,3,10,5,6,7,8,9,4};
		System.out.println(solution(3, A));
	}

	 // 別にsumじゃなくてもいい
	private static int solution(int X, int[] A) {
		int[] leaves = new int[X];
		int sum = 0;

		for (int i=1; i<=X; i++) {
			sum += i;
			leaves[i-1] = 1;
		}


		for (int K=0; K<A.length; K++) {
			if (leaves[A[K]-1] == 1) {
				leaves[A[K]-1] = 0;
				sum -= A[K];
				if (sum == 0) {
					return K;
				}
			}
		}

		return -1;
	}

}
