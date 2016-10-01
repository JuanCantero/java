import java.util.Scanner;


public class Banc {

	public static void main(String[] args) {
		int op;
		int op2;
		int operar;
		
		CompteEstalvi compte1 = new CompteEstalvi();
		CompteEstalvi compte2 = new CompteEstalvi();
		CompteEstalvi triar = new CompteEstalvi();
		Scanner llegir = new Scanner(System.in);
		
		
		
		do{
			op = triar.menuPrinc();
			switch(op){
			case 1:
				op2 = triar.Ingres(compte1, compte2);
				switch(op2){
				case 1:
					System.out.println("Introdueix la quantitat a ingressar: ");
					operar = llegir.nextInt();
					compte1.ingresDiners(operar);
					break;
				case 2:
					System.out.println("Introdueix la quantitat a ingressar: ");
					operar = llegir.nextInt();
					compte2.ingresDiners(operar);
					break;
				}
			break;
				
			case 2:
				op2 = triar.Retirada(compte1, compte2);
				switch(op2){
				case 1:
					System.out.println("Introdueix la quantitat a retirar: ");
					operar = llegir.nextInt();
					compte1.retirarDiners(operar);
					break;
				case 2:
					System.out.println("Introdueix la quantitat a retirar: ");
					operar = llegir.nextInt();
					compte2.retirarDiners(operar);
					break;
				}
			break;	
			}
		
		}while(op != 3);

	}
}
