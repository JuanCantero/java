import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Edat {

	public static void main(String[] args) {
		persona p1 = new persona();
		
		Date dataNaixement = null;
		Date datactual = null;
		Calendar cal = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		String dateFormat = "dd/MM/yyyy";
		boolean datadolenta;
		
		do{
			datadolenta=false;
			System.out.println("Data de naixement (dd/mm/aaaa):");
			String dn = sc.nextLine();
			
			try{
				cal.setTime(new SimpleDateFormat(dateFormat).parse(dn));
				dataNaixement = cal.getTime();
				p1.setDataNaixement(dataNaixement);
			}catch (ParseException e){
				System.out.println("ATENCIO!! No has introduït el format de data adequat: "+e.getMessage());
				datadolenta=true;
			
			}
			sc.close();
		}while(datadolenta);
		
		
		
		int year = cal.get(cal.YEAR);
		
		cal2=cal.getInstance();
		datactual=cal2.getTime();
		
		int anyactual=cal2.get(cal.YEAR);
		
		System.out.println("Años: "+(anyactual-year));
	}

}
