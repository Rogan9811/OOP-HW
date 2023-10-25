package Service;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcLogger {
    File file = new File("Logs.txt");
    FileWriter writer;
    BufferedReader reader;

    public void write(String record) {
        try {
            if (file.exists()) this.writer = new FileWriter(file, true);
            else this.writer = new FileWriter(file);

            Date currentDate = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String dataTime = simpleDateFormat.format(currentDate);
            String addDate = dataTime + "-" + record;
            writer.write(addDate + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String read() {
        String res = "";
        boolean flag = true;

        try {
            this.reader = new BufferedReader(new FileReader(file));

            while (flag) {
                String temp = reader.readLine();

                if (temp == null) flag = false;
                res += temp + "\n";
            }

            reader.close();
        }

        catch (IOException e){throw new RuntimeException(e);}
        return res;
    }
}
