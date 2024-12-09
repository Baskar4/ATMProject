package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImp implements AtmInterface {
     
	Atm atm=new Atm();
	Map<Double,String> minist=new HashMap<Double,String>();
	
	public void viewBalance() {
		System.out.println("AvailableBalance:"+ atm.getBalance());
	}

	
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance())
			{
				System.out.println("collect the cash"+ withdrawAmount);
				atm.setBalance( atm.getBalance()-withdrawAmount);
				minist.put(withdrawAmount, "Amount withdrawn");
				viewBalance();
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		else
		{
			System.out.println("Enter the amount in terms of 500");
			
		}
		
		
	}


	public void depositeAmount(double depositAmount) {
		System.out.println("depositAmount is:"+ depositAmount);
		atm.setBalance(atm.getBalance()+depositAmount);
		minist.put(depositAmount, "Deposited successfully");
		viewBalance();
		
		
	}


	public void viewMinistatement() {
		Set<Double> set=minist.keySet();
		for(Double d:set)
		{
			System.out.println(d+ "="+ minist.get(d));
		}
		
		
	}

}
