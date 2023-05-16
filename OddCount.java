package datad4;

import java.util.Arrays;
import java.util.HashMap;

public class OddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 6, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };

		findOddtimeAppear(array);

	}

	public static void findOddtimeAppear(int[] array) {
		HashMap<Integer, Integer> countNumber = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (countNumber.containsKey(array[i])) {
				int num = countNumber.get(array[i]);// If element already present, increase the count of that element
				countNumber.put(array[i], ++num);
			} else {
				countNumber.put(array[i], 1);// if the element is not present, put into hashmap and count add 1
			}
		}
		for (Integer a : countNumber.keySet()) {
			if (countNumber.get(a) % 2 != 0) {
				System.out.println("Numbers appear odd times: " + a + " - time appear: " + countNumber.get(a));
			}
		}
	}
}
