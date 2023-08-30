package task4;

import java.util.Scanner;

public class ATMDriver {
	
	public static void main(String[] args) {
			
			 ATM a1 = new ATM(142536987,8374,50000.00);
			 
			 
			 Scanner sc = new Scanner(System.in);
			 
			  while(true)  
		        {  
		            System.out.println("Automated Teller Machine");  
		            System.out.println("Choose 1 for Withdraw");  
		            System.out.println("Choose 2 for Deposit");  
		            System.out.println("Choose 3 for Check Balance");  
		            System.out.println("Choose 4 for EXIT");  
		            System.out.print("Choose the operation you want to perform:");  
		              
		            //get choice from user  
		            int choice = sc.nextInt();  
		            switch(choice)  
		            {  
		              case 1:  
					      System.out.print("Enter your 4 digit pin :");
					      int pin = sc.nextInt();
					      System.out.println("Enter money to be withdrawn");
					      double amount =sc.nextDouble();
					        
				          a1.withdraw(pin,amount);
					      break;  
		   
		              case 2:  
		                      
				         System.out.print("Enter your 4 digit pin :");
				         System.out.print("Enter money to be deposited:"); 
				         a1.deposite(sc.nextInt(), sc.nextDouble());
		        
		        
		                      
		         
		                  break;  
		   
		                case 3:  
		                	System.out.print("Enter your 4 digit pin :");
		                	a1.checkBalance(sc.nextInt());
		                	
		                   break;  
		   
		                  case 4:  
		           
		        System.exit(0);  
		            }  
		        }  
		    }  
		  
	}



