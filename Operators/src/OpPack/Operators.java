package OpPack;

public class Operators {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static double div(double a, double b) {
		if (a<b) {
			System.out.println("Division is not permitted");
		}
		else {
			return a/b;
		}
		return Double.NEGATIVE_INFINITY;
		}
	
    public static void main(String[] args) {
			System.out.println(div(2, 7));
			System.out.println(add(10, 2));
			System.out.println(mul(10, 2));
			System.out.println(sub(10, 2));
		}
	}
