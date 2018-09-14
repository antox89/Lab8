

package angeltorres_lab8;

import java.util.ArrayList;


public class Actividad {
    
    private String nombre;
    private int duracion, inicio, finalTemprano, retraso;
    private ArrayList<Actividad>preActividad = new ArrayList();
    private ArrayList<Actividad>postActividad = new ArrayList();

    public Actividad() {
    }

    public Actividad(String nombre, int duracion, int inicio, int finalTemprano, int retraso) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.inicio = inicio;
        this.finalTemprano = finalTemprano;
        this.retraso = retraso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFinalTemprano() {
        return finalTemprano;
    }

    public void setFinalTemprano(int finalTemprano) {
        this.finalTemprano = finalTemprano;
    }

    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }

    public ArrayList<Actividad> getPreActividad() {
        return preActividad;
    }

    public void setPreActividad(ArrayList<Actividad> preActividad) {
        this.preActividad = preActividad;
    }

    public ArrayList<Actividad> getPostActividad() {
        return postActividad;
    }

    public void setPostActividad(ArrayList<Actividad> postActividad) {
        this.postActividad = postActividad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
