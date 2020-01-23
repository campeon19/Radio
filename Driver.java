import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		int boton;
		
		RadioInterface radio = new miRadio();
		
		System.out.println("------- Simulador de Radio -------");
		
		while(opcion != 8) {
			
			System.out.println("\nMenu:");
			System.out.println("1. Prender o apagar el radio");
			System.out.println("2. Cambiar de frecuencia (AM o FM)");
			System.out.println("3. Avanzar a la siguiente emisora");
			System.out.println("4. Guardar emisora actual en un boton");
			System.out.println("5. Sellecionar una emisora guardada");
			System.out.println("6. Mostrar emisora actual");
			System.out.println("7. Mostrar estado del radio");
			System.out.println("8. Salir");
			System.out.println("Opcion escogida:");
			
			opcion = scan.nextInt();
			
			switch(opcion) {
			case 1:
				radio.onOff();
				break;
			
			case 2:
				radio.cambiarFrecuencia();
				break;
				
			case 3:
				radio.avanzar();
				System.out.println("Emisora actual: ");
				System.out.println(radio.estacionActual());
				break;
			
			case 4:
				System.out.println("Ingresa en que boton deseas guardar la emisora actual: (12 botones disponibles)");
				boton = scan.nextInt();
				radio.guardar(boton);
				break;
			
			case 5:
				System.out.println("Ingresa el numero del boton de la cual desees reproducir (12 botones disponibles)");
				boton = scan.nextInt();
				radio.seleccionarEmisora(boton);
				System.out.println("Emisora seleccionada: ");
				System.out.print(radio.estacionActual());
				break;
			
			case 6:
				System.out.println("Emisora actual: ");
				System.out.print(radio.estacionActual());
				break;
				
			case 7:
				System.out.println("(Nota: false = apagado y true = prendido)");
				System.out.println("Estado de la radio:");
				System.out.println(radio.estado());
				break;
				
			case 8:
				System.out.println("Que tenga un buen dia!");
				break;
				
			default:
				System.out.println("Opcion no valida");
				break;
				
				
			}
		}
		
	}

}
