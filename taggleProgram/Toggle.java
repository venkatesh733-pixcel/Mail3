package taggleProgram;
	
	import java.util.*;
	public class Toggle {
		public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String input1=sc.nextLine();
	        int input2=sc.nextInt();
	        System.out.println(toggle(input1,input2));
	        sc.close();
	    }

	    public static String toggle(String input1, int input2) {

	        String r="";
	        for(char c:input1.toCharArray()){//toggling
	            if(c>='a'&&c<='z')r+=(""+(char)((int)c-32));
	            else if(c>='A'&&c<='Z')r+=(""+(char)((int)c+32));
	            else r+=(""+c);
	        }
	        input1="";
	        if(input2==0)//even
	            for(int i = 0; i < r.length(); i+=2)
	                input1+=r.charAt(i);
	        else if(input2==1)//odd
	            for(int i = 1; i < r.length(); i+=2)
	                input1+=r.charAt(i);
	        else
	            for(int i = r.length()-1; i>=0; i--)
	                input1+=r.charAt(i);
	        return input1;
	    }
	}

