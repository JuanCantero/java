
public class enumerats {
	
	public enum Mes {
		GENER,FEBRER,MARÇ,ABRIL,MAIG,JUNY,JULIOL,AGOST,SETEMBRE,OCTUBRE,NOVEMBRE,DESEMBRE
	}
	
	public void numDiesMes(Mes m){
		int n;
		if( m == Mes.GENER || m == Mes.MARÇ || m == Mes.MAIG
				|| m == Mes.JULIOL || m == Mes.AGOST
				|| m == Mes.OCTUBRE || m == Mes.DESEMBRE){
			n=31;
		}else if ( m == Mes.FEBRER) n=28;
		else n = 30;
		System.out.println("Són "+n+"dies");
	}
		
	
	public static void main(String[] args) {
		enumerats mesos = new enumerats();
		mesos.numDiesMes(Mes.FEBRER);
		mesos.numDiesMes(Mes.DESEMBRE);
		mesos.numDiesMes(Mes.NOVEMBRE);
		

	}

}
