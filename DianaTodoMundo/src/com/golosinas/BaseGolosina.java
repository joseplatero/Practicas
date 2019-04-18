/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.golosinas;

/**
 *
 * @author ALBERTO MIRANDA
 */
public abstract class BaseGolosina {
    
    protected double _precio;
    protected int _cantidadDeCaja;
    protected String _srt;

    public BaseGolosina() {
    }

    public BaseGolosina(double _precio, int _cantidadDeCaja) {
        this._precio = _precio;
        this._cantidadDeCaja = _cantidadDeCaja;
    }
    
    

    public double getPrecio() {
        return _precio;
    }

    public void setPrecio(double _precio) {
        this._precio = _precio;
    }

    public int getCantidadDeCaja() {
        return _cantidadDeCaja;
    }

    public void setCantidadDeCaja(int _cantidadDeCaja) {
        this._cantidadDeCaja = _cantidadDeCaja;
    }
    
    
    public double trabajar(int cantidad, double precio ) {
        this._cantidadDeCaja = cantidad;
        this._precio = precio;
        return this._cantidadDeCaja * this._precio;
    }
    
    
    
}
