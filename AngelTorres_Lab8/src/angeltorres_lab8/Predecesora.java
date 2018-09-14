

package angeltorres_lab8;


public class Predecesora extends Actividad{

    public Predecesora() {
        super();
    }

    public Predecesora(String nombre, int duracion, int inicio, int finalTemprano, int retraso) {
        super(nombre, duracion, inicio, finalTemprano, retraso);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

     
    
}
