/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.golosinas;

import com.Envoltorios.Plastico;

/**
 *
 * @author ALBERTO MIRANDA
 */
public class Churro extends BaseGolosina {
    
    private Plastico _envoltorio;
    
    public Churro() {
        super();
    }

    public Churro(double _precio, int _cantidadDeCaja) {
        super(_precio, _cantidadDeCaja);
    }

    public Churro(Plastico _envoltorio, double _precio, int _cantidadDeCaja) {
        super(_precio, _cantidadDeCaja);
        this._envoltorio = _envoltorio;
    }

    public Plastico getEnvoltorio() {
        return _envoltorio;
    }

    public void setEnvoltorio(Plastico _envoltorio) {
        this._envoltorio = _envoltorio;
    }

    public String getSrt() {
        return _srt;
    }

    public void setSrt(String _srt) {
        this._srt = _srt;
    }
    
    
    
    
    
}
