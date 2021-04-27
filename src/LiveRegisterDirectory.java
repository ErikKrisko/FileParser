import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class LiveRegisterDirectory {
    ArrayList<LRGStat> list = new ArrayList<>();
    File file;

    Scanner sc;
    String lineHeaders = "";

    public LiveRegisterDirectory(File file) {
        try {
            this.file = file;
            sc = new Scanner(file, StandardCharsets.ISO_8859_1);
            if(sc.hasNextLine()){
                lineHeaders = sc.nextLine();
            }
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                if(s.charAt(0) != ','){
                    list.add(new LRGStat(s));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String outputData() {
        String p = "";

        for(LRGStat lrg : list){
            p += "Code: " + lrg.getCode() + "\n"
                    + "Name: " + lrg.getName() + "\n"
                    + "IGX: " + lrg.getIGX() + "\n"
                    + "IGY: " + lrg.getIGY() + "\n"
                    + "County: " + lrg.getCounty() + "\n\n";
        }

        return p;
    }
}
