/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYobjetos;

/**
 *
 * @author estar
 */
public class Duck {
     private String tipo;
    private String color;
    private String ojos;
    private int patas ;
    
    //Constructor vacio
    public Duck () {
    
}
       //Constructor copia

    public Duck(String tipo, String color, String ojos, int patas) {
        this.tipo = tipo;
        this.color = color;
        this.ojos = ojos;
        this.patas = patas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
}
