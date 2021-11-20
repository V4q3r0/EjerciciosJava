public class Persona {
    //Atributos
    private static final char valorSexo = 'M';//Const
    private String nombre = "";
    private String edad = "";
    private String DNI;
    private char sexo = valorSexo;
    private int peso;
    private float altura;

    //Metodos y constructores
    public Persona(){
        generarDNI();
    }

    public Persona(String nombre, String edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
        generarDNI();
    }

    public Persona(String nombre, String edad, char sexo, int peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        generarDNI();
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        //Pero ideal es igual a peso/(altura^2)
        float ideal = (float) (this.peso/(Math.pow(this.altura,2)));
        if(ideal > 0 && ideal < 20){
            final int valor = -1;
            return valor;
        }else if(ideal >= 20 && ideal <= 25){
            final int valor = 0;
            return valor;
        }else{
            final int valor = 1;
            return valor;
        }
    }

    public Boolean esMayorDeEdad(){
        if(Integer.parseInt(this.edad) >= 18){
            return true;
        }else{
            return false;
        }
    }

    private void comprobarSexo(char sexo){
        switch (sexo){
            case 'M':
                this.sexo = sexo;
                break;
            case 'F':
                this.sexo = sexo;
                break;
            default:
                this.sexo = valorSexo;
        }
    }

    //Método toString para mostrar los datos del objeto
    public String toString(){
        String cadena = "Nombre: "+nombre+"\nEdad: "+edad+"\nDNI: "+DNI+"\nSexo: "+sexo+"\nPeso: "+peso+"\nAltura: "+altura+"\n";

        return cadena;
    }

    //Generamos un número de 8 digitos aleatorio y cambiamos los números por letras [A,B,C,D,E,F,G,H,I,J]
    private void generarDNI(){
        int num = (int)(Math.random()*(99999999-00000000+1)+10000000);
        String DNI = "", DNIFalso = String.valueOf(num);
        for(int i = 0; i < DNIFalso.length(); i++){
            if(DNIFalso.charAt(i) == '0'){
                DNI += 'A';
            }else if(DNIFalso.charAt(i) == '1'){
                DNI += 'B';
            }else if(DNIFalso.charAt(i) == '2'){
                DNI += 'C';
            }else if(DNIFalso.charAt(i) == '3'){
                DNI += 'D';
            }else if(DNIFalso.charAt(i) == '4'){
                DNI += 'E';
            }else if(DNIFalso.charAt(i) == '5'){
                DNI += 'F';
            }else if(DNIFalso.charAt(i) == '6'){
                DNI += 'G';
            }else if(DNIFalso.charAt(i) == '7'){
                DNI += 'H';
            }else if(DNIFalso.charAt(i) == '8'){
                DNI += 'I';
            }else if(DNIFalso.charAt(i) == '9'){
                DNI += 'J';
            }
        }
        this.DNI = DNI;
    }
}
