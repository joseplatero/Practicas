/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ness;

import com.ness.model.Libro;
import java.util.Scanner;

/**
 *
 * @author nayos
 */
public class Demo {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        LibrosContenedor biblioteca = new LibrosContenedor();
        int totalAddBook = 0;
        System.out.println("Por favor digite la cantidade de libros a ingresas");
        totalAddBook = scanner.nextInt();
        biblioteca.initializeBooks(totalAddBook);
        
        for(int position = 0; position < totalAddBook; position++) {
            Libro libro = new Libro();
            
            System.out.println("Ingrese el nombre del libro");
            libro.setNombre(scanner.nextLine());
            
            System.out.println("Ingrese el autor del libro");
            libro.setAutor(scanner.nextLine());
            
            biblioteca.addBook(position, libro);
        }
        
        scanner.close();
        
        biblioteca.showBooks();
        
        
    }
}
