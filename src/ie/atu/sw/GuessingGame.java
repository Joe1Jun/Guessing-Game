package ie.atu.sw;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.*;

public class GuessingGame {
	
	private static final int MAX_GUESSES = 12;
	private Scanner s;
	private int number;

	
	public GuessingGame() {
		s = new Scanner(System.in);
		
		
	}
	

	public void start() {
		
		out.println("***************************");
		out.println("****   NUMBER GUESSING GAME   ****");
		out.println("***************************");
		
		
		//Random rand = new Random();
		ThreadLocalRandom random = ThreadLocalRandom.current();	
		//number = (int) (Math.random() * 100);//simple but error prone
		//number = rand.nextInt(1, 101);//much better
		number = random.nextInt(1, 101);//the best
		
		boolean notGuessed = true;
		
		
		for ( int i = 0 ; i <= MAX_GUESSES ; i++) {
			
			out.println("Guess a number betwen 1 an 100");
			
			int guess = Integer.parseInt(s.next());
			if ( guess == number) {
				 out.println("Well Done");
				notGuessed = false;
				break;
				
			}else if( guess > number) {				
				out.println("Number too high");
				
				
			}else  {
				out.println("Number too low");
				
			}
			
				
			
		out.println("You have " + (MAX_GUESSES - i) + " guesses left");
		}//end for loop
		
		if(!notGuessed) {
			out.println("Correct");
		}
		
		if (notGuessed) {
			out.println("Too bad correct answer was "  + number);
		}
		
	}

	
}
