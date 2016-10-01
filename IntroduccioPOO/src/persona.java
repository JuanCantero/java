
public class persona {
	private String nom = "Juan";
	private String cognom = "Cantero";
	private String genere = "Male";
	private String dataNaixement = "25-11-1986";
	
	public persona(){
		nom="sense nom";
		cognom="sense cognom";
	}
	
	public persona(String nom,String cognom){
		this.nom=nom;
		this.cognom=cognom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getDataNaixement() {
		return dataNaixement;
	}
	public void setDataNaixement(String dataNaixement) {
		this.dataNaixement = dataNaixement;
	}
	
	
	
	
}
