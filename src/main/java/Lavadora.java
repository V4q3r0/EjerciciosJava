public class Lavadora extends Electrodomestico{

    //Constante de valores por defecto
    private static final int defCarga = 5;

    //Atributos
    private int carga;

    //Constructores
    public Lavadora(){
        this.carga = defCarga;
    }

    public Lavadora(int precio, int peso){
        new Electrodomestico();
        setPrecioBase(precio);
        setPeso(peso);
    }

    public Lavadora(int carga){
        this.carga = carga;
        new Electrodomestico();
    }

    //Get para obtener el valor de carga
    public int getCarga(){return this.carga;}

    //Método para sumar el precio del producto
    public void precioFinal(){
        if(this.carga > 30){
            precioFinal(50);
        }else{
            precioFinal(0);
        }
    }
}
