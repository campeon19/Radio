/* Christian Daniel Perez De Leon (19710)
 * Pablo Reyna (19822)
 * Fecha de creacion: 18/01/2020
 * Ultima edicion: 22/01/2020
 */

public interface RadioInterface{

    public String estacionActual();

    public boolean estado();

    public void onOff();

    public void cambiarFrecuencia();

    public void avanzar();

    public void guardar(int boton);

    public void seleccionarEmisora(int boton);

}
