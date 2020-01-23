/* Christian Daniel Perez De Leon (19710)
 * Pablo Reyna (19822)
 * Fecha de creacion: 18/01/2020
 * Ultima edicion: 22/01/2020
 */

import java.text.DecimalFormat;

public class miRadio implements RadioInterface {     //Implementa la interfaz RadioInterface
	
    private boolean prendido = false;
    private int[] guardado_AM = new int[12];
    private double[] guardado_FM = new double[12];
    private double fm;
    private int am;
    private String frecuencia;
    private DecimalFormat df = new DecimalFormat("#.0");

    public miRadio(){   // Constructor que da valores iniciales a las variables
        fm = 87.9;
        am = 530;
        frecuencia = "a.m";
    }

    public void onOff(){  // Metodo que permite cambia el estado del radio (false apagado, true prendido)
        if(prendido == false){
            prendido = true;
        } else if(prendido = true){
            prendido = false;
        }
    }

    public boolean estado(){ // Devuelve el estado del radio
        return prendido;
    }

    public void cambiarFrecuencia(){ // metodo que cambia la frecuencia del radio
        if(frecuencia.equalsIgnoreCase("a.m")){ // si es am cambia a fm y viceversa.
            frecuencia = "f.m";
        } else if(frecuencia.equalsIgnoreCase("f.m")){
            frecuencia = "a.m";
        }
    }

    public void avanzar(){ // metodo que permite avanzar a la siguiente estacion
    	if(frecuencia.equalsIgnoreCase("f.m")) { 
    		 if(fm < 107.9){  // si es la frecuencia es fm y es menor a 107.9, avanzara 0.2
    	            fm = fm + 0.2;
    	        } else if(fm > 107.9){ // si es mayor a 107.9 entonces regresa a la emisora 87.9
    	            fm = 87.9;
    	        }
    	} else if (frecuencia.equalsIgnoreCase("a.m")) { //mismo procedimiento que antes pero con la frecuencia am
    		if(am < 1610) {
    			am = am + 10;
    		}else if(am > 1610) {
    			am = 530;
    		}
    	}
       
    }

    public void guardar(int x){ // metodo que permite guardar la emisora actual en algun boton (se almacena en una lista)
        int y = x-1;
        if(frecuencia.equalsIgnoreCase("a.m")){ //si es am
            guardado_AM[y] = am;
        } else if(frecuencia.equalsIgnoreCase("f.m")){ //si es fm
            guardado_FM[y] = fm;
        }
    }

    public void seleccionarEmisora(int boton){ // metodo que permite seleccionar una emisora guardada
        int y = boton - 1;
        if(frecuencia.equalsIgnoreCase("a.m")){ // si no hay ninguna emisora guardada, devuelve 0
            am = guardado_AM[y];
        } else if(frecuencia.equalsIgnoreCase("f.m")){
            fm = guardado_FM[y];
        }
    } 

    public String estacionActual(){ // metodo getter que devuelve un String con la estacion actual
    	String devolver_estacion;
    	if(frecuencia.equalsIgnoreCase("a.m")) {
    		devolver_estacion = String.valueOf(am); // convertir de un int a String
    	} else {
    		devolver_estacion = String.valueOf(df.format(fm)); // convertir de un double a String
    	}

        return devolver_estacion;
    }
}
