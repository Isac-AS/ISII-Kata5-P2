package kata5p2.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderBD {
    
    public static List<String> read(String fileName) {

        ArrayList<String> list = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while (true) {
                String lineText = reader.readLine();
                if (lineText == null) {
                    break;
                }
                if (lineText.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
                    list.add(lineText);
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("ERROR MailListReader::read FileNotFoundException" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERROR MailListReader::read IOException" + ex.getMessage());
        }
        return list;
    }
}
