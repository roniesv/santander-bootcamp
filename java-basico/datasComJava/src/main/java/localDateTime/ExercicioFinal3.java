package localDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class ExercicioFinal3 {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);
        LocalTime horaAgora = LocalTime.now();
        System.out.println(horaAgora);
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        // resolucao
        LocalDateTime dataNoPassado = LocalDateTime.of(2010, 5, 15, 10, 00,00);
        System.out.println(dataNoPassado);
        LocalDateTime dataAtualizada;
        dataAtualizada = dataNoPassado.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(dataAtualizada);
    }
}
