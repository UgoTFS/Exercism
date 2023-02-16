import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {

    LocalDateTime dateTime;

    public Gigasecond(LocalDate moment) {
        this.dateTime = LocalDateTime.of(moment, LocalTime.of(0, 0, 0, 0));
        this.dateTime = this.dateTime.plusSeconds(1_000_000_000);
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment.plusSeconds(1_000_000_000);
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }
}
