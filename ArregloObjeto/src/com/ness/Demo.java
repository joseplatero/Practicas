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
        ImpLibroContenedor imp = new ImpLibroContenedor();
        imp.initialize();
    }
}
