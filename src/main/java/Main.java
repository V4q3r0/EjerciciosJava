public class Main {
    public static void main(String[] args) {
        //Variables
        int conSerie=0, conVideoJuego=0, maySerie = 0, mayVideoJuego= 0, aux, aux2;
        //Array de los objetos: 5 cada uno.
        Serie serie[] = new Serie[5];
        Videojuego videojuego[] = new Videojuego[5];

        //Creamos los objetos
        serie[0] = new Serie();
        serie[1] = new Serie("La casa de papel", "Alex Pina");
        serie[2] = new Serie("Hijos de la anarquia", 7, "Acción", "Kurt Sutter");
        serie[3] = new Serie("Dark", 3, "Ciencia ficción", "Baran on Odar");
        serie[4] = new Serie("Peaky Blinders", 5, "Drama histórico", "Steven Knight");
        serie[1].entregar();
        serie[2].entregar();
        serie[3].entregar();

        videojuego[0] = new Videojuego();
        videojuego[1] = new Videojuego("Hitman 3", 200);
        videojuego[2] = new Videojuego("Gta 5", 400, "Acción", "Rockstar Games");
        videojuego[3] = new Videojuego("Gta San Andreas", 500, "Acción/Aventura", "Rockstar Games");//El dato de horas es solo para testear
        videojuego[4] = new Videojuego("Need for speed", 120, "Carreras", "EA Canada");
        videojuego[1].entregar();
        videojuego[2].entregar();
        videojuego[3].entregar();

        //Iniciamos las variables auxiliares con el último Array del objeto
        //Es necesario a la hora de comparar cual tiene mayor horas o temporadas
        aux = serie.length-1;
        aux2 = videojuego.length-1;
        //Bucle para realizar las acciones y efectuar en cada objeto según el array
        for(int i = 0; i <= serie.length-1 && i <= videojuego.length-1; i++){
            if(serie[i].isEntregado() == true){
                conSerie += 1;
                serie[i].devolver();
            }
            if (videojuego[i].isEntregado() == true){
                conVideoJuego += 1;
                videojuego[i].devolver();
            }
            for(int j = 0; j <= serie.length-1 && j <= videojuego.length-1; j++){
                if(i != j){
                    if(serie[i].compareTo(serie[j])){
                        maySerie = i;
                    }else{
                        maySerie = j;
                    }
                    if(serie[aux].compareTo(serie[maySerie])){
                        maySerie = aux;
                    }else{
                        aux = maySerie;
                    }
                    if(videojuego[i].compareTo(videojuego[j])){
                        mayVideoJuego = i;
                    }else{
                        mayVideoJuego = j;
                    }
                    if(videojuego[aux2].compareTo(videojuego[mayVideoJuego])){
                        mayVideoJuego = aux2;
                    }else{
                        aux2 = mayVideoJuego;
                    }
                }
            }
        }

        //Mostramos los datos finales!!
        System.out.println("Hay "+conSerie+" series entregadas.");
        System.out.println("Hay "+conVideoJuego+" videojuegos entregados.");

        System.out.println("\nLa serie con más temporadas es: ");
        System.out.println(serie[maySerie].toString());

        System.out.println("\nEl videojuego con más horas estimadas es: ");
        System.out.println(videojuego[mayVideoJuego].toString());

    }
}
