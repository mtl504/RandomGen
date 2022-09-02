package RanNthNum;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class E1 {

	public static void main(String[] args) {		
		
		//Generate 500 random numbers and print the nth smallest number in a programming language of 
		//your choice. (Ask user for the Nth smallest number)
		
		Random rand = new Random();
		int max = 999;
		int min = 100;
		int n = 5;
		
		Set<Integer> duplicate = new LinkedHashSet<Integer>(); //Remove all Duplicate
		
		System.out.println("Random Numbers\n---------------");
		
		for(int i=0; i<500; i++) {
			
			
		}
		while(duplicate.size() !=500) {
			int randomNum = rand.nextInt((max - min) + 1) + min;
			duplicate.add(randomNum);
		}
		System.out.println(duplicate.size());
		Object[] x = duplicate.toArray();
		Arrays.sort(x);
		System.out.println(x[n]);
		
		}
		

}

