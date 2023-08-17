package fixTheFormula;

	import java.util.LinkedList;
    import java.util.Scanner;
    public class FixFormula {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println(mathop(sc.nextLine()));
            sc.close();
        }

        public static int mathop(String input1) {
            LinkedList<Integer>digit=new LinkedList<Integer>();
            LinkedList<Character>op=new LinkedList<Character>();
            for(char c:input1.toCharArray()){
                if(c>='0'&&c<='9')digit.add(c-48);//"Fo+23the3*like2+" 2 3 3 2
                else if(c=='/'||c=='*'||c=='-'||c=='+')op.add(c);//+ * +
            }
            for(int i=1;i<digit.size();i++){//size=4 1 2 3
                switch (op.get(i-1)) {//+ * +
                    case '+':				//2 5 3 2// 2 5 15 2
                        digit.set(i, digit.get(i-1)+digit.get(i));//1,2+3->5//1,5//3,15+2//3,17
                        break;
                    case '-':
                        digit.set(i, digit.get(i-1)-digit.get(i));
                        break;
                    case '/':
                        digit.set(i, digit.get(i-1)/digit.get(i));
                        break;
                    case '*':
                        digit.set(i, digit.get(i-1)*digit.get(i));//2,5*3->15//2,15
                        break;
                }
            }
            return digit.getLast();//17
        }
    }


