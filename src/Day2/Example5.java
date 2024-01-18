package Day2;
public class Example5 {
	public static void main(String[] args) {
		int n=13;
//		for(int i=2;i<n;i++) {
			int count=0;
			for(int j=2;j<n/2;j++) {
				if(n%j==0) {
					count++;
					break;
				}
//			}
			}
			if(count==0) {
				System.out.println("prime number");
			}else {
				System.out.println("not prime number");
			}
		}
	}

