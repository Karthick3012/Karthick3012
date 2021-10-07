package week1day2;

public class ReverseEven {

	public static void main(String[] args) {
		
		String str = "I am a software tester";
		String word[] = str.split(" ");
		for(int i=0;i<word.length;i++) {
			if(i%2==1) {
				char ch[] = word[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--) {
					System.out.println(ch[j]);
				}
				System.out.println(" ");
			}
			else {
				System.out.println(word[i]+" ");
			}
		}
	}
}