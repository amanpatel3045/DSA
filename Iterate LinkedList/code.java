// Java program for iterating the LinkedList
// using For loop

import java.util.LinkedList;

public class GFG {
	public static void main(String[] args)
	{

		// Creating a LinkedList of Integer type
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Inserting some Integer values to our LinkedList
		linkedList.add(40);
		linkedList.add(44);
		linkedList.add(80);
		linkedList.add(9);

		// LinkedList after insertions: [40, 44, 80, 9]

		// Calling the function to iterate our LinkedList
		iterateUsingForLoop(linkedList);
	}

	// Function to iterate the LinkedList using a simple for
	// loop
	public static void
			iterateUsingForLoop(LinkedList<Integer> linkedList)
	{

		System.out.print(
			"Iterating the LinkedList using a simple for loop : ");

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(linkedList.get(i) + " ");
		}
	}
}
