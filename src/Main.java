public class Main {
    public static void main(String[] args) {
        System.out.println(suma(1,2, 20));

        Coche coche = new Coche();
        coche.agregarPuerta();
        System.out.println(coche.puerta);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    static class Coche{
        public int puerta = 0;

        public void agregarPuerta(){
            puerta++;
        }
    }
}
