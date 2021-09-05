package fImplementingConcurrency.m3;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Ex11CopyOnWrite {

    public static void main(String[] args) {

        //TODO Search for CopyOnWrite classes in java. Examples and when they are usually used

        // as soon as the Collection is modified, a copy gets made
        List<String> listCopyOnWrite = new CopyOnWriteArrayList<>();
        listCopyOnWrite.add("Squirrel");
        listCopyOnWrite.add("Mouse");
        listCopyOnWrite.add("Cat");
        listCopyOnWrite.add("Pangolin");


        for (String animal: listCopyOnWrite) {
            System.out.println(animal);
            listCopyOnWrite.add(animal);
        }

        // the list we are looping over, is different that the one we are writing to
        System.out.println(listCopyOnWrite);


        Set<String> setCopyOnWrite = new CopyOnWriteArraySet<>();
        setCopyOnWrite.add("Squirrel");
        setCopyOnWrite.add("Mouse");
        setCopyOnWrite.add("Cat");
        setCopyOnWrite.add("Pangolin");

        for (String animal: setCopyOnWrite) {
            System.out.println(animal);
            setCopyOnWrite.add(animal);
        }


        // because set can contain only unique values, it will prin the same set
        System.out.println(setCopyOnWrite);






    }
}
