
public class Coche {
	
	private static final String marca= "Ford";
	private static String modelo;
	private final int potencia;
	
	public Coche(String modelo, int potencia){

		Coche.modelo=modelo;
		this.potencia=potencia;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getPotencia() {
		return potencia;
	}
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public String toString() {
		return "La marca del coche es "+marca+" es modelo "+modelo+" y la potencia "+potencia;
	}
	
	public static String frenarCoche() {
		return "El vehículo está frenando";
	}
	
	public String  acelerar() { 
		return "El vehículo está acelerando";
	}
	
}
