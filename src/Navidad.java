import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class Navidad {
    public static void main(String[] args) {
        LocalDate navidad = LocalDate.of(2023, Month.DECEMBER, 25);
        System.out.println("Los dias faltantes para navidad son: "+ ChronoUnit.DAYS.between(LocalDate.now(), navidad));

        LocalDate muertos = LocalDate.of(2024, Month.NOVEMBER, 02);
        System.out.println("Los dias faltantes para dia de muertos son: "+ ChronoUnit.DAYS.between(LocalDate.now(), muertos));
    }
}
