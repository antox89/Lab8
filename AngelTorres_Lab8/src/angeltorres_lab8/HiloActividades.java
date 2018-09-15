package angeltorres_lab8;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HiloActividades extends Thread {

    private int c = 0;
    private boolean vive;
    private boolean av;
    private int duracion;
    private ArrayList<Actividad> lista = new ArrayList();
    private JTable tabla;

    public HiloActividades() {
        vive = true;
        av = true;
        this.duracion = duracion;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAv() {
        return av;
    }

    public void setAv(boolean av) {
        this.av = av;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Actividad> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Actividad> lista) {
        this.lista = lista;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public void run() {
        for (Actividad a : lista) {
            
            Object[] row = {
                a.getNombre(), a.getDuracion(), a.getRetraso(), a.getInicio(), a.getFinalTemprano()};
            
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(row);
            tabla.setModel(modelo);
            
            try {
                Thread.sleep(a.getDuracion() * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
