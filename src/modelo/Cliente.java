/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Joan
 */
public class Cliente extends Persona {
    
    private String codigoC;
    private int edadC;

    public Cliente() {
    }

    public Cliente(String codigoC, int edadC, String nombreP, String telegonoP, String telefonoP) {
        super(nombreP, telegonoP, telefonoP);
        this.codigoC = codigoC;
        this.edadC = edadC;
    }

    public int getEdadC() {
        return edadC;
    }

    public void setEdadC(int edadC) {
        this.edadC = edadC;
    }
    public String getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(String codigoC) {
        this.codigoC = codigoC;
    }

    @Override
    public String toString() {
        return super.toString()  
                + codigoC + ","
                +  edadC + ".";
    }

}
