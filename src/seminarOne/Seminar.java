package seminarOne;

import java.util.*;

public class Seminar {
	public static void main(String[] args) throws Exception {
//		System.out.println("Factorial of 4 is: " + factorial(4));
//		System.out.println("Factorial of 4 recursive is: " + factorialRecursive(4));
		
		
//		double[] arr = generateArray(1, 4, 5);
//		System.out.println("RANDOM ARRAY: ");
//		printArray(arr);
//		System.out.println("MAX: " + getMax(arr));
//		System.out.println("MIN: " + getMin(arr));
//		System.out.println("MEAN: " + getMean(arr));
//		bubbleSort(arr);
//		System.out.println("SORTED ARRAY: ");
//		printArray(arr);
		
//		double[][] matrix = generateMatrix(3);
//		printMatrix(matrix);
		
		
//		double[] stats = coinFlip(10);
//		System.out.println("NHEADS: " + stats[0]);
//		System.out.println("NTAILS: " + stats[1]);
//		System.out.println("RATIO: " + stats[2]);
		
		
//		int[] stats = rollDice(10);
//		for(int i = 0; i < stats.length; i++) {
//			System.out.println((i + 1) + "WAS THROWN: " + stats[i] + " TIMES" );
//		}
		
		
//		int res = roll2Dices();
//		System.out.println("THIS TOOK " + res + " ATTEMPTS");
		
		
//		byte[] arr = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
//				32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
//		System.out.println(getTextFromBytes(arr));
		
		
//		pascalsTriangle(4);

		String result = setOperations("[1, 2, 3] + [3, 5, 7]");
		System.out.println(result);
		
		
		
	}
	
	public static boolean factorialCheck(int N) {
		return (N <= 1);
	}
	
	// Factorial using for loop	
	public static int factorial(int N) {
		if(factorialCheck(N)) {
			return 1;
		}
		int product = 1;
		for(int i=1; i<=N; i++) {
			product *= i;
		}
		return product;
	}
	
	// Factorial using recursion	
	public static int factorialRecursive(int N) {
		if(factorialCheck(N)) {
			return 1;
		}
		return N * factorialRecursive(N - 1);
	}
	
	public static double[] generateArray(double min, double max, int N) throws Exception {
		if(N < 1 || min > max) throw new Exception("Wrong input data...");
		double[] arr = new double[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Math.random() * (max - min) + min;
		}
		return arr;
	}
	
	public static void printArray(double[]arr) {
		System.out.print("[ ");
		for(double num: arr) {
			System.out.print(num + " ");
		}
		System.out.println("]");
	}
	
	public static double getMin(double[] arr) {
		double min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static double getMax(double[] arr) {
		double max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] System.out.println(coin + " ");> max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static double getMean(double[] arr) {
		double total = 0;
		for(double num: arr) {
			total += num;
		}
		return total / arr.length;
	}
	
	public static void bubbleSort(double[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					double temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static double[][] generateMatrix(int N) throws Exception {
		if(N < 1) throw new Exception("N < 1");
		final double min = 1;
		final double max = 10;
		double[][] arr = new double[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = Math.random() * (max - min) + min;
			}
		}
		return arr;
	}
	
	public static void printMatrix(double[][] matrix) {
		for(double[] arr: matrix) {
			System.out.println();
			for(double num: arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	public static double[] coinFlip(int N) {
		double[] stats = new double[3];
		for(int i = 0; i < N; i++) {
			int coin = (int)(Math.random() * 2);
			stats[coin] += 1;
		}
		stats[2] = stats[0] / stats[1];
		return stats;
	}
	
	public static int randomDiceValue() {
		return (int)(Math.random() * 6 + 1);
	}
	
	public static int[] rollDice(int N) {
		int[] stats = new int[6];
		for(int i = 0; i < N; i++) {
			int result = (int)(Math.random() * 6 + 1);
			stats[result - 1] += 1;
		}
		return stats;
	}
	
	public static int roll2Dices() {
		int tries = 0;
		int diceOne, diceTwo;
		
		while(true) {
			tries++;
			diceOne = randomDiceValue();
			diceTwo = randomDiceValue();
			System.out.println("ATTEMPT " + tries + ": " + diceOne + " AND " + diceTwo);
			if(diceOne == 6 && diceTwo == 6) {
				break;
			}
		}
		return tries;
	}
	
	public static String getTextFromBytes(byte[] array) {
		StringBuilder word = new StringBuilder();
		for(byte c: array) {
			word.append((char)c);
		}
		return word.toString();
	}
	
	public static void pascalsTriangle(int level) {
		System.out.print("[ ");
		for(int i = 0; i <= level; i++) {
			int result = (factorial(level) / (factorial(i) * (factorial(level - i))));
			System.out.print(result + " ");
		}
		System.out.println("]");
	}
	
	public static String setOperations(String input) {
		
		boolean union = false;
		boolean intersection = false;
		boolean symDiff = false;
		
		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();
		
		for(int i =0; i < input.length(); i++) {
			
			char c = input.charAt(i);
			
			if(c == '+') {
				union = true;
			}
			else if(c == '*') {
				intersection = true;
			}
			else if(c == '-') {
				symDiff = true;
			}
//			
			if(Character.isDigit(c)) {
				StringBuilder sb = new StringBuilder();
				while(Character.isDigit(input.charAt(i))) {
					sb.append(input.charAt(i));
					i++;
				}
				if(!(union || intersection || symDiff)) {
					left.add(Integer.parseInt(sb.toString()));
				} else {
					right.add(Integer.parseInt(sb.toString()));
				}
			}
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		
		if(union) {
			for(int num: right) {
				if(!left.contains(num)) {
					left.add(num);
				}
			}
			result = left;
		} 
		else if(intersection) {
			for(int num: right) {
				if(left.contains(num)) {
					result.add(num);
				}	
			}
		} 
		else if(symDiff) {
			for(int num: left) {
				if(!right.contains(num)) {
					result.add(num);
				}	
			}
		}
		
		return result.toString();
	}
	
	
	
	
	
	
}
