import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vendas Simples:");
		int tapiocaSimples = sc.nextInt();
		System.out.print("Vendas Gourmet:");
		int tapiocaGourmet = sc.nextInt();
		System.out.print("Investimento ingredientes:");
		int gastos = sc.nextInt();
		sc.close();
		
		int total = tapiocaGourmet + tapiocaSimples;
		int tSimplesTotal = tapiocaSimples * 5;
		int tGourmetTotal = tapiocaGourmet * 8;
		
		int totalVendas = tGourmetTotal + tSimplesTotal;
		
		
		int tLiquido = totalVendas - gastos;
		System.out.println("Total de tapiocas vendidas: "+total);
		System.out.println("Ganhos apenas simples: "+ tSimplesTotal);
		System.out.println("Ganhos apenas gourmet: "+ tGourmetTotal);
		System.out.println("Bruto de vendas: " + totalVendas);
		System.out.println("Liquido: " + tLiquido);
	}
}

