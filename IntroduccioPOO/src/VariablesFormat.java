
public class VariablesFormat {
	public static void main (String[] args){
		byte numbyte=1;
		short numshort=34;
		int numint=543534;
		long numlong=635564654;
		float numfloat= (float)1.7;
		double numdouble=4.6756;
		boolean bool=true;
		char caracter='t';
		
		System.out.format("Hemos declarado los tipos primitivos y nuestros valores son:"
				+ "\npara el tipo byte: "+numbyte+
				"\npara el tipo short: "+numshort+
				"\npara el tipo int: "+numint+
				"\npara el tipo long: "+numlong+
				"\npara el tipo float: "+numfloat+
				"\npara el tipo double %.2f ",numdouble+
				"\npara el tipo booleano: "+bool+
				"\npara el tipo char: "+caracter);
	}
}
