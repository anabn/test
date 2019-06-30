package database;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println("\t Please, enter the name of people who like this post: (use \"Enter\" or \"Return\") \n"
                + "(When you're done, enter \"Exit\" in a new line): ");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> createList = new ArrayList<String>();
            while (true)
            {
                String data = reader.readLine();
                if(data.equals("exit") || data.equals("Exit")){
                    createList.add(data);
                    break;
                }
                else {
                    createList.add(data);
                }
            }
            reader.close();
            createList.remove(createList.size() - 1);
            arrayList = createList;
        } catch (IOException e) {
            e.printStackTrace();
        }

        Array.getLikes(arrayList);
    }

}
