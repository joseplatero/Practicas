/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author ALBERTO MIRANDA
 */
public class HolaMundo {
       
    private String _nombre = "";
    
    public HolaMundo() {}
    
    public HolaMundo(String nombre) {
        this._nombre = nombre;
    }
    
    public static void main(String[] args) {
        HolaMundo holis1 = new HolaMundo();
        holis1.setNombre("Adonai");
        
        HolaMundo holis2 = new HolaMundo("Alberto");
        System.out.println(holis1.getNombre());
        System.out.println(holis2.getNombre());
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }
    
    
}
