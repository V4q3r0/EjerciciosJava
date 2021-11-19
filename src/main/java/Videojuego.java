public class Videojuego implements Entregable{
    //Variables const por defecto
    private static int defHoras = 10;
    private static boolean defEntregado = false;

    //Atributos
    private String titulo;
    private int horas;
    private boolean entregado;
    private String genero;
    private String compania;

    //Constructores
    public Videojuego(){
        this.titulo = "";
        this.horas = defHoras;
        this.entregado = defEntregado;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horas){
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = defEntregado;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horas, String genero, String compania){
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = defEntregado;
        this.genero = genero;
        this.compania = compania;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    //Método para mostrar los datos del objeto
    public String toString(){
        String YesNo;
        if (entregado) {
            YesNo = "Si";
        }else{
            YesNo = "No";
        }
        String cadena = "Titulo: "+titulo+"\nHoras estimadas: "+horas+"\nEntragado: "+YesNo+"\nGenero: "+genero+"\nCompañia: "+compania;
        return  cadena;
    }

    //Métodos de la interface
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    //Método para comparar qué objeto tiene mayor horas estimadas
    @Override
    public boolean compareTo(Object a) {
        if(a instanceof Videojuego){
            if(horas > ((Videojuego) a).getHoras()){
                return true;
            }else{
                return false;
            }
        }else{
            System.out.println("El objeto no es valido.");
            return false;
        }
    }
}
