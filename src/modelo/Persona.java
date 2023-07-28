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
public class Persona {
    
    private String nombreP;
    private String correoP;
    private String telefonoP;

    public Persona() {
    }

    public Persona(String nombreP, String correoP, String telefonoP) {
        this.nombreP = nombreP;
        this.correoP = correoP;
        this.telefonoP = telefonoP;
    }
 
    
    public String getTelefonoP() {
        return telefonoP;
    }
    
    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }
 
    public String getNombreP() {
        return nombreP;
    }
      
    public String getCorreoP() {
        return correoP;
    }

    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return   nombreP + ","
                + correoP + ","
                +  telefonoP + ",";
    }

}
