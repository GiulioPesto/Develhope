package it.develhope.File_e_Parole;

import java.io.File;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path file1 = new File("resources/roba.txt").toPath();
        Path file2 = new File("resources/alice_in_borderland.txt").toPath();
    }
}
