package br.com.amcosta.learnjava.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

    private String filepath;
    private BufferedReader reader;


    public ReadCSV(String filepath) {
        this.filepath = filepath;

        try {
            this.reader = new BufferedReader(new FileReader(filepath));
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo " + filepath + "não foi encontado");
        }
    }

    public String getFilepath() {
        return this.filepath;
    }

    public void process() throws IOException {
        String line;

        while ((line = this.reader.readLine()) != null) {

            String[] data = line.split(";");
            System.out.println(data[0]);

        }
    }
}
