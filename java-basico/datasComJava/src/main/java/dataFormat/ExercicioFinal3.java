package dataFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ExercicioFinal3 {
    public static void main(String[] args) {
        Date dataAgora = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY  HH:MM:SS:MMM");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY  hh:mm:ss:SSS");
        /**
         * D = Dia do Ano
         * M =  Mes do Ano
         * Y = Ano, semana
         * H = hora dia (0-23)
         * S = Millisegundos
         *
         * */

        String dataToStr = sdf.format(dataAgora);
        String dataToStr2 = sdf2.format(dataAgora);

        System.out.println(dataToStr);
        System.out.println(dataToStr2);




    }

}
