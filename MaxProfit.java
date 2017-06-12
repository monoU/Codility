package codility;

public class MaxProfit {

	public static void main(String[] args) {
		int[] A = {23171,21011,21123,21366,21013,21367};
		System.out.println(solution(A));
	}

	private static int solution(int[] A) {
		int minPrice = 200_000;
		int maxPrice = 0;
		for (int a: A) {
			minPrice = Math.min(a,minPrice);
			maxPrice = Math.max(a-minPrice, maxPrice);
		}
		return maxPrice;
	}

}
