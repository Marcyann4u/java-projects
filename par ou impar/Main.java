import java.util.Scanner;
public class main {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
       System.out.println("Par ou Impar");
       int num1 = sc.nextInt();
       sc.close();
       if(num1 % 2 == 0)
           System.out.println(num1 + " e par");
       else
           System.out.println(num1 + " e impar");
   }
}
