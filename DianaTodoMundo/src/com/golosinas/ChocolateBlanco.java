/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.golosinas;

import com.Envoltorios.Aluminio;
import com.ingredientes.Leche;

/**
 *
 * @author ALBERTO MIRANDA
 */
public class ChocolateBlanco extends Chocolate{
    private Leche leche;

    public ChocolateBlanco() {
    }

    
    public ChocolateBlanco(Leche leche) {
        this.leche = leche;
    }

    public ChocolateBlanco(Leche leche, Aluminio _envoltorio) {
        super(_envoltorio);
        this.leche = leche;
    }

    public ChocolateBlanco(Leche leche, Aluminio _envoltorio, double _precio, int _cantidadDeCaja) {
        super(_envoltorio, _precio, _cantidadDeCaja);
        this.leche = leche;
    }
    
    
}
