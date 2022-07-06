import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        float mediaSemestre = 0f;
        do{
            System.out.print("Insira a media semestral:");
            mediaSemestre = sc.nextFloat();
            if(mediaSemestre < 0f || mediaSemestre > 10f){
                System.out.println("Valor inválido.");
                System.out.println("-------------------------");
            } 
        }while(mediaSemestre < 0f || mediaSemestre > 10f);
            System.out.println("-------------------------");
            if(mediaSemestre < 3f) System.out.println("Reprovado");
            else if(mediaSemestre >= 6f) System.out.println("Aprovado");
            else if(mediaSemestre >= 3f || mediaSemestre < 6f) {
                float notaFinal = 0f;
                do{
                    System.out.print("Insira a nota da final:");
                    notaFinal = sc.nextFloat();
                    if(notaFinal < 0f || notaFinal > 10f){
                        System.out.println("Valor inválido.");
                        System.out.println("-------------------------");
                    } 
                }while(notaFinal < 0f || notaFinal > 10f);
                System.out.println("-------------------------");
                float mediaFinal = (notaFinal + mediaSemestre)/2;
                if(mediaFinal >= 6f) System.out.println("Aprovado na final");
                else System.out.println("Reprovado na final");
            }
            sc.close();
	}
}


