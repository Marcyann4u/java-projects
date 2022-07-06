import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor da compra:");
		float valorOriginal = sc.nextFloat();
		System.out.println("------------------------------");
		System.out.println("Formas de pagamento");
		System.out.println("1 - A vista");
		System.out.println("2 - Outros");
		System.out.print("Insira a sua forma de pagamento:");
		int formaDeCompra = sc.nextInt();
		System.out.println("------------------------------");
		float desconto;
		if(formaDeCompra == 1){
		    desconto = valorOriginal * .1f;
		    float valorPagar = valorOriginal - desconto;
		    System.out.println(valorOriginal);
		    System.out.println(desconto);
		    System.out.println(valorPagar);
		}else if(formaDeCompra == 2){
		    desconto = valorOriginal * .05f;
		    float valorPagar = valorOriginal - desconto;
		    System.out.println(valorOriginal);
		    System.out.println(desconto);
		    System.out.println(valorPagar);
		}else{
		    System.out.println("Insira uma forma de  pagamento válida.");
		}
		sc.close();
	}
}


