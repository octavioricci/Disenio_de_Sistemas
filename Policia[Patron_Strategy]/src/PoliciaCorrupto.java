
public class PoliciaCorrupto implements DetencionPolicial{
	
	private final int MAXIMA_VELOCIDAD=120;
	private final int COIMA=600;
	
	public void multa(int velocidad, int coima){
		
		
		if(coima < COIMA ){
			System.out.println("POLICIA CORRUPTO-> NO ME INTERESA A LA VELOCIDAD QUE IBA, IR� DETENIDO !!!");
			
			}
		
		if(coima >= COIMA ){
			System.out.println("POLICIA CORRUPTO-> ACA NO PAS� NADA, SIGA !!!");
			}
			
			
	
	}
}
