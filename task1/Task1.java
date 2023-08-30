package task1;
import java.util.Random;
import java.util.Scanner;

public class  Task1 {
	
    static int rountCount=1;
		
     public static void main(String[] args) {
    	 
    	
		isCorrectGuess(randomNumber());   
		
	}
     
     public static int randomNumber()
	 {
		Random random = new Random();
		int ran= random.nextInt(100);
		return ran;
	 }
     
     public static int takeUserInput()
     {
    	 System.out.println("Guess a number between 1 to 100 ");
    	 Scanner sc = new Scanner(System.in);
    	 int guessnumber=sc.nextInt();
    	 return guessnumber;
     }
     
     
     public static void isCorrectGuess(int secreatnum)
     {
    	int count=1;
    	boolean guess=false;
    	System.out.println("You have 10 attempt to guess number.");
    	  while(guess!=true)
    	  {
    		  int guessnum = takeUserInput();
		        if(guessnum==secreatnum)
		        {
		              System.out.println(" Congratulation you guess in "+count+ " try ! In " +rountCount+ " Round"+ '\n');
		              guess=true;
		              break;
		        }   
		        
		        else if(count>=10)
		        {
		        System.out.println("sorry attempt over!!!! " + '\n'+"  Thanks for playing");
		        System.out.println();
		        break;
		        } 
		        
		        else if(guessnum>secreatnum)
		        {
		        	System.out.println("too high , try again");
		        	count++;
		        }
		        else// (guessnum<secreatnum)
		        {
		        	System.out.println("too low , try again");
		        	count++;
		        }
		      
		             
    	     }
    	  
    	
    	 System.out.println("1: Do you want to play again "  + '\n'+ 
    			             "  press 1 for 'Yes'. "+ '\n'+ "  press 2 for 'no'. " );
    	 Scanner scanner =  new Scanner(System.in);
    	 
    	 int ans=scanner.nextInt();
    	 
    	 if(ans==1)
    	 {
    		 rountCount++;
    		 isCorrectGuess(randomNumber()); 
    	 }
    	 else if(ans==2) 
    	 {
    		 System.out.println("Thanks For Playang");
    		
    	 }
    	 else
    	 {
    		 System.out.println("wrong input");
    	 }
    	
     }
}