import java.util.Scanner;
public class Main {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
       System.out.println("Insira dois valores inteiros");
       int num1 = sc.nextInt(), num2 = sc.nextInt();
       sc.close();
       int numTroca = num1;
       System.out.println("Verificaremos se o valor de " + num1 + " e maior que "+num2);
       System.out.println("Se este for maior, trocaremos o seu valor para a segunda variavel");
       if(num1 > num2){
           System.out.println("Inicializando processo de baldeacao de variaveis...");
           num1 = num2;
           num2 = numTroca;
           System.out.println("Agora a primeira variavel tem " + num1);
           System.out.println("Agora a segunda variavel tem " + num2);
       }else //sem chave porque é só 1 linha
           System.out.println("Verificamos que o valor de " + num1 + " e menor que "+num2);
   }
}

