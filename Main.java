import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Radio RadioA = new miRadio();

        System.out.println("Bienvenido a la radio de moda la colochona");
        System.out.println("Porfavor seleccione que desea hacer: ");
        System.out.println("1.Prender Radio \n 2.Cambiar de frecuencia (AM,FM) \n 3.Avanzar \n 4.Guardar Emisora " +
                "\n 5.Seleccionar emisora guardada \n 6.Apagar radio");
        int opcion = sc.nextInt();

        while(opcion != 6){
            if (opcion == 1){
                RadioA.onOff();
                System.out.println("La Radio ha sido encendida");
                System.out.println("Ingrese una nueva opcion: ");
                opcion = sc.nextInt();
            }else if(opcion == 2){
                RadioA.cambiarFrecuencia();
                System.out.println("Se cambio la frecuencia ");
                System.out.println("Ingrese una nueva opcion: ");
                opcion = sc.nextInt();
            }else if(opcion == 3){
                RadioA.avanzar();
                System.out.println("Su nueva estacion es ");
                System.out.println("Ingrese una nueva opcion: ");
                opcion = sc.nextInt();
            }else if(opcion == 4){
                System.out.println("Seleccione en que boton desea guardar la emisora: ");
                int boton = sc.nextInt();
                RadioA.guardar(boton);
                System.out.println("Su emisora ha sido guardada exitosamente");
                System.out.println("Ingrese una nueva opcion: ");
                opcion = sc.nextInt();
            }else if(opcion == 5){
                System.out.println("Seleccione la emisora favorita: ");
                int boton = sc.nextInt();
                RadioA.seleccionarEmisora(boton);
                System.out.println("Su emisora ha sido seleccionada");
                System.out.println("Ingrese una nueva opcion: ");
                opcion = sc.nextInt();
            }
        }
        System.out.println("La radio ha sido apagada");
    }
}
