/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frutas;

/**
 *
 * @author ALBERTO MIRANDA
 */
public class Manzana extends Frutas{
    private String procedencia;

    public Manzana() {
        super();
    }

    public Manzana(String _color, int _Tama) {
        super(_color, _Tama);
    }

    public Manzana(String procedencia, String _color, int _Tama) {
        super(_color, _Tama);
        this.procedencia = procedencia;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    
    
    
}
