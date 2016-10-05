
import java.util.Scanner;


public class CompteEstalvi {
	Scanner scan = new Scanner(System.in);
	
	String numCompte;
	 float balanç;
	private static float interes = (float) 0.05;
	

	
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
	public void setBalanç(float _balanç) {
		this.balanç = _balanç;
	}
	public static void setInteres(float _interes) {
		interes = _interes;
	}
	
	
	public void ingresDiners(float diners){
		this.balanç = this.balanç + diners;
		System.out.println("S'han ingressat "+ diners + "€ al compte "+this.getNumCompte()+".");	
	}
		
	public void retirarDiners(float diners){
		this.balanç = this.balanç - diners;
		System.out.println("S'han retirat "+diners+"€.");
	}
		
	public void aplicarInteres(){
		float interesAplicat = CompteEstalvi.interes/100;
		float balCalc = this.balanç * interesAplicat;
		this.balanç = this.balanç + balCalc;
	}
	
	public int menuPrinc(){
		System.out.println(" 1. Ingressar   ");
		System.out.println(" 2. Retirar   ");
		System.out.println(" 3. Consultar saldo   ");
		System.out.println(" 4. Sortir   ");
		System.out.println("Tria una opcio: ");
		int op = scan.nextInt();
		return op;
	}
	
	public int Ingres(CompteEstalvi c1, CompteEstalvi c2){
		
		System.out.println(" 1. Compte "+c1.getNumCompte());
		System.out.println(" 2. Compte "+c2.getNumCompte());
		System.out.println(" 3. Sortir");
		System.out.println("Tria una opció: ");
		int ing = scan.nextInt();
		return ing;
	}
	
	public int Retirada(CompteEstalvi c1, CompteEstalvi c2){
		
		System.out.println(" 1.Compte "+c1.getNumCompte());
		System.out.println(" 2.Compte "+c2.getNumCompte());
		System.out.println(" 3. Sortir");
		System.out.println("Tria una opció: ");
		int ret = scan.nextInt();
		return ret;
	}
	
	public int Consulta(CompteEstalvi c1, CompteEstalvi c2){
		System.out.println(" 1. Compte "+c1.getNumCompte());
		System.out.println(" 2. Compte "+c2.getNumCompte());
		System.out.println(" 3. Sortir");
		System.out.println(" Tria una opció: ");
		int cons = scan.nextInt();
		return cons;
	}
}