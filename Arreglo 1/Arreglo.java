/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ness;

/**
 *
 * @author HTC
 */
public class Arreglo {
    private String []_nombres;
    
    public Arreglo() {}
    
    public void initNames() {
        _nombres = new String[] {"Alberto", "Jorge", "Adonai"};
    }
    
    public String[] getNames() {
        return _nombres;
    }
}
