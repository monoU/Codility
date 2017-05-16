package sandbox;

public class FrogJmp {

	public static void main(String[] args) {
		System.out.println(solution(10, 10, 30));
	}

	public static int solution(int X, int Y, int D) {
		return (Y-X)%D  == 0 ? (Y-X)/D : (Y-X)/D+1;
	}
}
