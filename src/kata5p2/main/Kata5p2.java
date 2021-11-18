package kata5p2.main;

import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReader;
import kata5p2.view.MailListReaderBD;

public class Kata5p2 {
    
    private static String fileName;
    private static List<String> stringMailList;
    private static Histogram<String> histogram;
    private static HistogramDisplay histoDisplay;

    public static void main(String[] args) {
        fileName = "email.txt";
        execute();
    }
    
    private static void execute() {
        input();
        process();
        output();
        histoDisplay.execute();
    }
    
    private static void input() {
        stringMailList = MailListReaderBD.read(fileName);
    }
    
    private static void process() {
        histogram = MailHistogramBuilder.buildFromStrings(stringMailList);
    }

    private static void output() {
        histoDisplay = new HistogramDisplay(histogram);
    }
}
