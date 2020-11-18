import java.io.*;
import java.util.ArrayList;


public class Compare {
    public static void main(String[] args) throws IOException {
        System.out.println("test");

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        // Paste here the path to file with URLs (pls do not forget to remove domain)
        String path = "/Users/mac/Desktop/Test.txt";
        FileReader file = new FileReader(new File(path));
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(file);
        while (true) {
            String s = reader.readLine();
            if (s != null){
                list.add(s);
            }
            else break;
        }

        read.close();
        reader.close();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i=0; i<list.size();i++) {
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
