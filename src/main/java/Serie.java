public class Serie implements Entregable{
    private static int defNumTemporadas = 3;
    private static boolean defEntregado = false;

    private String titulo;
    private int numTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(){
        this.titulo = "";
        this.numTemporadas = defNumTemporadas;
        this.entregado = defEntregado;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.numTemporadas = defNumTemporadas;
        this.genero = "";
        this.entregado = defEntregado;
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador){
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = defEntregado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String toString(){
        String YesNo;
        if(entregado){
            YesNo = "Si";
        }else{
            YesNo = "No";
        }
        String cadena = "Titulo: "+titulo+"\nNúmero temporadas: "+numTemporadas+"\nEntragado: "+YesNo+"\nGenero: "+genero+"\nCreador: "+creador;
        return cadena;
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
