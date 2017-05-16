package sandbox;

public class MaxCounters {

	public static void main(String[] args) {
		int[] A = {3,4,4,6,1,4,4};

		for (int a : solution(5,A)) {
			System.out.println(a);
		}
	}

	private static int[] solution(int N, int[] A) {
		int[] counters = new int[N];

		for (int i=0; i<N; i++) {
			counters[i] = 0;
		}

		int maxCounters = 0;
		int baseCounters = 0;
		for (int a : A) {
			if (a == N+1) {
				baseCounters = maxCounters;
			} else {
				if (counters[a-1] < baseCounters) {
					counters[a-1] = baseCounters;
				}

				counters[a-1]++;
				if (counters[a-1] > maxCounters) {
					maxCounters = counters[a-1];
				}
			}
		}

		for (int i=0; i<N; i++) {
			if (counters[i] < baseCounters) {
				counters[i] = baseCounters;
			}
		}

		return counters;
	}
}
