package loopStatements;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratorInJava {

	// Iterator : It's a method to iterate over a collection of elements.

	public static void main(String[] args) {

		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("John");
		empNamesLinkedHashSet.add("Sony");

		Iterator<String> iterator = empNamesLinkedHashSet.iterator();

		while (iterator.hasNext()) {
			String empName = iterator.next();
			System.out.println(empName);
		}

	}

}
