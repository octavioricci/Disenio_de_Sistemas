
public class PoliciaMalo implements DetencionPolicial {

	private final int MAXIMA_VELOCIDAD=80;
	
	public void multa(int velocidad, int coima){
	
		if(coima != 0 ){
		System.out.println("POLICIA MALO-> NO ME INTERESA A LA VELOCIDAD QUE IBA, INTENT� COIMEARME!! IR� DETENIDO !!!");
		}
		
		if(velocidad > MAXIMA_VELOCIDAD && coima == 0){
			System.out.println("POLICIA MALO-> Se ha sobrepasado en EXCESO de los "+MAXIMA_VELOCIDAD+" permitidos");
		}
	
	
		if (velocidad < MAXIMA_VELOCIDAD && coima ==0){
			System.out.println("POLICIA MALO-> SIGA, POR ESTA VEZ PASA.....");
		}
  
  }
}
