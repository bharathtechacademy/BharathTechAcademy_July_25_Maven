package streamsApi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 3, 9, 13, 37, 46, 58, 91, 94);
		List<Integer> evenNum = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers List :"+evenNum);
	}

}
