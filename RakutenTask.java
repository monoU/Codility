package sandbox;

import java.math.BigInteger;
import java.util.ArrayList;

//フィボナッチ数列問題らしい。再起処理問題のあるある。

public class RakutenTask {

	public static void main(String[] args) {
		System.out.println(solution(3,4,1000000000));
	}

	public static int solution(int A, int B, int N) {

		long start = System.currentTimeMillis();

		ArrayList<BigInteger> numSet = new ArrayList<BigInteger>();

		for (int i = 0; i <= N; i++) {
			if (i == 0) {
				numSet.add((new BigInteger(Integer.toString(A))));
			} else if (i == 1) {
				numSet.add((new BigInteger(Integer.toString(B))));
			} else {
				numSet.add(numSet.get(1).add(numSet.get(0)));
				numSet.remove(0);
			}
		}

		BigInteger gf = numSet.get(1);
		long end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms");

		System.out.println("numSet = " + numSet);
		System.out.println("remainder = " + gf.mod(new BigInteger("1000000007")));

		return gf.mod(new BigInteger("1000000007")).intValue();
	}

}
