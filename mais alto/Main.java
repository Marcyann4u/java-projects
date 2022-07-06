import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    float h = 0f, hMaior =0f;
	    System.out.println("Informe as alturas:");
	    do{
	        h = sc.nextFloat();
	        if(hMaior < h){
	            hMaior = h;
	        }
	    }while(h != 0f);
	    System.out.printf("Altura pessoa mais alta: %.2f",hMaior);
        sc.close();
    }
}

