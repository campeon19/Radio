public class miRadio implements RadioInterface {
	
	private boolean prendido = false;
    private int[] guardado_AM = new int[12];
    private double[] guardado_FM = new double[12];
    private double fm;
    private int am;
    private String frecuencia;

    public miRadio(){
        fm = 87.9;
        am = 530;
        frecuencia = "a.m";
    }

    public void onOff(){
        if(prendido == false){
            prendido = true;
        } else if(prendido = true){
            prendido = false;
        }
    }

    public boolean estado(){
        return prendido;
    }

    public void cambiarFrecuencia(){
        if(frecuencia.equalsIgnoreCase("a.m")){
            frecuencia = "f.m";
        } else if(frecuencia.equalsIgnoreCase("f.m")){
            frecuencia = "a.m";
        }
    }

    public void avanzar(){
    	if(frecuencia.equalsIgnoreCase("f.m")) {
    		 if(fm < 107.9){
    	            fm = fm + 0.2;
    	        } else if(fm == 107.9){
    	            fm = 87.9;
    	        }
    	} else if (frecuencia.equalsIgnoreCase("a.m")) {
    		if(am < 1610) {
    			am = am + 10;
    		}else if(am == 1610) {
    			am = 530;
    		}
    	}
       
    }

    public void guardar(int x){
        int y = x-1;
        if(frecuencia.equalsIgnoreCase("a.m")){
            guardado_AM[y] = am;
        } else if(frecuencia.equalsIgnoreCase("f.m")){
            guardado_FM[y] = fm;
        }
    }

    public void seleccionarEmisora(int boton){
        int y = boton - 1;
        if(frecuencia.equalsIgnoreCase("a.m")){
            am = guardado_AM[y];
        } else if(frecuencia.equalsIgnoreCase("f.m")){
            fm = guardado_FM[y];
        }
    } 

    public String estacionActual(){
    	String devolver_estacion;
    	if(frecuencia.equalsIgnoreCase("a.m")) {
    		devolver_estacion = String.valueOf(am);
    	} else {
    		devolver_estacion = String.valueOf(fm);
    	}

        return devolver_estacion;
    }
}
