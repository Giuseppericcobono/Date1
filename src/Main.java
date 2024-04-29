//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String data1Full = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Data completa: " + data1Full);

        String data2Medium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Data media: " + data2Medium);

        String data3Short = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Data corta: " + data3Short);
    }
}