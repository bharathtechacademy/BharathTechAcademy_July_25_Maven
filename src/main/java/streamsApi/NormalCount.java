package streamsApi;

import java.util.List;

public class NormalCount {

	public static void main(String[] args) {
		// 10, 20,30,40,50 
		List<Integer> numbers = List.of(10, 20,30,40,50);
		
		int count = 0;
		
		for (int num : numbers) {
			
			if(num > 25) {
				count++;
			}
		}
		
		System.out.println("Total values having more than 25 are :"+count);

	}

}
