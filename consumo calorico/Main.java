import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double consumoTotal = 0, consumoAtual = 0;
char estadoFisico = ' ';
do{
do{
System.out.println("Quantas calorias consumiu?\ninsira [0] para encerrar o programa");
consumoAtual = sc.nextInt();
}while(consumoAtual < 0);
if(consumoAtual != 0){
do{
System.out.println("Estado Físico é:\nR - Repouso\nA - Ativo");
estadoFisico = sc.next().toUpperCase().charAt(0);
if(estadoFisico == 'R'){
consumoTotal = consumoAtual *.1 + consumoAtual + consumoTotal;
}
else if(estadoFisico == 'A'){
consumoTotal+=consumoAtual;
}
if(estadoFisico != 'R' && estadoFisico != 'A'){
System.out.println("Error, insira [R] ou [A]");
}
}while(estadoFisico != 'R' && estadoFisico != 'A');
}
}while(consumoAtual != 0);
if(consumoTotal > 1600){
System.out.println("Você consumiu: "+ consumoTotal + " calorias\nlimite diário indicado de 1600 calorias foi ultrapassado.");
}else if(consumoTotal == 1600){
System.out.println("Você consumiu: " + consumoTotal + " calorias \ningeriu com exatidão o indicado de 1600 calorias diárias.");
}else{
System.out.println("Você consumiu: "+ consumoTotal + " calorias\ningeriu abaixo do indicado de 1600 calorias diárias, aumente sua ingestão de alimentos.");
}
sc.close();
}
}