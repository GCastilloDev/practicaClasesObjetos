/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclasesobjetos;

/**
 *
 * @author tavoGeek
 */
public class Smartphone {
    
    private String marca;
    private String modelo;
    private String sistemaOperativo;

    public Smartphone(String marca, String modelo, String sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", modelo=" + modelo + ", sistemaOperativo=" + sistemaOperativo + '}';
    }
    
    public String llamar(String contacto) {
        return "Llamando a " + contacto + "...";
    }
    
    public String instalarApp(String nombreApp) {
        return "Se esta instalando " + nombreApp + "...";
    }
    
    public String bloquear() {
        return "Smartpone " + this.marca + "-" + this.modelo + " se ha bloqueado...";
    }
    
    
}
