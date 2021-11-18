import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Utilizamos la clase para crear el formato para la fecha y hora (como la queremos mostrar)
        //yyyy = años, mm = mes, dd = dia, hh = hora, mm = minutos, ss = segundos
        DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/mm/dd hh/mm/ss");

        //Mostramos la fecha y hora actual (now) usando el formato
        System.out.println("La fecha y hora actual es: "+time.format(LocalDateTime.now()));
    }
}
