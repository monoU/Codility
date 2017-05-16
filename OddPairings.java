package sandbox;

import java.util.ArrayList;

public class OddPairings {

	public static void main(String[] args) {
		int[] A = {9,3,9,3,9,7,9};
		System.out.println(solution(A));
	}


	public static int solution(int[] A) {
		ArrayList<Integer> unpairedNumbers = new ArrayList<Integer>();

		for (int a : A) {
			if (unpairedNumbers.contains(a)) {
				unpairedNumbers.remove(unpairedNumbers.indexOf(a));
			} else {
				unpairedNumbers.add(a);
			}
		}
		return unpairedNumbers.get(0);
	}
}
