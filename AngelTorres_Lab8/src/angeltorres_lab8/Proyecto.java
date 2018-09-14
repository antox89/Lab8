

package angeltorres_lab8;

import java.util.ArrayList;


public class Proyecto {
    
    private String nombre;
    private int duracion;
    private ArrayList<Actividad> listaActividades = new ArrayList();

    public Proyecto(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
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

    public ArrayList<Actividad> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ArrayList<Actividad> listaActividades) {
        this.listaActividades = listaActividades;
    }
    
    public void agregarActividad(Actividad a){
        this.listaActividades.add(a);
    }
    
    public void agregarPre(Predecesora p){
        this.listaActividades.add(p);
    }
    
    public void agregarPos(Sucesora s){
        this.listaActividades.add(s);
    }   
    
    public int posicion(String nombre){
        int p = listaActividades.size();
        int pos=-1;
        for (int i = 0; i < p; i++) {
            if(listaActividades.get(i).equals(nombre)){
                pos = i;
            }else{
                pos=-99;
            }
        }
        return pos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    

}
