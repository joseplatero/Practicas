/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ness.model;

/**
 *
 * @author nayos
 */
public class Libro {
    
    private String _nombre;
    private String _autor;
    
    public Libro(){}

    public Libro(String _nombre, String _autor) {
        this._nombre = _nombre;
        this._autor = _autor;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getAutor() {
        return _autor;
    }

    public void setAutor(String _autor) {
        this._autor = _autor;
    }
    
    
    
}
