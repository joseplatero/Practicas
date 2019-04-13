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
public class Carro {
    private String _placa;
    private String _modelo;
    
    public Carro () {}

    public Carro(String _placa, String _modelo) {
        this._placa = _placa;
        this._modelo = _modelo;
    }
    
    

    public String getPlaca() {
        return _placa;
    }

    public void setPlaca(String _placa) {
        this._placa = _placa;
    }

    public String getModelo() {
        return _modelo;
    }

    public void setModelo(String _modelo) {
        this._modelo = _modelo;
    }
    
}
