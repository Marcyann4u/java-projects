import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        char[] kitnet = {'A', 'B', 'C','D'};
        int[] moradores = {0,  0,   0,  0}, valorLocacao = {0 , 0, 0, 0};
        int valorTotal = 0,continuar = 0,quantMoradores=0;
        char opcaoKitnet;
        do{
            do{
                System.out.print("A - B - C - D\nInforme o kitnet:");
                opcaoKitnet = sc.next().toUpperCase().charAt(0);
                     if(opcaoKitnet != kitnet[0] && opcaoKitnet != kitnet[1] && opcaoKitnet != kitnet[2] && opcaoKitnet !=kitnet[3]){
                        System.out.println("Inválido.");
                    }   
            }while(opcaoKitnet != kitnet[0] && opcaoKitnet != kitnet[1] && opcaoKitnet != kitnet[2] && opcaoKitnet !=kitnet[3]);
            
            do{
                System.out.printf("Informe quantos moradores estão no kitnet %c: ",opcaoKitnet);
                quantMoradores = sc.nextInt(); 
                if(quantMoradores < 0){
                    System.out.println("Inválido.");
                }
            }while(quantMoradores < 0);
            
            for (int i = 0; i < kitnet.length; i++){
                if(opcaoKitnet == kitnet[i]){
                    moradores[i] = quantMoradores;
                    if(moradores[i] == 0) break;
                    if(moradores[i] <= 3) valorLocacao[i] = 800;
                    else valorLocacao[i] = 800 + (moradores[i] - 3)*100;
                }
            } 
            System.out.println("\nInformar atualização?\n0 - sim\n1 - não");
            continuar = sc.nextInt();
            System.out.println();//quebrar linha
        }while(continuar != 1);
        
        for (int i = 0; i < kitnet.length; i++){
                System.out.println("Kitnet: "+kitnet[i]+" - Moradores: "+moradores[i]+" - Aluguel: "+valorLocacao[i]);
                valorTotal += valorLocacao[i];
            }
            System.out.println("\nO total a receber pelas alocaçoes é: "+valorTotal);
	}
}
