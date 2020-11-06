package first;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c;
		System.out.println("Before Swap :");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap :");
		System.out.println("a :"+a);
		System.out.println("b :"+b);

	}

}
