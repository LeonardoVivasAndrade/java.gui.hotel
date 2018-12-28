
package MUNDO;

/**
 *
 * @author 1151641 - 1151646
 */
public class Servicio {    
    private int identificador;
    private TipoServicio tipo;
    private float costo;
    private boolean pagado;

    public Servicio(TipoServicio tipo, float costo, boolean pagado) {        
        this.tipo = tipo;
        this.costo = costo;
        this.pagado = pagado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public TipoServicio getTipo() {
        return tipo;
    }

    public void setTipo(TipoServicio tipo) {
        this.tipo = tipo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
}
