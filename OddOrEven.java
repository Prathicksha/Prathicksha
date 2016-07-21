import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int input=scanner.nextInt();
		if(input>0){
		if(input%2==0){
			System.out.println("Even Number");
		}
		else{
			System.out.println("Odd Number");
		}
		}
		scanner.close();
	}
}
