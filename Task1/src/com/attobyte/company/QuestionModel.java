package com.attobyte.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class QuestionModel {
    public String sendData(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String data = "";
        while(scanner.hasNext()){
            data+=scanner.nextLine();
        }
        return data;
    }
}
