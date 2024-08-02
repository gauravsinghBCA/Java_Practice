import java.time.*;

 public class date_time {
    
    public static void main(String[] args)  {
        
        LocalDate local = LocalDate.now();
        System.out.println(local);
        int day = local.getDayOfMonth();
        int month = local.getMonthValue();
        int year = local.getYear();
        System.out.println(day + "/" + month + "/" + year);
         
        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour = time.getHour();
        int minut = time.getMinute();
        int second = time.getSecond();

        System.out.println(hour+"/" + minut+ "/"+ second);
        
    }
}
