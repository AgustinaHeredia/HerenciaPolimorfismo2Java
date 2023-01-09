import java.util.Scanner;
public class UsoCoche {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		Coche coche1=crearCoche((pedirString("Escribe el modelo del coche")), (pedirInt("Escribe la potencia del coche")));
			
		System.out.println(coche1.toString());
		

		int seleccion=0;
		do {
			seleccion=pedirInt("¿Qué desea realizar con el coche frenar o acelerar? Escribe 1 para frenar y 2 para acelecar");
			if (seleccion ==1) {
				System.out.println(Coche.frenarCoche());
			} else if(seleccion==2) {
				System.out.println(coche1.acelerar());
			}else {
				System.out.println("la acción ingresada no es correcta");
			}
		}while (seleccion !=0);
		
		

	}
	

	public static Coche crearCoche(String modelo,int potencia) {
		
		Coche nuevoCoche = new Coche(modelo,potencia);
		
		System.out.println("El coche se ha creado con exito.");
		return nuevoCoche;
	}
	static String pedirString(String texto) {
		System.out.println(texto);
		String nom = input.next();
		return nom;
	}

	static int pedirInt(String texto) {
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}
	
}
