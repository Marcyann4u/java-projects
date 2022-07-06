import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor da parcela inteira: ");
        double parcela = sc.nextDouble();
        System.out.print("Insira o valor do juros por dia: ");
        double juros = sc.nextDouble();
        System.out.print("Quantos dias atrasou: ");
        double dias = sc.nextDouble();
        sc.close();
        double calcJuros = juros * dias;
        double totalPagar = calcJuros + parcela;
        System.out.println("valor do juros: "+calcJuros);
        System.out.println("parcela total: "+totalPagar);
	}
}

