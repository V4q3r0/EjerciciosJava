import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto para recibir datos por teclado
        Scanner entrada = new Scanner(System.in);
        //Variable
        String cadena;
        char temp;
        System.out.println("Escribe una frase: ");
        cadena = entrada.nextLine();
        int a,e,i,o,u,space;
        a=e=i=o=u=space=0;
        space = cadena.length();
        System.out.println("La cantidad de carácteres de "+cadena+" con espacios es: "+space);
        for(int j = 0; j<cadena.length(); j++){
            temp = cadena.charAt(j);
            if(temp == 'a' || temp == 'A'){
                a++;
            }else if(temp == 'e' || temp == 'E'){
                e++;
            }else if(temp == 'i' || temp == 'I'){
                i++;
            }else if(temp == 'o' || temp == 'O'){
                o++;
            }else if(temp == 'u' || temp == 'U'){
                u++;
            }else if(temp == ' '){
                space--;
            }
        }
        System.out.println("La cantidad de carácteres de "+cadena+" sin espacios es: "+space);
        System.out.println("La cantidad de vocales a en la frase es: "+a);
        System.out.println("La cantidad de vocales e en la frase es: "+e);
        System.out.println("La cantidad de vocales i en la frase es: "+i);
        System.out.println("La cantidad de vocales o en la frase es: "+o);
        System.out.println("La cantidad de vocales u en la frase es: "+u);
    }
}
