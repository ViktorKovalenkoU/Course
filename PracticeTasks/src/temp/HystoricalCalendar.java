package temp;

import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Locale;

public class HystoricalCalendar{
    public static void main(String[] args) {

    }
    public static FormatterConfigurer calendar() {
        return new FormatterConfigurer() {
            @Override
            public void configure(DateTimeFormatterBuilder builder) {
                builder.appendValue(ChronoField.YEAR_OF_ERA)
                        .appendLiteral(" of ")
                        .appendText(ChronoField.ERA, TextStyle.FULL)
                        .appendLiteral(" (")
                        .appendChronologyId()
                        .appendLiteral(")")
                        .toFormatter(Locale.ENGLISH);
            }
        };
    }
}
