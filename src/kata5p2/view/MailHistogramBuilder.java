package kata5p2.view;

import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> build (List<Mail> mailList) {
        Histogram<String> histogram = new Histogram<>();
        for (Mail mail : mailList) 
            histogram.increment(mail.getDomain());
        
        return histogram;
    }
}
