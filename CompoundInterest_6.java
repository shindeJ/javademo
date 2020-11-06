package first;

public class CompoundInterest_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,t,r,ci;
		p=5000;
		t=7.5;
		r=3;
		ci=p*(Math.pow(1+(r/100),t));
		System.out.println("Compound Interest:"+ci );

	}

}
