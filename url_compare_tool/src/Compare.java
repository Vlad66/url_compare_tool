import java.io.*;
import java.util.ArrayList;


public class Compare {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        // Paste here the path to file with URLs (pls do not forget to remove domain), choose as 1st file list with the greatest amount of rows
        String path = "/Users/mac/Desktop/Test.txt";
        FileReader file = new FileReader(new File(path));
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(file);
        while (true) {
            String s = reader.readLine();
            if (s != null) {
                list.add(s);
            } else break;
        }

        // Paste here the path to 2nd file with URLs (pls do not forget to remove domain)
        String path2 = "/Users/mac/Desktop/Result.txt";
        FileReader file2 = new FileReader(new File(path2));
        ArrayList<String> list2 = new ArrayList<>();
        BufferedReader reader2 = new BufferedReader(file2);
        while (true) {
            String e = reader2.readLine();
            if (e != null) {
                list2.add(e);
            } else break;
        }
        read.close();
        reader.close();


        // It should be overwritten
        //boolean hasPair = false;
        //while (!hasPair) {

        String compareTo;
        String compareWith;
            for (int i = 0; i < list.size(); i++) {
                compareTo = list.get(i);
                compareWith = list2.get(i);
                if (compareTo.equals(compareWith)){
                    System.out.println(compareTo + " = " + compareWith);
                }
            }
            }
}
        //}




