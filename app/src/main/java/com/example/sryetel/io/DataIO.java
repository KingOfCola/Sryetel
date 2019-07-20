package com.example.sryetel.io;

import com.example.sryetel.model.QuestionBank;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DataIO {
    public static QuestionBank readQuestions(File file) {
        return new QuestionBank();
    }
    /*
    public List<List<String>> readCSV(File file) {
        List<List<String>> records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader("book.csv"));) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        }
    }*/
}
