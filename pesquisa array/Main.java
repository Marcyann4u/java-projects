import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lista = new int[6];
		int numPesquisa, pesquisaResult = 0;
		System.out.println("Informe os valores:");
		for(int i = 0; i < lista.length; i++){
		   lista[i] = sc.nextInt(); 
		} 
		System.out.print("Pesquise um número: ");
		numPesquisa = sc.nextInt();
		sc.close();
		for (int i = 0; i < lista.length; i++){
		   if(numPesquisa == lista[i]){
		       System.out.printf("Valor encontrado na posição %d do array\n", i);
		       pesquisaResult = 1;
		   }
		} 
		if(pesquisaResult == 0){
		    System.out.println("Número não encontrado");
		}
	}
}

