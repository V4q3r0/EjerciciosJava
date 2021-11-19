import java.util.Locale;

public class Electrodomestico {

    private static final String defColor = "blanco";
    private static final int defPrecio = 100;
    private static final char defConsumo = 'F';
    private static final int defPeso = 5;

    private int precioBase;
    private String color;
    private char consumo;
    private int peso;

    public Electrodomestico(){}

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
}
