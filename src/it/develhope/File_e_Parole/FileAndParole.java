package it.develhope.File_e_Parole;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileAndParole {

    public static void stampaParole(Path file) throws IOException {
        FileReader fr = new FileReader(file.toFile());
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()) {
            String[] parole = br.readLine().split(" ");
            Arrays.stream(parole).forEach(System.out::println);
        }
        br.close();
        Files.lines(file).forEach(riga -> {
            Arrays.stream(riga.split(" ")).forEach(System.out::println);
        });
    }

    public static Map<String,Integer> occorrenzaParole(Path file) throws IOException {
        FileReader fr = new FileReader(file.toFile());
        BufferedReader br = new BufferedReader(fr);
        Map<String,Integer> countParole = new HashMap<>();
        while(br.ready()) {
            String[] parole = br.readLine().split(" ");
            for(String parola : parole) {
                if(!countParole.containsKey(parola)) {
                    countParole.put(parola, 1);
                } else {
                    countParole.put(parola, countParole.get(parola) + 1);
                }
            }
        }
        br.close();
        return countParole;
    }

    public static Map<String,Integer> occorrenzaParoleTesto(Path file) throws IOException {
        FileReader fr = new FileReader(file.toFile());
        BufferedReader br = new BufferedReader(fr);
        Map<String,Integer> countParole = new HashMap<>();
        while(br.ready()) {
            String[] parole = br.readLine().toLowerCase().split("\\W+");
            for(String parola : parole) {
                if(parola.length() == 0) continue;
                if(!countParole.containsKey(parola)) {
                    countParole.put(parola, 1);
                } else {
                    countParole.put(parola, countParole.get(parola) + 1);
                }
            }
        }
        br.close();
        return countParole;
    }

    public static Map<String,Set<String>> paroleInRima(Path file) {
        return null;
    }
}
