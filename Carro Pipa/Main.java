import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Capacidade reservatório [l]:");
	    float capacidade = sc.nextFloat();
		System.out.print("Nível da regulagem [1 - 2 - 3]:");
		int regulagem = sc.nextInt();
		if(regulagem == 1){
		    float tempo = capacidade / 12.5f;
		    System.out.println(tempo + " minutos");
		}else if(regulagem == 2){
		    float tempo = capacidade / 25f;
		    System.out.println(tempo + " minutos");
		}else if(regulagem == 3){
		    float tempo = capacidade / 50f;
		    System.out.println(tempo + " minutos");
		}else System.out.println("Insira um valor de regulagem válido");
		sc.close();
	}
}

