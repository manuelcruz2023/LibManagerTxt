package co.edu.uptc.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManagerTxt {

    private BufferedReader br;

    public List<String> readTxt(String path) throws IOException {
        List<String> text = new ArrayList<>();
        File file = new File(path);
        FileReader fr = new FileReader(file);
        br = new BufferedReader(fr);
        String line = "";
        while (br.readLine() != null) {
            text.add(line += br.readLine());
        }
        fr.close();
        br.close();
        return text;
    }

    public void writeTxt(List<String> lines, String path) throws IOException {
        File file = new File(path);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String line : lines) {
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
}
