public class Main {
    public static void main(String[] args) {
        //variable
        int numero;
        //Números pares
        System.out.println("NÚMEROS PARES!!");
        for(int i = 1; i<=100; i++){
            numero = i % 2;
            if(numero == 0){
                System.out.println(i);
            }
        }
        //Números impares
        System.out.println("NÚMEROS IMPARES!!");
        for(int i = 1; i<=100; i++){
            numero = i % 2;
            if(numero != 0){
                System.out.println(i);
            }
        }
    }
}
