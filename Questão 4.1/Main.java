import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int ano = sc.nextInt();
        if(ano > 1900 && ano <= 2000){
            System.out.println("Está dentro do século 20");
        }else{
            System.out.println("Não é século 20");
        }
	}
}