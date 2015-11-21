package com.sidet.sidet02.BE;

/**
 * Created by Grover on 21/11/2015.
 */
public class PersonaBE {
    String Nombres,ApellidoM,ApellidoP;
    int Edad;

    public PersonaBE(String nombres, String apellidoM, String apellidoP, int edad) {
        Nombres = nombres;
        ApellidoM = apellidoM;
        ApellidoP = apellidoP;
        Edad = edad;
    }

    // ALT + Insert

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String apellidoM) {
        ApellidoM = apellidoM;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String apellidoP) {
        ApellidoP = apellidoP;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
