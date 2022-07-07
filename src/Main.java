public class Main {
    public static void main(String[] args) {
        int resultado = suma(5, 6, 7);
        System.out.println(resultado);

        Coche carro = new Coche();
        carro.incremetarPuertas();
        System.out.println(carro.numPuertas);
    }
    
    public static int suma(int a, int b, int c){
        return a+ b + c;
    }
}

class Coche{
    public int numPuertas = 0;
    public void incremetarPuertas(){
        numPuertas ++;
    }
}