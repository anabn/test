package database;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String file = "niks";
        System.out.println("\t Please, enter the name of people who like this post \n"
                + "(When you're done, enter \"Exit\" in a new line): ");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outputStream = new FileOutputStream(file);

            while (true)
            {
                String data = reader.readLine();
                if(data.equals("exit")){
                    outputStream.write(data.getBytes());
                    break;
                }
                else {
                    outputStream.write((data +"\r\n").getBytes());
                }
            }
            outputStream.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ArrayList<String> list = Array.createArray(new FileInputStream(file));
            Array.getLikes(list);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
