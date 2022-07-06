import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int c1 = sc.nextInt(), c2 = sc.nextInt(), c3 = sc.nextInt();
		System.out.println("----------------");
		if(c1 < c2 + c3 && c2 < c1 + c3 && c3 < c1 + c2) System.out.println("Segundo turno");
		else System.out.println("Primeiro turno");
		sc.close();
	}
}

