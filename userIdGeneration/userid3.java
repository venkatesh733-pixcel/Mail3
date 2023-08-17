package userIdGeneration;

/*  The user-id Will be = Last Letter of the smaller name + Entire word In t]
longer name + Digit at position N jn the PIN when traversing the PIN from left
right + Digit at position N In the PIN when traversing the PIN from right to left
*/
import java.util.Scanner;

public class userid3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Fname=sc.nextLine(),Lname=sc.nextLine();
		int pin=sc.nextInt(),pos=sc.nextInt();
		System.out.println(userId(Fname,Lname,pin,pos));
		sc.close();
		}
	
		public static String userId(String input1, String input2, int input3, int input4) {
		
		String res="";
		if(input1.length()!=input2.length()){
		if(input1.length()>input2.length())res+=input2.charAt(input2.length()-1)+input1;
		else res+=input2.charAt(input2.length()-1)+input1;
		}
		else
		{
		if(input1.compareTo(input2)<=0)res+=input2.charAt(input2.length()-1)+input1;
		else res+=input2.charAt(input2.length()-1)+input1;
		}
		String r=""+input3;
		res+=r.charAt(input4-1);
		res+=r.charAt(r.length()-input4);
		return toggle(res);
		}
		public static String toggle(String a){
		String r="";
		for(char c:a.toCharArray()){
		if(Character.isLowerCase(c))r+=Character.toUpperCase(c);
		else if(Character.isUpperCase(c))r+=Character.toLowerCase(c);
		else r+=c;
		}
		return r;
		}

}
