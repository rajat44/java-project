import java.util.Scanner;

public class LAB05 {

	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("************SWAPPING************");
		System.out.println("enter the first number:");
		int num1=s.nextInt();
		System.out.println("enter the second number:");
		int num2=s.nextInt();
		int temp=0; 
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("AFTER SWAP 1ST NUM:"+num1+"\t 2ND NUM:"+num2);	

	}


}
