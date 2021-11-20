public class Television extends Electrodomestico{

    //Constantes de valores por defecto
    private static final float defResolucion = 20;
    private static final boolean defSintonizador = false;

    //Atributos
    private float resolucion;
    private boolean sintonizador;

    //Constructores
    public Television(){
        this.resolucion = defResolucion;
        this.sintonizador = defSintonizador;
    }

    public Television(int precio, int peso){
        setPrecioBase(precio);
        setPeso(peso);
        new Electrodomestico();
    }

    public Television(float resolucion, boolean sintonizador){
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
        new Electrodomestico();
    }

    //Getters and setters
    public float getResolucion(){return resolucion;}

    public boolean getSintonizador(){return sintonizador;}

    //Método para sumar algunos valores a el precio del producto
    public void precioFinal(){
        int precio = getPrecioBase();
        int incremento = precio * 30 / 100;
        if(this.resolucion > 40){
            if(this.sintonizador){
                precioFinal(incremento+50);
            }else{
                precioFinal(incremento);
            }

        }else{
            if(this.sintonizador){
                precioFinal(50);
            }else{
                precioFinal(0);
            }
        }
    }
}
