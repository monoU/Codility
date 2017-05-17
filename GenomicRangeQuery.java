package sandbox;

public class GenomicRangeQuery {

	public static void main(String[] args) {
		String S = "AC";
		int[] P = {0,1};
		int[] Q = {0,1};

		for (int min : solution(S, P ,Q)) {
			System.out.println(min);
		}
	}

	private static int[] solution(String S, int[] P, int[] Q) {
		int M = P.length;
		int[] ret = new int[M];

		for (int i=0; i<M; i++) {
			String partialDna = S.substring(P[i], Q[i]+1);
			if (partialDna.contains("A")) {
				ret[i] = 1;
			} else if (partialDna.contains("C")) {
				ret[i] = 2;
			} else if (partialDna.contains("G")) {
				ret[i] = 3;
			} else {
				ret[i] = 4;
			}
		}

		return ret;
	}

}
