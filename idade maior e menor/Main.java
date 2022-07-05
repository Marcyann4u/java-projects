import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int[] idades = new int[5];
	    int maiorIdade = Integer.MIN_VALUE, menorIdade = Integer.MAX_VALUE;
	    
	    for (int i = 0; i < idades.length; i++){
	        System.out.printf("%dª idade: ", i+1);
	        idades[i] = sc.nextInt();
	        if(maiorIdade < idades[i]){
	            maiorIdade = idades[i];
	        }else if(menorIdade > idades[i]){
	            menorIdade = idades[i];
	        }
	    }
	    System.out.println("---------------");
		System.out.printf("Menor Idade: %d \nMaior Idade: %d", menorIdade, maiorIdade);
	}
}
