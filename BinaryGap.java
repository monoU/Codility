package sandbox;

import java.util.ArrayList;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(solution(2049));
	}


	public static int solution(int N) {
		// write your code in Java SE 8

		int remainder = 0;
		ArrayList<Integer> binary = new ArrayList<Integer>();

		while (N > 0) {

			remainder = N % 2;
			N = N / 2;

			if (remainder == 0) {
				binary.add(0);
			} else {
				binary.add(1);
			}
		}
		System.out.println(binary);

		int binary_gap = 0;
		int longest_binary_gap = 0;
		boolean isCounting = false;

		for (int digit : binary) {

			if (!isCounting && digit == 0) {
		      continue;
			} else {
			  isCounting = true;
			}

			if (digit == 0) {
				binary_gap++;
			} else if (digit == 1) {
				if (binary_gap > longest_binary_gap) {
					longest_binary_gap = binary_gap;
				}
				binary_gap = 0;
			}
		}

		return longest_binary_gap;
	}
}
