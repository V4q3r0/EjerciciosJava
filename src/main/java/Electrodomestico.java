import java.util.Locale;

public class Electrodomestico {

    //Constantes para los valores por defecto
    private static final String defColor = "blanco";
    private static final int defPrecio = 100;
    private static final char defConsumo = 'F';
    private static final int defPeso = 5;

    //Atributos
    protected int precioBase;
    protected String color;
    protected char consumo;
    protected int peso;

    //Constructores y métodos
    public Electrodomestico(){
        this.precioBase = defPrecio;
        this.peso = defPeso;
        this.consumo = defConsumo;
        this.color = defColor;
    }

    public Electrodomestico(int precio, int peso){
        this.precioBase = precio;
        this.peso = peso;
        this.color = defColor;
        this.consumo = defConsumo;
    }

    public Electrodomestico(int precio, String color, char consumo, int peso){
        this.precioBase = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Métodos para comprobar si los datos ingresados son validos o se efecturán los por defecto
    private void comprobarConsumoEnergetico(char letra){
        switch (letra){
            case 'A':
                this.consumo = letra;
                break;
            case 'B':
                this.consumo = letra;
                break;
            case 'C':
                this.consumo = letra;
                break;
            case 'D':
                this.consumo = letra;
                break;
            case 'E':
                this.consumo = letra;
                break;
            case 'F':
                this.consumo = letra;
                break;
            default:
                this.consumo = defConsumo;
        }
    }

    private void comprobarColor(String color){
        String cadena = color.toLowerCase();
        switch (cadena){
            case "blanco":
                this.color = color;
                break;
            case "negro":
                this.color = color;
                break;
            case "rojo":
                this.color = color;
                break;
            case "azul":
                this.color = color;
                break;
            case "gris":
                this.color = color;
                break;
            default:
                this.color = defColor;
        }
    }

    //Función para darle el valor final al precio del producto
    public void precioFinal(float valor){
        this.precioBase += valor;
        switch (this.consumo){
            case 'A':
                this.precioBase += 100;
                break;
            case 'B':
                this.precioBase += 80;
                break;
            case 'C':
                this.precioBase += 60;
                break;
            case 'D':
                this.precioBase += 50;
                break;
            case 'E':
                this.precioBase += 30;
                break;
            case 'F':
                this.precioBase += 10;
                break;
            default:
                this.consumo = defConsumo;
        }
        if(this.peso >= 0 && this.peso <= 19){
            this.consumo += 10;
        }else if(this.peso >= 20 && this.peso <= 49){
            this.consumo += 50;
        }else if(this.peso >= 50 && this.peso <= 79){
            this.consumo += 80;
        }else{
            this.peso += 100;
        }
    }
}
