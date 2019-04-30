/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ness;
import com.ness.model.Libro;
/**
 *
 * @author nayos
 */
public class LibrosContenedor {
    private Libro [] _libros;
    
    public LibrosContenedor() {}
    
    public void initializeBooks(int size) {
        _libros = new Libro[size];
    }
    
    public void addBook(int position, Libro libro) {
        _libros[position] = libro;
    }
    
    public void showBooks() {
        System.out.println("*******    *********");
        for(Libro libro : _libros){
            System.out.println(
                "Titulo: "+libro.getNombre() + 
                " Autor: " + libro.getAutor()
            );
        }
    }
    
}
