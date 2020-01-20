import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        miRadio miRadio = new miRadio();

        System.out.println("Bienvenido a la radio de moda la colochona");
        System.out.println("Porfavor seleccione que desea hacer: ");
        System.out.println("1.Prender Radio \n 2.Cambiar de frecuencia (AM,FM) \n 3.Avanzar \n 4.Guardar Emisora " +
                "\n 5.Seleccionar emisora guardada \n 6.Apagar radio");

        int opcion = sc.nextInt();
        if (opcion == 1){
            miRadio.onOff();
        }else if(opcion == 2){
            miRadio.cambiarFrecuencia();
        }else if(opcion == 3){
            miRadio.avanzar();
        }else if(opcion == 4){
            System.out.println("Seleccione en que boton desea guardar la emisora: ");
            int boton = sc.nextInt();
            miRadio.guardar(boton);
      //  }else if(opcion == 5){
        //    miRadio.seleccionarEmisora();
        //}else (opcion == 6){
          //  miRadio.onOff();
        }
    }
}
