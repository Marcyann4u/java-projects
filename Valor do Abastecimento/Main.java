import java.util.Scanner;
public class atvJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("##############################");
        System.out.println("Tabela de precos");
        System.out.println("Gasolina: 7,199$");
        System.out.println("Etanol: 5,419$");
        System.out.println("GNV: 4,259$");
        System.out.println("##############################");
        System.out.print("Quantidade de Gasolina:");
        float lGasolina = sc.nextFloat();
        System.out.print("Quantidade de Etanol:");
        float lEtanol = sc.nextFloat();
        System.out.print("Quantidade de GNV:");
        float lGnv = sc.nextFloat();
        sc.close();
        float gasolina = 7.199f * lGasolina, etanol = 5.419f * lEtanol, gnv = 4.259f*lGnv;
        float total = gasolina + etanol + gnv;
        System.out.println("##############################");
        System.out.println("Gerando Nota Fiscal...");
        System.out.println("##############################");
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Etanol: "+ etanol);
        System.out.println("GNV: "+ gnv);
        System.out.println("Total: "+ total);
        System.out.println("##############################");

    }
}