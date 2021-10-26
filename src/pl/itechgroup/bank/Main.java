package pl.itechgroup.bank;

import java.security.Provider;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("40i4", "Mickiewicz", "6g9wv59w9",55, 178),
                new Person("Kamil", "Skipp", "82q65v8tc",36, 177),
                new Person("Mikolaj", "Sandor", "661dsf[dd",41, 163));
        ExportInfoService.exportInfo(persons, "C:\\Users\\ZSE\\Desktop\\export.txt");
    }

}