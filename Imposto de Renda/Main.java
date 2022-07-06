import java.util.Scanner;
public class atvJava {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
       float impostoBruto = sc.nextFloat();
       int dependentes = sc.nextInt();
       float desconto = 1000 * dependentes;
       float faturaTotal = impostoBruto - desconto;
       if(impostoBruto > desconto){
           System.out.println("Valor do desconto dos dependentes: " + desconto);
           System.out.println("Valor do imposto a pagar: " + faturaTotal);
       }else{
           faturaTotal = 0;
           System.out.println("Valor do desconto dos dependentes: "+ desconto);
           System.out.println("Valor do imposto a pagar: " + faturaTotal);
       }

       sc.close();

   }
}
