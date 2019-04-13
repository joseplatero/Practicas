/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author ALBERTO MIRANDA
 */
public class Persona {
    
    private String _nombre;
    private String _apellido;
    private String _telefono;
    
    public Persona() {}

    public Persona(String _nombre, String _apellido, String _telefono) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._telefono = _telefono;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public String getTelefono() {
        return _telefono;
    }

    public void setTelefono(String _telefono) {
        this._telefono = _telefono;
    }
    
    
    
}
