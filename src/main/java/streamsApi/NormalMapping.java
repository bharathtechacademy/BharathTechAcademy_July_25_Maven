package streamsApi;

import java.util.ArrayList;
import java.util.List;

public class NormalMapping {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 3, 9, 13, 37, 46, 58, 91, 94);
		List<Integer> squareOfNumbers = new ArrayList<Integer>();
		
		for(int num : numbers) {
			num = num*num;
			squareOfNumbers.add(num);
		}
		
		System.out.println(squareOfNumbers);

	}

}
