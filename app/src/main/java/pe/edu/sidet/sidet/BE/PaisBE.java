package pe.edu.sidet.sidet.BE;

/**
 * Created by Administrador on 28/11/2015.
 */
public class PaisBE {
    private String nombre;
    private int drawableimgID;

    //ALT + INSERT
    public PaisBE(String nombre, int drawableimgID) {
        this.nombre = nombre;
        this.drawableimgID = drawableimgID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDrawableimgID() {
        return drawableimgID;
    }

    public void setDrawableimgID(int drawableimgID) {
        this.drawableimgID = drawableimgID;
    }
}
