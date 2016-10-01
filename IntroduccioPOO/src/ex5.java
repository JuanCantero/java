
public class ex5 {

	public static void main(String[] args) {
		persona p1,p2;
		p1 = new persona();
		p2 = new persona();
		
		p1.setNom("Juan");
		p1.setCognom("Cantero");
		System.out.println("Nom:"+p1.getNom()+""+"Cognom:"+p1.getCognom());
		System.out.println("Nom:"+p2.getNom()+""+"Cognom:"+p2.getCognom());

	}

}
