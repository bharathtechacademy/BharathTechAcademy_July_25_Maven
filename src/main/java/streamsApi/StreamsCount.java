package streamsApi;

import java.util.List;

public class StreamsCount {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 20,30,40,50);
		long count = numbers.stream().filter(x-> x>25).count();
		System.out.println("Total values having more than 25 are :"+count);
	}

}
