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
public class Dogs {
     private String tipo;
    private String color;
    private String ojos;
    private int patas ;
    
    //Constructor vacio
    public Dogs () {
    
}
       //Constructor copia

    public Dogs(String tipo, String color, String ojos, int patas) {
        this.tipo = tipo;
        this.color = color;
        this.ojos = ojos;
        this.patas = patas;
    }
    
}
