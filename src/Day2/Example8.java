package Day2;

import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		int n,arm=0,rem,c;
		System.out.println("Enter any number ");
		Scanner scanner=new Scanner(System.in);
		int n1=scanner.nextInt();
		c=n1;
		while(n1>0) {
		rem=n1%10;
		arm=(rem*rem*rem)+arm;
		n1=n1/10;
		}
		if(c==arm) {
			System.out.println("armstrong number:");
		}else {
			System.out.println("not armstrong number:");
		}
		scanner.close();
	}
}