public class Videojuego implements Entregable{
    private static int defHoras = 10;
    private static boolean defEntregado = false;

    private String titulo;
    private int horas;
    private boolean entregado;
    private String genero;
    private String compania;

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
}
