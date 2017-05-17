package sandbox;

public class PassingCars {

	public static void main(String[] args) {
		int[] A = {0,1,0,1,1};
		System.out.println(solution(A));
	}

	private static int solution(int[] A) {
		long passed = 0;
		long eastTraveller = 0;

		for (int a : A) {
			if (a == 0) {
				eastTraveller++;
			} else if (a == 1){
				passed += eastTraveller;
			}
		}

		if (passed > 1000000000) {
			return -1;
		} else {
			return (int) passed;
		}
	}
}
