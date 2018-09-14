

package angeltorres_lab8;


public class Sucesora extends Actividad{

    public Sucesora() {
        super();
    }

    public Sucesora(String nombre, int duracion, int inicio, int finalTemprano, int retraso) {
        super(nombre, duracion, inicio, finalTemprano, retraso);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    

}
