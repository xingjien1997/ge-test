import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class GeTest {

	public static void main(String[] args) {
		int [] arr = { -1, -3 , 2, 3, 4, 5, 6, 7, 8, 9, 18 };
		
		//Q1
		System.out.println("The sum of the two largest integer numbers in a given array: " + sumOfTwoLargestElements(arr));
		//Q2
		System.out.println("The integer number in given array that is closest to zero: " + getClosestToZero(arr));
		//Q3
		long start = System.currentTimeMillis();
		calculate();
		long end = System.currentTimeMillis();
		System.out.println("Finish Time (milliseconds): " + (end-start));
		
		//SQL Question Part
		//Q2
		//select * from TABLE where quantity > X order by order_date DESC;
		//Q3
		//select customer_name ,COUNT(order_id) as ORDERS_MADE from TABLE group by customer_name;
	}

	
	public static int sumOfTwoLargestElements(int[] a) {
		Arrays.sort(a);
		return a[a.length-1] + a[a.length-2];
	}
	
	public static int getClosestToZero(int[] a) {
		Arrays.sort(a);
		int closerToZero = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				closerToZero = a[i];
				break;		
			}
		}
		return closerToZero;
	}
	
	public static void calculate() {
		int index = 1;
		
		for (int num = 1; index <= 1500; num++) {
			int number = num;
			ArrayList<Integer> res = new ArrayList<Integer>();
			while(number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
				if (number % 2 == 0) {
					number = number / 2;
					res.add(2);
				} else if (number % 3 == 0) {
					number = number / 3;
					res.add(3);
				} else if (number % 5 == 0) {
					number = number / 5;
					res.add(5);
				}
			}
			
			if (number == 1 && !res.isEmpty()) {
				System.out.println(num + " : " + res);
				index++; //one print per result; loop until 1.5k
			}
		}
	}
}





