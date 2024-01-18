package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the array size: ");
		int arrSize=sc.nextInt();
		int[]arr=new int[arrSize];
		System.out.println("please enter the array values:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("input"+Arrays.toString(arr));
		
		int minimum=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(minimum>arr[i]) {
				minimum=arr[i];
		}
		}
		System.out.println("minimum"+minimum);
		sc.close();
	}
}
