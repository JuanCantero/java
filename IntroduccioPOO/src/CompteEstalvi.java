
import java.util.Scanner;


public class CompteEstalvi {
	Scanner scan = new Scanner(System.in);
	
	private String numCompte;
	private float balanç;
	private static float interes = (float) 0.05;
	
	
	// GETTERS AND SETTERS
	
	public String getNumCompte() {
		return numCompte;
	}
	public float getBalance() {
		return balanç;
	}
	public float getInteres() {
		return interes;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public void setBalance(float _balanç) {
		this.balanç = _balanç;
	}
	public static void setInteres(float _interes) {
		interes = _interes;
	}
	
	//OTHER METHODS
	
	public void ingresDiners(float diners){
		this.balanç = this.balanç + diners;
		System.out.println("S'han ingressat "+ diners + "€ al compte "+this.getNumCompte()+".");	
	}
		
	public void retirarDiners(float dinersRetirar){
		System.out.println("Es retiraran "+dinersRetirar+"€ del compte "+this.getNumCompte()+".");
		this.balanç = this.balanç - dinersRetirar;
		System.out.println("S'han retirat "+dinersRetirar+"€.");
	}
		
	public void aplicarInteres(){
		float interesAplicat = CompteEstalvi.interes/100;
		float balCalc = this.balanç * interesAplicat;
		this.balanç = this.balanç + balCalc;
	}
	
	public int menuPrinc(){
		System.out.println(" 1. Ingressar   ");
		System.out.println(" 2. Retirar   ");
		System.out.println(" 3. Sortir   ");
		System.out.println("Tria una opcio: ");
		int op = scan.nextInt();
		return op;
	}
	
	public int Ingres(CompteEstalvi c1, CompteEstalvi c2){
		
		System.out.println(" 1. Compte 111 ");
		System.out.println(" 2. Compte 222 ");
		System.out.println(" 3. Sortir");
		System.out.println("Tria una opció: ");
		int sel = scan.nextInt();
		return sel;
	}
	
	public int Retirada(CompteEstalvi c1, CompteEstalvi c2){
		
		System.out.println(" 1.Compte 111 ");
		System.out.println(" 2.Compte 222");
		System.out.println(" 3. Sortir");
		System.out.println("Tria una opció: ");
		int sel2 = scan.nextInt();
		return sel2;
	}
}