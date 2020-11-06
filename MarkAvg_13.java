package first;

import java.util.Scanner;

public class MarkAvg_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1,sub2,sub3,sub4,sub5,sub6,avg=0,i;
		int[] arr = new int[5];
		
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			System.out.println("Enter subject mark :");
			arr[i]=sc.nextInt();
			avg=avg+arr[i];
		}
		/*sc.close();
		sub1=80;
		sub2=91;
		sub3=98;
		sub4=95;
		sub5=97;
		sub6=93;
		avg=(sub1+sub2+sub3+sub4+sub5+sub6)/6;*/
		avg=avg/5;
		System.out.println("Average Mark :"+avg);
		

	}

}
