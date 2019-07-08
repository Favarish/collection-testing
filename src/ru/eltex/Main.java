package ru.eltex;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        long temp;
        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        long startProgramm = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            hashSet.add(i);
        }
        long addHashSet1 = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            hashMap.put(i, i);
        }
        long addHashMap2 = System.nanoTime();

        /*Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
                iterator.remove();
        }*/
        hashSet.remove(999);
        long deleteHashSet3 = System.nanoTime();

        Set set = hashMap.keySet();

        temp = System.nanoTime();
        /*Iterator itr = set.iterator();
        while (itr.hasNext())
        {
            Object o = itr.next();
            //hashMap.remove(o.toString()); //remove the pair if key length is less then 3
            itr.remove();
        }*/
        hashMap.remove(999);
        long deleteHashMap4 = System.nanoTime();


        System.out.println("Добавление в hashSet: " + (addHashSet1 - startProgramm));
        System.out.println("Добавление в hashMap: " + (addHashMap2 - addHashSet1) + "\n");

        System.out.println("Удаление из hashSet: " + (temp - addHashMap2));
        System.out.println("Удаление из hashMap: " + (deleteHashMap4 - temp) + "\n\n");



        long start2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        long addLinkedList = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        long addArrayList = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            treeSet.add(i);
        }
        long addThreeSet = System.nanoTime();


        linkedList.remove(999);
        long deleteLinkedList = System.nanoTime();


        arrayList.remove(0);
        long deleteArrayList = System.nanoTime();

        treeSet.remove(999);
        long deleteThreeSet= System.nanoTime();

        System.out.println("Добавление в linkedList: " + (addLinkedList - start2));
        System.out.println("Добавление в arrayList: " + (addArrayList - addLinkedList));
        System.out.println("Добавление в treeSet: " + (addThreeSet - addArrayList) + "\n");

        System.out.println("Удаление из linkedList: " + (deleteLinkedList - addThreeSet));
        System.out.println("Удаление из arrayList: " + (deleteArrayList - deleteLinkedList));
        System.out.println("Удаление из treeSet: " + (deleteThreeSet - deleteArrayList));
    }
}
