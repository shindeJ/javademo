package first;

public class DayToYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numday=400;
		int year=numday/365;
		int rem=numday%365;
		int week=rem/7;
		int day=rem%7;
		
		System.out.println(year+" year");
		System.out.println(week+" week");
		System.out.println(day+" day");



	}

}
