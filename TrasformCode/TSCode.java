package TrasformCode;

public class TSCode {
	
public static void main(String[] args) {
        
		int []i= {123456,1234567};
		//int []i= {12};
		
		String []s=Transfrorm(i);
		for(String ss:s)System.out.println(ss);
	}
	
	public static  String[] Transfrorm(int []input1) {
		String[] res=new String[input1.length];
		for(int i=0;i<input1.length;i++) {
			res[i]=res(input1[i]);
		}
		return res;
	}
	public static String res(int i) {
		String res="";
		
		if((""+i).length()==6)res+="C";
		else res+="W";
		
		if(i==0)res+="Z";
		else if(i==1)res+="O";
		else if(isPrime(i))res+="P";
		else res+="N";
		
		res+=sum(i);
		if(i%2==0)res+=i/2;
		else res+=(i-1)/2;
		
		return res;
			
	}
	public static int sum(int i) {
		int sum=0;
		do {
			sum=0;
			while(i!=0){
				int t=i%10;
				i/=10;
				sum+=t;
			}
			i=sum;
		}while(sum>9);
		return sum;
	}
	
	public static boolean isPrime(int a) {
		if(a<2)return false;
		for(int i=2;i<=a/2;i++)if(a%i==0)return false;
		return true;
	}

}
