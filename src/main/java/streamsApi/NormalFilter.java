package streamsApi;

import java.util.ArrayList;
import java.util.List;

public class NormalFilter {

	public static void main(String[] args) {
		// 1,3,9,13,37,46,58,91,94 --> Separate even numbers from the list
		
		// int[] num = {1, 3, 9, 13, 37, 46, 58, 91, 94};
		
		List<Integer> numbers = List.of(1, 3, 9, 13, 37, 46, 58, 91, 94);
		
		List<Integer> evenNum = new ArrayList<Integer>();
		
		for (int num : numbers) {
			
			if(num % 2 == 0) {
				evenNum.add(num);
			}
		}

		System.out.println("Even Numbers List :"+evenNum);

	}

}
