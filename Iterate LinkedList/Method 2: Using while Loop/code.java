// Java program for iterating the LinkedList
// using while loop

import java.util.LinkedList;

public class GFG {
	public static void main(String[] args) {

		// Creating a LinkedList of Character type
		LinkedList<Character> vowels = new LinkedList<>();

		// Inserting some Character values to our LinkedList
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		// LinkedList after insertions: ['a', 'e', 'i', 'o', 'u']

		// calling the function to iterate our LinkedList
		iterateUsingWhileLoop(vowels);
	}

	// Function to iterate our LinkedList using while loop
	public static void iterateUsingWhileLoop(LinkedList<Character> vowels){

		System.out.print("Iterating the LinkedList using while loop : ");

		int i=0;
		
		while(i<vowels.size()){
			System.out.print(vowels.get(i) + " ");
			i++;
		}

	}
}
