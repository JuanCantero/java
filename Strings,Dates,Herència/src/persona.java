import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class persona {
	 String nom = "Juan";
	 String cognom = "Cantero";
	 String genere = "Male";
	 Date dataNaixement;
	
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
	public Date getDataNaixement() {
		return dataNaixement;
	}
	public void setDataNaixement(Date dataNaixement) {
		this.dataNaixement = dataNaixement;
	}
	
	

	
}
