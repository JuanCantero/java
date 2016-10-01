import java.util.Scanner;


public class Xifrador {
	int clau = 0;
	
	public static String xifrar(String _lletres, int _clau){
		StringBuilder xifrat = new StringBuilder();
		_clau = _clau % 26;
		for (int i = 0; i< _lletres.length(); i++)
			xifrat.append((char)(_lletres.charAt(i)+_clau));
		
			return xifrat.toString();
	}
	public static void main(String[] args) {
		String lletres;
		int clau;
		Scanner llegir = new Scanner(System.in);
		System.out.println("Introdueix les lletres: ");
		lletres = llegir.nextLine();
		System.out.println("Introdueix el valor de xifrat: ");
		clau = llegir.nextInt();
		System.out.println("Resultat: "+xifrar(lletres,clau));

	}

}
