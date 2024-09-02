import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UtilDates {

    public String getInstant() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getTimeStamp() {

        int seconds = 62 % 60;

        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"));
    }

    public String test(int seconds) {
        int days = seconds / 86400;

        int hours = seconds / 3600;

        int minutes = seconds / 60;

        int seconds1 = seconds % 60;

        return "days: " + days + " hours: " + hours + " minutes: " + minutes + " seconds : " + seconds1;

    }


}
