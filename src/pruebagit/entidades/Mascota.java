/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit.entidades;

/**
 *
 * @author crist
 */
public class Mascota {
    
    private String apodo;
    private String raza;

    public Mascota() {
    }

    public Mascota(String apodo, String raza) {
        this.apodo = apodo;
        this.raza = raza;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
