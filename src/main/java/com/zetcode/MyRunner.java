package com.zetcode;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MyRunner {

    public void run() throws IOException {

        String fileName = "/data.txt";

        InputStream is = SimpleJavaEx.class.getResourceAsStream(fileName);
        // FileInputStream fis = new FileInputStream(is
        try (
                InputStreamReader isr = new InputStreamReader(is,
                        StandardCharsets.UTF_8);
                CSVReader reader = new CSVReader(isr)) {
            String[] nextLine;

            List<Integer> vals = new ArrayList<>();

            while ((nextLine = reader.readNext()) != null) {

                for (String e : nextLine) {
                    vals.add(Integer.valueOf(e.trim()));
                    //System.out.format("%s %n", e);
                }
            }

            //vals.forEach(e -> { System.out.println(e); } );

            System.out.printf("The max is: %d%n", MyStats.max(vals));
            System.out.printf("The max is: %d%n", MyStats.min(vals));
        }
    }
}
