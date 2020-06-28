import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose your preferred operation.");
		System.out.println("a) To find what is ....% of .....");
		System.out.println("b) To find .... is what percent of ....");
		String operation = sc.nextLine();
		System.out.println("Now please enter your first number for the corresponding space.");
		double num1 = sc.nextDouble();
		System.out.println("Now please enter your second number for the corresponding space.");
		double num2 = sc.nextDouble();
		
		if(operation.equals("a")||operation.equals("A")){
			System.out.print("Your final answer is --> ");
			System.out.println(optionA(num1, num2) + " .");
		}
		else if(operation.equals("B")||operation.equals("B")) {
			System.out.print("Your final answer is --> ");
			System.out.println(optionB(num1, num2) + " .");
		}
		else {
			System.out.println("Your input was invalid.");
		}
	}
	
	public static double optionA(double num1, double num2) {
		double answer = num1 * (num2/100);
		return answer;
	}
	public static double optionB(double num1, double num2) {
		double answer = (num1/num2)*100;
		return answer;
	}

}
