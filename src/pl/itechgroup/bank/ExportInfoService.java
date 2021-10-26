package pl.itechgroup.bank;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicReference;

public class ExportInfoService {
    public static void exportInfo(List<? extends IInformation> informations, String filePath)
    {

       StringBuffer temp = new StringBuffer("");
        informations.forEach(iInformation -> temp.append(iInformation.getInfo()).append("\n"));

        try {

            Files.writeString(Paths.get(filePath), temp.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
