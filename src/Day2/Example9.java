package Day2;

public class Example9 {
	public static void main(String[] args) {
		String str="Hello";
		int length=str.length();
		char[]ch= str.toCharArray();
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
		if(ch[i]==ch[j]) {
			System.out.println("Duplicate elements in the string:"+ch[j]);
			break;
		}
	}
}
}
}