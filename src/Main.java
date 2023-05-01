public class Main {
    public static void main(String[] args) {
        //PRIMERA ENTREGA

        System.out.println(suma(1,2, 20));

        Coche coche = new Coche();
        coche.agregarPuerta();
        System.out.println(coche.puerta);

        //SEGUNDA ENTREGA

        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es 0");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println((numeroFor));
        }

        String estacion = "invierno";
        switch (estacion){
            case"verano":
                System.out.println("La estación es verano");
                break;
            case"otoño":
                System.out.println("La estación es otoño");
                break;
            case"invierno":
                System.out.println("La estación es invierno");
                break;
            case"primavera":
                System.out.println("La estación es primavera");
                break;
            default:
                System.out.println("No pertenece a ninguna estación del año");
                break;
        }
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
