public class App {

    static void condicionalExercise() {
        int numerolf = 1;

        if (numerolf == 0) {
            System.out.println("El numero es 0");
        } else if (numerolf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }
    }

    static void whileExercise() {
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
    }

    static void doWhileExercise() {
        int numeroWhile = 3;

        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
    }

    static void forExercise() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    static void switchExercise(String estacion) {

        switch (estacion) {
            case "Invierno":
                System.out.println("Estamos en Invierno.");
                break;
            case "Primavera":
                System.out.println("Estamos en Primavera.");
                break;
            case "Verano":
                System.out.println("Estamos en Verano.");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño.");
                break;
            default:
                System.out.println("La variable introducida no es ninguna estacion.");
        }
    }

    public static void main(String[] args) throws Exception {

        condicionalExercise();

        System.out.println();

        whileExercise();

        System.out.println();

        doWhileExercise();

        System.out.println();

        forExercise();

        System.out.println();

        switchExercise("Verano");
    }
}