public class Main {
    public static void main(String[] args) {
        //Variable
        String cadena = "La sonrisa sera la mejor arma contra la tristeza", cadena2;
        //Reemplazamos las a del String por e
        cadena2 = cadena.replace('a', 'e');
        //Mostramos por consola el string con sus cambios y concatenamos una frase.
        System.out.println(cadena2+", no te compliques la vida, disfruta, no te quejes, aprende, no te enojes, sonrie.");
    }
}
