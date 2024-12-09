package atm;

import java.util.Scanner;

public class userInterface {
	private static int status;

	public static void main(String[] args) {
		AtmOperationImp impl=new AtmOperationImp();
		Scanner scan=new Scanner(System.in);
		int atmnum=123456;
		int atmpin=1234;
		System.out.println("Enter the ATM number");
		int atmnum2=scan.nextInt();
		System.out.println("Enter the ATM pin");
		int atmpin2=scan.nextInt();
		
		if(atmnum==atmnum2 && atmpin==atmpin2)
		{
			while(true) {
			System.out.println(" 1.viewAvailableBalance\n 2.WithdrawAmount\n 3.depositAmount\n 4.viewMiniStatement\n 5.exit");
			System.out.println("Enter your choice:");
			int ch=scan.nextInt();
			if(ch==1)
			{
				impl.viewBalance();
			}
			else if(ch==2)
			{
				System.out.println("Enter the  amount to withdraw ");
				double withdrawamount=scan.nextDouble();
				impl.withdrawAmount(withdrawamount);
			}
			else if(ch==3)
			{
				System.out.println("Enter the  amount to deposite ");
				double dipositamount=scan.nextDouble();
				impl.depositeAmount(dipositamount);
				
			}
			else if(ch==4)
			{
				impl.viewMinistatement();
			}
			else if(ch==5)
			{
				System.out.println("Collect youe ATM card\n THANK YOU");
				System.exit(status);
				
			}
			}
			}
		else
		{
			System.out.println("Enter the incorrect atm number or pin ");
		}
	}

}
