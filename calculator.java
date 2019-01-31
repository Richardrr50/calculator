import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("number1 :");
		int input1 = input.nextInt();
		System.out.println("number2");
		int input2 = input.nextInt();

		System.out.println("de opteling = " + add(input1, input2));

		System.out.println("het verschil = " + subtract(input1, input2));

		System.out.println("het product = " + multply(input1, input2));

		System.out.println("het quotient = " + devide(input1, input2));

		System.out.println("het kwadraat = " + square(input1));

		System.out.println("de exponentie = " + exponentiation(input1, input2));

	}

	public static int add(int numb1, int numb2) {
		int result = numb1 + numb2;
		return result;
	}

	public static int subtract(int number1, int number2) {
		int result = number1 - number2;

		return result;
	}

	public static int multply(int number1, int number2) {
		int answer = 0;

		for (int i = 0; i < number2; i++) {
			answer = number1 + answer;
		}
		return answer;
	}

	public static int devide(int number1, int number2) {

		int answer = 0;

		while (number1 >= number2) {
			number1 = subtract(number1, number2);
			answer++;

		}

		return answer;
	}

	public static int square(int number1) {

		return multply(number1, number1);

	}

	public static int exponentiation(int number1, int number2) {
		// HINT: multiply???
		int answer = 1;
		while (number2 > 0) {
			answer = multply(answer, number1);
			number2--;
		}
		return 0;
	}

}
