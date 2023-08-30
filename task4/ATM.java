package task4;

public class ATM {
	
     	 private long accono;
		 private int pin;
		 private double balance;
		
		 
		public  ATM(long accono,int pin, double amount)
		{
			
			
			this.accono = accono;
			this.pin = pin;
			this.balance = amount;
			
		}
	
		public long getAccono()
		{   
			return accono;
		}
		
		public void checkBalance(int pin)
		{
			if(this.pin==pin)
			{
				System.out.println(this.balance);
				System.out.println();
				
				
			}
			else
			{
				System.out.println("Invalid PIN");
				System.out.println();
				
			}
		}    
		
		public void withdraw(int pin , double amount)
		{
			
			if(this.pin == pin)
			{
				System.out.println("Login sucess");
				
				if(this.balance - amount >= 2000)
				{
					this.balance -= amount;
					System.out.println("Please collect your money");
					System.out.println("your currrent balnce is" +this.balance);
					System.out.println();
					
				}
				else
				{
					System.out.println("insufficent balance");
				}
			}
			else
			{
				System.out.println(" Invalid PIN ");
			}
		}
		
		  public void deposite( int pin ,double amount)
		  {
			  if(this.pin == pin)
			  {
				  this.balance += amount ;
				  System.out.println("Your Money has been successfully depsited");  
			        System.out.println("");  
				 
			  }
			  else
			  {
				 System.out.println("Invalid PIN");
				 System.out.println();
			  }
		}
		  
		  
		 
}
	
		



