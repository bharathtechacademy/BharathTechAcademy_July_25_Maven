package collectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsFramework {
	
	//Arrays in Java.
	
	// Array is a data type , that can store multiple values with similar data type together at one place.

	public static void main(String[] args) {
		
		/**** Challenges with Arrays ****/

		String [] empNames = new String[3]; // Syntax to create an array in Java
		empNames[0] = "Bharath"; // Syntax to assign a value to an array element
		empNames[1] = "ABC";
		empNames[2] = "XYZ";	
		System.out.println(empNames.length);// Syntax to get the size of an array
		System.out.println(empNames[0]);// Syntax to access an array element
		
		// 1. Arrays are fixed in size
		// 2. Memory will be allocated at the beginning of creating array / static memory allocation
		// 3. Array allows similar data types only
		// 4. Modifications also not allowed
		
		/***********Collections Framework in Java************/
		
		// Advantages
		
		// 1. Collections are dynamic in size. that means , no need to declare the size at the beginning
		// 2. Memory will be allocated dynamically based on the data that we are going to add/store
		// 3. Collections can hold different data types together
		// 4. Modifications are allowed
		
		// Major Collection Categories ==> List , Set , Map 
		
		// List ==> ArrayList , LinkedList		
		// 1. List can store multiple values with similar data type together at one place by allocating the memory dynamically
		// 2. List allows duplicate values
		// 3. List can follow dynamic memory allocation
		// 4. List allows modifications
		
		// Set ==> HashSet , LinkedHashSet , TreeSet		
		// 1. Set can store multiple values with similar data type together at one place by allocating the memory dynamically
		// 2. Set Won't allow duplicate values
		// 3. Set can follow dynamic memory allocation
		// 4. Set allows modifications		
		
		// Map ==> HashMap , LinkedHashMap , TreeMap, Hashtable
		// 1. Map can store multiple values with different data type together in the form of Key and Value at one place by allocating the memory dynamically
		// 2. Map can follow dynamic memory allocation
		// 3. Map allows modifications
		// 4. Map won't allow duplicate keys, but allows duplicate values
		
		// Each and every collection concept or each and every collection class will differ based on the way that we are going to allocate the memory, 
		 //the way that we are going to allow null values, the way that we are going to arrange the values while storing.
		
		// 1. Memory allocation
		// 2. Null values
		// 3. Arranging the values while storing
		
		//collections allows only dynamic datatypes (primitive data types are not allowed)
		
		/****************WRAPPER CLASSES*****************/
		// Java provides wrapper classes to convert primitive data types into dynamic data types.
		// Wrapper classes are used to convert primitive data types into dynamic data types.
		
		// byte ==> Byte
		// short ==> Short
		// int ==> Integer
		// long ==> Long
		// float ==> Float
		// double ==> Double
		// char ==> Character
		// boolean ==> Boolean
		
//		Hash  ==> Random
//		Linked ==> Link each other ==> Insertion Order
//		Tree ==> Roots to Branches ==> Ascending (null)
		
		
		/************************  ArrayList  *************************/
		System.out.println("************************  ArrayList  *************************");			
		
		// Syntax to Initialize an ArrayList:  List<DataType> variable = new ArrayList<DataType>();  
		// Syntax to add data: variable.add(value);
		// Syntax to remove data: variable.remove(value);
		// Syntax to get data: variable.get(index);
		// Syntax to get size: variable.size();
		
		// ArrayList follow insertion order, which means the order in which we add the values will be maintained while printing.
		// ArrayList allows duplicate values, which means we can add the same value multiple times.
		// ArrayList allows null values, which means we can add null value to the ArrayList.
		
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("John");
		empNamesArrayList.add("Sony");
		empNamesArrayList.add("Bharath"); // Adding duplicate value
		empNamesArrayList.add("Sarath");
		empNamesArrayList.add(null); // Adding null value
		empNamesArrayList.remove("John"); // Removing a value
		
		System.out.println("Size of ArrayList: " + empNamesArrayList.size()); // Getting the size of ArrayList
		System.out.println("First element in ArrayList: " + empNamesArrayList.get(0)); // Accessing the first element in ArrayList
		System.out.println("All elements in ArrayList: " + empNamesArrayList); // Printing all elements in ArrayList
		
		
		/************************  LinkedList  *************************/
		
		System.out.println("************************  LinkedList  *************************");			
		
		// Syntax to Initialize an LinkedList:  List<DataType> variable = new LinkedList<DataType>();  
		// Syntax to add data: variable.add(value);
		// Syntax to remove data: variable.remove(value);
		// Syntax to get data: variable.get(index);
		// Syntax to get size: variable.size();
		
		// LinkedList follow insertion order, which means the order in which we add the values will be maintained while printing.
		// LinkedList allows duplicate values, which means we can add the same value multiple times.
		// LinkedList allows null values, which means we can add null value to the LinkedList.
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("John");
		empNamesLinkedList.add("Sony");
		empNamesLinkedList.add("Bharath"); // Adding duplicate value
		empNamesLinkedList.add("Sarath");
		empNamesLinkedList.add(null); // Adding null value
		empNamesLinkedList.remove("John"); // Removing a value
		
		System.out.println("Size of LinkedList: " + empNamesLinkedList.size()); // Getting the size of LinkedList
		System.out.println("First element in LinkedList: " + empNamesLinkedList.get(0)); // Accessing the first element in LinkedList
		System.out.println("All elements in LinkedList: " + empNamesLinkedList); // Printing all elements in LinkedList
		
		/************************  HashSet  *************************/
		
		System.out.println("************************  HashSet  *************************");			
		
		// Syntax to Initialize an HashSet:  Set<DataType> variable = new HashSet<DataType>();  
		// Syntax to add data: variable.add(value);
		// Syntax to remove data: variable.remove(value);
		// Syntax to get size: variable.size();
		
		// HashSet follow random order
		// HashSet won't allows duplicate values
		// HashSet allows null values
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("John");
		empNamesHashSet.add("Sony");
		empNamesHashSet.add("Bharath"); // Adding duplicate value
		empNamesHashSet.add("Sarath");
		empNamesHashSet.add(null); // Adding null value
		empNamesHashSet.remove("John"); // Removing a value
		
		System.out.println("Size of HashSet: " + empNamesHashSet.size()); // Getting the size of HashSet
		System.out.println("All elements in HashSet: " + empNamesHashSet); // Printing all elements in HashSet
		
		/************************  LinkedHashSet  *************************/
		
		System.out.println("************************  LinkedHashSet  *************************");			
		
		// Syntax to Initialize an LinkedHashSet:  Set<DataType> variable = new LinkedHashSet<DataType>();  
		// Syntax to add data: variable.add(value);
		// Syntax to remove data: variable.remove(value);
		// Syntax to get size: variable.size();
		
		// LinkedHashSet follow Insertion order
		// LinkedHashSet won't allows duplicate values
		// LinkedHashSet allows null values
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("John");
		empNamesLinkedHashSet.add("Sony");
		empNamesLinkedHashSet.add("Bharath"); // Adding duplicate value
		empNamesLinkedHashSet.add("Sarath");
		empNamesLinkedHashSet.add(null); // Adding null value
		empNamesLinkedHashSet.remove("John"); // Removing a value
		
		System.out.println("Size of LinkedHashSet: " + empNamesLinkedHashSet.size()); // Getting the size of LinkedHashSet
		System.out.println("All elements in LinkedHashSet: " + empNamesLinkedHashSet); // Printing all elements in LinkedHashSet
		
		/************************  TreeSet  *************************/
		
		System.out.println("************************  TreeSet  *************************");			
		
		// Syntax to Initialize an TreeSet:  Set<DataType> variable = new TreeSet<DataType>();  
		// Syntax to add data: variable.add(value);
		// Syntax to remove data: variable.remove(value);
		// Syntax to get size: variable.size();
		
		// TreeSet follow Ascending order
		// TreeSet won't allows duplicate values
		// TreeSet won't allow null values
		
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Bharath");
		empNamesTreeSet.add("John");
		empNamesTreeSet.add("Sony");
		empNamesTreeSet.add("Bharath"); // Adding duplicate value
		empNamesTreeSet.add("Sarath");
//		empNamesTreeSet.add(null); // Adding null value
		empNamesTreeSet.remove("John"); // Removing a value
		
		System.out.println("Size of TreeSet: " + empNamesTreeSet.size()); // Getting the size of TreeSet
		System.out.println("All elements in TreeSet: " + empNamesTreeSet); // Printing all elements in TreeSet
		
		
		/************************  HashMap  *************************/
		
		System.out.println("************************  HashMap  *************************");			
		
		// Syntax to Initialize an HashMap:  Map<Key, Value> variable = new HashMap<Key, Value>();  
		// Syntax to add data: variable.put(key,value);
		// Syntax to remove data: variable.remove(key);
		// Syntax to get data: variable.get(key);
		// Syntax to get size: variable.size();
		
		// HashMap follow Random order of Keys
		// HashMap won't allows duplicate Keys, but allows duplicate Values
		// HashMap will allow null values and null keys
		
		HashMap<String, Integer> empNamesHashMap = new HashMap<String,Integer>();
		empNamesHashMap.put("Bharath",1234);
		empNamesHashMap.put("John",1234);// Adding duplicate value
		empNamesHashMap.put("Sony",1236);
		empNamesHashMap.put("Bharath",1237); // Adding duplicate key
		empNamesHashMap.put("Sarath",1238);
		empNamesHashMap.put("Tom",null); // Adding null value
		empNamesHashMap.put(null,1239); // Adding null key
		empNamesHashMap.remove("Sony"); // Removing a value
		
		System.out.println("Size of HashMap: " + empNamesHashMap.size()); // Getting the size of HashMap
		System.out.println("All elements in HashMap: " + empNamesHashMap); // Printing all elements in HashMap
		
		/************************  LinkedHashMap  *************************/
		
		System.out.println("************************  LinkedHashMap  *************************");			
		
		// Syntax to Initialize an LinkedHashMap:  Map<Key, Value> variable = new LinkedHashMap<Key, Value>();  
		// Syntax to add data: variable.put(key,value);
		// Syntax to remove data: variable.remove(key);
		// Syntax to get data: variable.get(key);
		// Syntax to get size: variable.size();
		
		// LinkedHashMap follow Insertion order of Keys
		// LinkedHashMap won't allows duplicate Keys, but allows duplicate Values
		// LinkedHashMap will allow null values and null keys
		
		Map<String, Integer> empNamesLinkedHashMap = new LinkedHashMap<String,Integer>();
		empNamesLinkedHashMap.put("Bharath",1234);
		empNamesLinkedHashMap.put("John",1234);// Adding duplicate value
		empNamesLinkedHashMap.put("Sony",1236);
		empNamesLinkedHashMap.put("Bharath",1237); // Adding duplicate key
		empNamesLinkedHashMap.put("Sarath",1238);
		empNamesLinkedHashMap.put("Tom",null); // Adding null value
		empNamesLinkedHashMap.put(null,1239); // Adding null key
		empNamesLinkedHashMap.remove("Sony"); // Removing a value
		
		System.out.println("Size of LinkedHashMap: " + empNamesLinkedHashMap.size()); // Getting the size of LinkedHashMap
		System.out.println("All elements in LinkedHashMap: " + empNamesLinkedHashMap); // Printing all elements in LinkedHashMap
		
		/************************  TreeMap  *************************/
		
		System.out.println("************************  TreeMap  *************************");			
		
		// Syntax to Initialize an TreeMap:  Map<Key, Value> variable = new TreeMap<Key, Value>();  
		// Syntax to add data: variable.put(key,value);
		// Syntax to remove data: variable.remove(key);
		// Syntax to get data: variable.get(key);
		// Syntax to get size: variable.size();
		
		// TreeMap follow Insertion order of Keys
		// TreeMap won't allows duplicate Keys, but allows duplicate Values
		// TreeMap will allow null values But it won't allow null keys
		
		Map<String, Integer> empNamesTreeMap = new TreeMap<String,Integer>();
		empNamesTreeMap.put("Bharath",1234);
		empNamesTreeMap.put("John",1234);// Adding duplicate value
		empNamesTreeMap.put("Sony",1236);
		empNamesTreeMap.put("Bharath",1237); // Adding duplicate key
		empNamesTreeMap.put("Sarath",1238);
		empNamesTreeMap.put("Tom",null); // Adding null value
//		empNamesTreeMap.put(null,1239); // Adding null key
		empNamesTreeMap.remove("Sony"); // Removing a value
		
		System.out.println("Size of TreeMap: " + empNamesTreeMap.size()); // Getting the size of TreeMap
		System.out.println("All elements in TreeMap: " + empNamesTreeMap); // Printing all elements in TreeMap
		
		/************************  Hashtable  *************************/
		
		System.out.println("************************  Hashtable  *************************");			
		
		// Syntax to Initialize an Hashtable:  Map<Key, Value> variable = new Hashtable<Key, Value>();  
		// Syntax to add data: variable.put(key,value);
		// Syntax to remove data: variable.remove(key);
		// Syntax to get data: variable.get(key);
		// Syntax to get size: variable.size();
		
		// Hashtable follow Random order of Keys
		// Hashtable won't allows duplicate Keys, but allows duplicate Values
		// Hashtable won't allow null values and null keys
		
		Map<String, Integer> empNamesHashtable = new Hashtable<String,Integer>();
		empNamesHashtable.put("Bharath",1234);
		empNamesHashtable.put("John",1234);// Adding duplicate value
		empNamesHashtable.put("Sony",1236);
		empNamesHashtable.put("Bharath",1237); // Adding duplicate key
		empNamesHashtable.put("Sarath",1238);
//		empNamesHashtable.put("Tom",null); // Adding null value
//		empNamesHashtable.put(null,1239); // Adding null key
		empNamesHashtable.remove("Sony"); // Removing a value
		
		System.out.println("Size of Hashtable: " + empNamesHashtable.size()); // Getting the size of Hashtable
		System.out.println("All elements in Hashtable: " + empNamesHashtable); // Printing all elements in Hashtable
		
		
		}

}
