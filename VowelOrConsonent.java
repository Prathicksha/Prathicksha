import java.util.Scanner;

public class VowelOrConsonent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = scanner.next().charAt(0);
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')){
			System.out.println("Vowel");
		}
		else{
			System.out.println("Consonent");
		}
		scanner.close();
	}
}
