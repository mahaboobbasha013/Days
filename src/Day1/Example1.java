package Day1;

public class Example1 {
	public static void main(String[] args) {
		//Duplicate elements in the array
		int[]a= {1,5,7,9,6,5};
		System.out.println("Duplicate elements in array: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
