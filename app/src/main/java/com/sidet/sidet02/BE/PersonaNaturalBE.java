package com.sidet.sidet02.BE;

/**
 * Created by Grover on 21/11/2015.
 */
public class PersonaNaturalBE extends PersonaBE{
    String Direccion,RUC;

    public PersonaNaturalBE() {
    }

    public PersonaNaturalBE(String nombres, String apellidoM, String apellidoP, int edad, String direccion, String RUC) {
        super(nombres, apellidoM, apellidoP, edad);
        Direccion = direccion;
        this.RUC = RUC;
    }
}
