
package MUNDO;

import java.util.ArrayList;

/**
 *
 * @author 1151641- 1151646
 */
public class Habitacion implements Comparable {

    private int id;
    private int capacidad;
    private TipoHabitacion categoria;
    private ArrayList<Servicio> listaServicios;
    private ArrayList<Huesped> listaHuespedes;
    private Responsable responsable;
    private float saldo;

    
    public Habitacion(int id, TipoHabitacion categoria, int capacidad) {        
        listaHuespedes = new ArrayList();
        listaServicios = new ArrayList();
        this.id = id;
        this.categoria = categoria;
        this.capacidad = capacidad;
    }
    
    public boolean isDisponible(){
        return responsable==null;
    }
    
    public boolean isHuesped(int cedula){
        boolean esta = false;
        
        for (Huesped huesped : listaHuespedes) {
            if(huesped.getCedula() == cedula){
                esta=true;
                break;
            }
        }
        return esta;
    }
    
    public void registrarServicio(Servicio servicio){
        listaServicios.add(servicio);
        
        if(!servicio.isPagado())
            saldo += servicio.getCosto();
        
        getConsumo();
    }
    
    public float getConsumo(){
        float consumo = 0;
        for (Servicio servicio : listaServicios) {
            consumo += servicio.getCosto();
        }
        return consumo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoHabitacion getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoHabitacion categoria) {
        this.categoria = categoria;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(ArrayList<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public ArrayList<Huesped> getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(ArrayList<Huesped> listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    

    @Override
    public String toString() {
        for (Servicio servicio : listaServicios) {
            servicio.toString();
        }
        for (Huesped hues : listaHuespedes) {
            hues.toString();
        }
        
        String a = "Habitacion{" + "id=" + id + ", categoria=" + categoria + ", responsable=" + responsable + '}';
        
        return a;
        
        
    }
    
    @Override
    public int compareTo(Object o) {
        Habitacion hab = (Habitacion) o;
        
        if(this.getConsumo() > hab.getConsumo())
            return -1;
        if(this.getConsumo() < hab.getConsumo())
            return 1;
        return 0;
    }

    

    
    
}
