public class Arreglo3 {
    
    private int [] _numeros;
    
    public Arreglo3() {}
    
    public void setSizeNumbers(int size) {
        _numeros = new int[size];
    }
    
    public void startCount(int count) {
        for(int i = 0; i < _numeros.length; i++) {
            _numeros[i] = count;
            count++;
        }
    }
    
    public void showNumbers() {
        int index = 0;
        for(int number : _numeros) {
            System.out.println("Numero actual : " + number + " posicion actual: " + index);
            index++;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arreglo3 arreglo = new Arreglo3();
        System.out.println("Digite el tamano del arreglo");
        arreglo.setSizeNumbers(scanner.nextInt());
        System.out.println("Digite donde inicia el arreglo");
        arreglo.startCount(scanner.nextInt());
        arreglo.showNumbers();
    }

}
/**
 * nombre libro         |   autor
 * 100 years            |   gabrier g
 * el cuervo            |   
 * alan poe
 */