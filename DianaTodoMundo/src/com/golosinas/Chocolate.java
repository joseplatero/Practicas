/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.golosinas;

import com.Envoltorios.Aluminio;

/**
 *
 * @author ALBERTO MIRANDA
 */
public class Chocolate extends BaseGolosina{
    private Aluminio _envoltorio;

    public Chocolate() {
    }
    
    public Chocolate(Aluminio _envoltorio) {
        this._envoltorio = _envoltorio;
    }

    public Chocolate(Aluminio _envoltorio, double _precio, int _cantidadDeCaja) {
        super(_precio, _cantidadDeCaja);
        this._envoltorio = _envoltorio;
    }

    public Aluminio getEnvoltorio() {
        return _envoltorio;
    }

    public void setEnvoltorio(Aluminio _envoltorio) {
        this._envoltorio = _envoltorio;
    }
    
    
    
}
