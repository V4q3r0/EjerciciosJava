public class Main {
    public static void main(String[] args) {
        //variables
        int a = 10, b = 20, mayor = 0;
        if(a == b){
            System.out.println("Los números son iguales.");
            System.exit(0);
        }else if(a > b){
            mayor = a;
        }else{
            mayor = b;
        }
        System.out.println("Entre los números "+a+" y "+b+" el mayor es: "+mayor);
    }
}
