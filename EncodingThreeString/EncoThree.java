package EncodingThreeString;

	import java.io.*;
	import java.util.*;



	 
		public  class EncoThree{
			public final String output1;
			public final String output2;
			public final String output3;

			public EncoThree(String out1, String out2, String out3) {
				output1=out1;
				output2=out2;
				output3=out3;
			}
		
		public static EncoThree encodeThreeStrings(String input1, String input2, String input3) {//John Johny Janardhan
			String[] str1=divideString(input1);
			String[] str2=divideString(input2);
			String[] str3=divideString(input3);

			String in1=str1[0]+str2[1]+str3[2];
			String in2=str1[1]+str2[2]+str3[0];
			String in3=str1[2]+str2[0]+str3[1];
			/*
			 * System.out.println(in1); System.out.println(in2); System.out.println(in3);
			 */
			String fstr=toggleString(in3);
			System.out.println();

			EncoThree res=new EncoThree(in1,in2,fstr);
			return res;
		}
		public static String[] divideString(String input) {
			int rem=input.length()%3;//1 //2 //0
			int div=input.length()/3;//1 //1 //2
			String first=null;
			String middle=null;
			String last=null;

			if(rem==1) {
				first=input.substring(0,div);//J 
				middle=input.substring(first.length(),first.length()+div+rem);//oh
				last=input.substring(first.length()+middle.length(),input.length());//n
			}
			if(rem==2) {
				first=input.substring(0,div+1);//Jo
				middle=input.substring(first.length(),first.length()+div);//h
				last=input.substring(first.length()+middle.length(),input.length());//ny
			}
			if(rem==0) {
				first=input.substring(0,div);//Jan
				middle=input.substring(first.length(),first.length()+div);//ard
				last=input.substring(first.length()+middle.length(),input.length());//han
			}
			return new String[] {first,middle,last};//Jan ard han
		}
		public static String toggleString(String str) {
			char[] ch=str.toCharArray();
			String s="";
			for(int i=0;i<ch.length;i++) {
				if(Character.isLowerCase(ch[i])){
					s=s+Character.toUpperCase(ch[i]);
				}
				if(Character.isUpperCase(ch[i])) {
					s=s+Character.toLowerCase(ch[i]);
				}
			}
			return s;
		}
		public static void main(String[] args) {
			//System.out.println(encodeThreeStrings("John","Johny","Janardhan"));
			EncoThree res1=encodeThreeStrings("John","Johny","Janardhan");
			System.out.println(res1.output1+","+res1.output2+","+res1.output3);

		}
	}


