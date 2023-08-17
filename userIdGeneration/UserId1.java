package userIdGeneration;
/*The user-id will be = First Letter of the longer name + Entire word of the smaller name 
 * + Digit at position N in the PIN When traversing from RIGHT to LEFT
+ Digit at position N in the PIN when traversing from LEFT to RIGHT.*/
import java.util.Scanner;
public class UserId1 {
	
	
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
	if(input1.length()>input2.length())res+=input1.charAt(0)+input2;
	else res+=input2.charAt(0)+input1;
	}
	else{
	if(input1.compareTo(input2)<=0)res+=input2.charAt(0)+input1;
	else res+=input1.charAt(0)+input2;
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
