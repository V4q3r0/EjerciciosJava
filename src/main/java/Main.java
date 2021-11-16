public class Main {
    public static void main(String[] args) {
        //variables
        int i = 1, numero;
        //números pares
        System.out.println("NÚMEROS PARES!!");
        while(i<=100){
            numero = i % 2;
            if(numero == 0){
                System.out.println(i);
            }
            i++;
        }
        //Números impares
        System.out.println("NÚMEROS IMPARES!!");
        i = 1;
        while(i<=100){
            numero = i % 2;
            if(numero != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
