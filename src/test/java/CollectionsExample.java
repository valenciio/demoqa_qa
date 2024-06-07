import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeMap;

public class CollectionsExample {

    static class ArrayListExample {
        private ArrayList<Integer> arrayList = new ArrayList<>();

        public void addElement(int element) {
            arrayList.add(element);
        }

        public boolean removeElement(int element) {
            return arrayList.remove(Integer.valueOf(element));
        }

        public boolean containsElement(int element) {
            return arrayList.contains(element);
        }
    }

    static class LinkedListExample {
        private LinkedList<Integer> linkedList = new LinkedList<>();

        public void addElement(int element) {
            linkedList.add(element);
        }

        public boolean removeElement(int element) {
            return linkedList.remove(Integer.valueOf(element));
        }

        public boolean containsElement(int element) {
            return linkedList.contains(element);
        }
    }

    static class HashSetExample {
        private HashSet<Integer> hashSet = new HashSet<>();

        public void addElement(int element) {
            hashSet.add(element);
        }

        public boolean removeElement(int element) {
            return hashSet.remove(element);
        }

        public boolean containsElement(int element) {
            return hashSet.contains(element);
        }
    }

    static class TreeMapExample {
        private TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        public void addElement(int key, int value) {
            treeMap.put(key, value);
        }

        public boolean removeElement(int key) {
            return treeMap.remove(key) != null;
        }

        public boolean containsElement(int key) {
            return treeMap.containsKey(key);
        }
    }

    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        LinkedListExample linkedListExample = new LinkedListExample();
        HashSetExample hashSetExample = new HashSetExample();
        TreeMapExample treeMapExample = new TreeMapExample();

        // Добавление элементов
        arrayListExample.addElement(1);
        arrayListExample.addElement(2);
        arrayListExample.addElement(3);
        linkedListExample.addElement(1);
        linkedListExample.addElement(2);
        linkedListExample.addElement(3);
        hashSetExample.addElement(1);
        hashSetExample.addElement(2);
        hashSetExample.addElement(3);
        treeMapExample.addElement(1, 10);
        treeMapExample.addElement(2, 20);
        treeMapExample.addElement(3, 30);

        // Удаление элементов
        arrayListExample.removeElement(2);
        linkedListExample.removeElement(2);
        hashSetExample.removeElement(2);
        treeMapExample.removeElement(2);

        // Проверка существования элементов
        System.out.println("ArrayList contains 1: " + arrayListExample.containsElement(1));
        System.out.println("LinkedList contains 2: " + linkedListExample.containsElement(2));
        System.out.println("HashSet contains 3: " + hashSetExample.containsElement(3));
        System.out.println("TreeMap contains 4: " + treeMapExample.containsElement(4));
    }
}