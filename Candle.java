package datad4;

import java.util.ArrayList;
import java.util.List;

public class Candle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> candles = new ArrayList<Integer>();
		candles.add(4);
		candles.add(1);
		candles.add(3);
		candles.add(4);
		candles.add(5);
		int result = birthdayCakeCandles(candles);
		System.out.println("Number of highest candles are: " + result);
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		int count = 0;
		int highestCandle = candles.get(0);
		for (int i = 0; i < candles.size(); i++) {
			if (candles.get(i) > highestCandle) {
				highestCandle = candles.get(i);
				count = 1;
				System.out.println("The highest candle height is " + candles.get(i));
			} else if (candles.get(i) == highestCandle) {
				count++;
			}
		}
		return count;
	}

}
