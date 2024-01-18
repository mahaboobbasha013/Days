package Day1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		//maximize in the array
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the array size: ");
		int arrSize=scanner.nextInt();
		
		int[]arr=new int[arrSize];
		
		System.out.println("please enter the array values: ");
		for(int i=0;i<arrSize;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("input"+Arrays.toString(arr));
		int largestnumber=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(largestnumber<arr[i]) {
				largestnumber=arr[i];
			}
		}
		System.out.println("output:"+largestnumber);
scanner.close();
}
}