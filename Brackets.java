package sandbox;

import java.util.ArrayList;

public class Brackets {

	public static void main(String[] args) {
		String S = ")(";

		if (solution(S) == 0) {
			System.out.println("Nest is not closed!");
		} else {
			System.out.println("Nest is closed!");
		}

	}

	private static int solution(String S) {
		/* 方針1: brackesCountでbracketが閉じているかを確認する。（順序問わず）
		 * bracketsCountが[0,0,0]のときに閉じていると判定。
		 *
		 * 方針2; bracketsCountだけでは順序判定ができない。
		 * 括弧を閉じているときに開いている括弧を閉じているかを判定するためにopenBracketがある。
		 * openBracket[currentDepth]に閉じるべき括弧が格納されていて、閉じると削除する。
		 */

		int[] bracketsCount = {0,0,0};
		ArrayList<String> openedBracket = new ArrayList<String>();
		int currentDepth = 0;

		for (int i=0; i<S.length(); i++) {
			currentDepth =  openedBracket.size()-1;
			switch(S.charAt(i)) {
			case '(' :
				openedBracket.add("(");
				bracketsCount[0]--;
				break;
			case ')' :
				if (openedBracket.isEmpty() || !openedBracket.get(currentDepth).equals("(") ) {
					return 0;
				}
				openedBracket.remove(currentDepth);
				bracketsCount[0]++;
				break;
			case '[' :
				openedBracket.add("[");
				bracketsCount[1]--;
				break;
			case ']' :
				if (openedBracket.isEmpty() || !openedBracket.get(currentDepth).equals("[")) {
					return 0;
				}
				openedBracket.remove(currentDepth);
				bracketsCount[1]++;
				break;
			case '{' :
				openedBracket.add("{");
				bracketsCount[2]--;
				break;
			case '}' :
				if (openedBracket.isEmpty() || !openedBracket.get(currentDepth).equals("{")) {
					return 0;
				}
				openedBracket.remove(currentDepth);
				bracketsCount[2]++;
				break;
			}
		}

		for (int n : bracketsCount) {
			if (n != 0) {
				return 0;
			}
		}

		return 1;
	}
}
