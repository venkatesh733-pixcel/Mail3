package StringReverse;

import java.util.Scanner;

public class Strreverse {
	public static void main(String aregs[]) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		int input2=sc.nextInt();
		System.out.println(reverseWordsAndCase(input1,input2));
		sc.close();
		}
	public static String reverseWordsAndCase(String input1,int input2) {
		String[]s=input1.split(" ");
		String res="";
		boolean tr=true;
		
		for(int i=0;i<s.length;i++) {
			if(tr) {
				tr=false;
				res+=new StringBuilder(s[i]).reverse();
			}
			else res+=" "+new StringBuilder(s[i]).reverse();
		}
		
		if(input2==1) {
			String temp=res.toLowerCase();
			res="";
			for(int i=0;i<temp.length();i++) {
				char co=input1.charAt(i);
				char cr=temp.charAt(i);
				if((co>='A'&&co<='Z')&&(cr>='a'&& cr<='z')) res+=(char)(cr-32);
				else res+=temp.charAt(i);
			}
		}
		return res;
	}
	

}
