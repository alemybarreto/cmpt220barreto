package lab4;

import java.util.Arrays;

public class Problem6 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		end(numbers);
		
		System.out.println(Arrays.toString(numbers) + "-1");
		specific(3, 10, numbers);
		specific(7, 100, numbers);
		System.out.println(Arrays.toString(numbers) + "-1");
	}
	
	public static void end(int[] array) {
		for (int i = 0, j = 1; i < 10; i++, j++) {
			array[i] = j;
		}
	}
	
	public static void specific(int pos, int num, int[] array) {
		array[pos] = num;
	}

}
