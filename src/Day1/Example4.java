package Day1;

public class Example4 {
	public static void main(String[] args) {
		int[]rr=new int[] {5,4,8,6};
		int sd;
		for (int i = 0; i < rr.length; i++) {
			for (int j = i; j < rr.length; j++) {
				if(rr[i]>rr[j]) {
					sd=rr[i];
					rr[i]=rr[j];
					rr[j]=sd;
				}
			}
		}
		for(int a:rr) {
		System.out.println(a);
	}
	}
}
