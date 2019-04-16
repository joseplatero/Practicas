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
public class Demo {
    
    public static void main(String args []) {
        Frutas fruta = new Frutas();
        
        Manzana manzana = new Manzana();
        
        fruta.setColor("morado");
        fruta.setTama(1);
        
        manzana.setColor("rojo");
        manzana.setTama(2);
        manzana.setProcedencia("arbol");
        
        System.out.println(manzana.getProcedencia());
        System.out.println(fruta.getColor());
    }
    
}
