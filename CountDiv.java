package sandbox;

public class CountDiv {

	public static void main(String[] args) {
		System.out.println(solution(6,11,2));
	}

	private static int solution(int A, int B, int K) {
		return A%K==0 ? (B/K)-(A/K)+1 : (B/K)-(A/K);
	}
}
