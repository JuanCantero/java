import java.util.Scanner; 


public class exercici8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdueix el numero de vegades que vols repetir la frase:");
		int i = scan.nextInt();
		for (int j=0; j<i; j++)
			System.out.println("Hello world!");
		scan.close();

	}

}
