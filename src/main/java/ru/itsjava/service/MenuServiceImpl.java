package ru.itsjava.service;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MenuServiceImpl implements MenuService {

    @Override
    @SneakyThrows
    public void menuReader(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

