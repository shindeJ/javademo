package first;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ft,ct;
		ft=32;
		ct=(ft-32)*5/9;
		System.out.println("Celsius temperature :"+ct );
		ct=32;
		ft=((9*ct)/5)+32;
		System.out.println("Fahrenheit temperature :"+ft );
	}

}
