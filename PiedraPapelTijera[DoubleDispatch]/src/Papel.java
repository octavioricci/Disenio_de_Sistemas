
public class Papel implements Elemento {

	public String jugar(Piedra piedra){
		return "Gan� jugador1->papel, perdi� jugador2->piedra";
	}
	
	public String jugar(Papel papel){
		return "Empataron!, Ambos son papel";
	}
	
	public String jugar(Tijera tijera){
		return "Gan� jugador2->tijera, perdi� jugador1->papel";
	}
	
	public String jugar(Elemento e){
		return e.jugar(this);
	}
}
