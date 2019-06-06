package br.com.amcosta.learnjava;

import br.com.amcosta.learnjava.csv.ReadCSV;

import java.io.IOException;

public class App {
    public static void main(String[] args) {

        String filepath = System.getProperty("user.dir") + "/assets/usuarios.csv";
        ReadCSV readCSV = new ReadCSV(filepath);
        System.out.println(readCSV.getFilepath());

        System.out.println(System.getProperty("user.dir") );

        try {
            readCSV.process();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
