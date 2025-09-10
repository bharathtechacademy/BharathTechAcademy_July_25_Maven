package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapping {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 3, 9, 13, 37, 46, 58, 91, 94);
		List<Integer> squareOfNumbers = numbers.stream().limit(3).map(x->x*x).collect(Collectors.toList());
		System.out.println(squareOfNumbers);
		
		List<Integer> numbers2 = List.of(1, 3, 9, 13,3, 37, 46, 58,1, 91, 94);
		List<Integer> uniqueNumbers = numbers2.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueNumbers);
		
		List<Integer> limitedNumbers = numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitedNumbers);
		
		List<Integer> numbers3 = List.of(13, 1, 3, 2, 9, 1);
		List<Integer> sortedNumbers =  numbers3.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
		int sum = numbers3.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
		long multiply = numbers3.stream().reduce(1, (a,b)->a*b);
		System.out.println(multiply);
		
		numbers.stream().forEach(System.out::println);
		
	}

}
