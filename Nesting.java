package sandbox;

public class Nesting {

	public static void main(String[] args) {
		String S = "(()(())())";
		String test1 = ""; //true
		String test2 = ")"; //false
		String test3 = "("; //false
		String test4 = "()()()"; //true
		String test5 = "((())())"; //true
		String test6 = "((())))("; //false

		test(test1);
		test(test2);
		test(test3);
		test(test4);
		test(test5);
		test(test6);
	}

	private static void test(String S) {
		switch (solution(S)) {
		case 0:
			System.out.println("Not nested!");
			break;
		case 1:
			System.out.println("Is nested!");
			break;
		}
	}

	private static int solution(String S) {
		int cnt = 0;

		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i) == '(') {
				cnt++;
			} else if (S.charAt(i) == ')') {
				cnt--;
			}

			if (cnt<0) {
				return 0;
			}
		}

		if (cnt==0) {
			return 1;
		} else {
			return 0;
		}
	}

}
