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
public class Animales {
    //Atributos
    private String tipo;
    private String color;
    private String peloOplumas;
    private int patas ;
    
    //Constructor vacio
    public Animales () {
    
}
    //Constructor copia
    
    public Animales (Animales p) {
   
    this.tipo = p.tipo;
    this.color= p.color;
    this.peloOplumas= p.peloOplumas;
    this.patas = p.patas;
    
    
    }
    
    //Constructor de parametros
    public Animales (String tipo, String color,String peloOplumas,int patas ){
         this.tipo = tipo;
    this.color= color;
    this.peloOplumas= peloOplumas;
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

    public String getPeloOplumas() {
        return peloOplumas;
    }

    public void setPeloOplumas(String peloOplumas) {
        this.peloOplumas = peloOplumas;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
}

