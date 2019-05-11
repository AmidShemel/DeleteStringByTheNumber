import java.io.*;

/**
 * Программа удаляет строку по заданному номеру
 */

public class Main {
    public static void main(String[] args) {

        int count = 0;
        int sToDel = 5; // Номер строки которую нужно удалить

        try{
            BufferedReader br = new BufferedReader(new FileReader("src/1.txt"));
            String line = "", line2 = "";
            while ((line = br.readLine()) != null) {
                count++;
                if (count!=sToDel) line2 = line2 + line + "\n";
            }
            br.close();

            FileWriter pw = new FileWriter ("src/2.txt", false);
            pw.write(line2);
            pw.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        /*
        int count = 0;
        int sToDel = 7;

        try{
            BufferedReader br = new BufferedReader(new FileReader("src/1.txt"));
            FileWriter pw = new FileWriter ("src/2.txt", false);
            String line = "";
            while ((line = br.readLine()) != null) {
                count++;
                if(count==sToDel){
                    line = "";
                } else {
                    pw.write(line + "\n");
                    //pw.flush();
                }
            }
            br.close();
            pw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
         */

        //file1.delete();
        //file1.renameTo(file1);
    }
}



