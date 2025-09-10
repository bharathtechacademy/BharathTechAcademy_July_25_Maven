package functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class TestClass {

	public static void main(String[] args) {
		FunctionalInterfaces fi = (a,b) -> a+b;
		System.out.println(fi.addition(10,20));	
		
		
		BiFunction<Integer,Integer,Integer> bi = (a,b) -> a+b;
		System.out.println(bi.apply(10, 20));
		
		Predicate<String> prd = s -> s.isEmpty();
		System.out.println(prd.test("Hello"));
		
		BiFunction<Double,Integer,Double> interest = (a,b) -> a*b/100;
		
	}

}
