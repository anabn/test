package database;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    public static ArrayList<String> createArray(FileInputStream file) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String s = scanner.next();
            list.add(s.toLowerCase());
        }
        list.remove(list.size() - 1);
        return list;
    }
    private static ArrayList<String> deleteEq(ArrayList<String> list){
        ArrayList<String> people = list;
        Object[] st = people.toArray();
        for (Object s : st) {
            if (people.indexOf(s) != people.lastIndexOf(s)) {
                people.remove(people.lastIndexOf(s));
            }
        }
        return people;
    }

    public static ArrayList<String> getLikes(ArrayList<String> list){

        ArrayList<String> peoples = deleteEq(list);

        if(peoples.size() == 0){
            System.out.println("no likes for this post");
        } else if(list.size() == 1) {
            System.out.println(peoples.get(0) + " likes this post");
        } else if(peoples.size() == 2 ) {
            System.out.println(peoples.get(0) + ", " +peoples.get(1) + " like this post");
        } else if(peoples.size() == 3) {
            System.out.println(peoples.get(0) + ", " + peoples.get(1) + " and " + peoples.get(2) + " like this post");
        } else {
            int count = peoples.size() - 2;
            System.out.println(peoples.get(0) + ", " + peoples.get(1) + " and " + count + " others like this post");
        }
        return null;
    }

}
