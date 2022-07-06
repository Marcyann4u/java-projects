import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final String[] ALIMENTO = {"carne", "peixe", "ave"};
        final double[] PRECO = {0.16, 0.14, 0.12};
        
        int tipoAlimento, continuar;
        double precoTotal = 0, peso;
        System.out.println("Tabela de preços\n1 - Carne - 0,16\n2 - Peixe - 0,14\n3 - Ave - 0,12");
	    System.out.println("\n------------------------");
	    
        do{
            do{
                System.out.print("\nInsira o tipo do alimento: ");
                tipoAlimento = sc.nextInt();
                if (tipoAlimento < 0 || tipoAlimento > 4){
                    System.out.println("Valor inválido");
                }
            }while(tipoAlimento < 0 || tipoAlimento > 4);
            do{
                System.out.print("Insira o peso da "+ ALIMENTO[tipoAlimento - 1]+" em gramas: ");
                peso = sc.nextDouble();
                if (peso < 0){
                    System.out.println("Valor inválido");
                }
            }while(peso < 0);
            double precoAtual = PRECO[(tipoAlimento - 1)] * peso;
            precoTotal += precoAtual;
            System.out.printf("\n"+peso+"g equivale a %.2f reais.\n", precoAtual);
            System.out.println("\nDeseja adicionar mais itens?\n1 - sim\n2 - não");
            continuar = sc.nextInt();
        }while(continuar != 2);
        
        if(precoTotal < 20){
            System.out.println("\nO valor minimo não foi atingido.\nTarifa minima será cobrada.");
            precoTotal = 20;
        }
        System.out.printf("\nTotal a pagar: %.2f",precoTotal);
	}
}
