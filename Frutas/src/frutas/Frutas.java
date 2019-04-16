
package frutas;


public class Frutas {

    private String _color;
    private int _Tama;

    public Frutas() {
    }

    public Frutas(String _color, int _Tama) {
        this._color = _color;
        this._Tama = _Tama;
    }

    
    public String getColor() {
        return _color;
    }

    public int getTama() {
        return _Tama;
    }

    public void setColor(String _color) {
        this._color = _color;
    }

    public void setTama(int _Tama) {
        this._Tama = _Tama;
    }
    
    
    
}
