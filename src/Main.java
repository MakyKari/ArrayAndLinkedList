public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(3);
        System.out.print("ArrayList contains: ");
        for (int a: arrayList) System.out.print(a + " ");

        arrayList.remove(2);
        //arrayList.remove(8); returns Error
        System.out.println();
        System.out.print("ArrayList, after deleting 3rd element, contains: ");
        for (int a: arrayList) System.out.print(a + " ");
        System.out.println();

        arrayList.remove((Integer)2);
        System.out.print("ArrayList, after deleting first occurrence of 2, contains: ");
        for (int a: arrayList) System.out.print(a + " ");
        System.out.println();

        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Getting 4th element " + arrayList.get(3));
        System.out.println("Does ArrayList contains: 5? " + arrayList.contains(5));
        System.out.println("Does ArrayList contains: 9? " + arrayList.contains(9));
        arrayList.add(12,2);
        System.out.println("inserting element 12 at position 3:");
        for (int a: arrayList) System.out.print(a + " ");
        System.out.println();
        System.out.println("First occurrence of 3: " + arrayList.indexOf(3));
        System.out.println("First occurrence of 99: " + arrayList.indexOf(99));
        System.out.println("Last occurrence of 3: " + arrayList.lastIndexOf(3));
        System.out.println("Last occurrence of 99: " + arrayList.lastIndexOf(99));
        arrayList.sort();
        System.out.println("Sorted ArrayList: ");
        for (int a: arrayList) System.out.print(a + " ");
        System.out.println();
        //System.out.println(arrayList.get(9)); returns Error


        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(1);
        linkedList.add(0);
        System.out.print("LinkedList contains: ");
        for(int a : linkedList) System.out.print(a + " ");
        System.out.println();

        linkedList.remove(3);
        //linkedList.remove(9); Return Error
        System.out.print("LinkedList, after removal of 4th element, contains: ");
        for(int a : linkedList) System.out.print(a + " ");
        System.out.println();
        linkedList.remove((Integer)7);
        System.out.print("LinkedList, after deleting first occurrence of 7, contains: ");
        for (int a: linkedList) System.out.print(a + " ");

        System.out.println("\n" + "Size of LinkedList: " + linkedList.size());
        System.out.println("Getting 3rd element " + linkedList.get(2));
        System.out.println("Does LinkedList contains: 7? " + linkedList.contains(7));
        System.out.println("Does LinkedList contains: 12? " + linkedList.contains(12));
        linkedList.add(18,3);
        System.out.println("inserting element 18 at position 4: ");
        for (int a: linkedList) System.out.print(a + " ");
        System.out.println();
        System.out.println("First occurrence of 1: " + linkedList.indexOf(1));
        System.out.println("First occurrence of 77: " + linkedList.indexOf(77));
        System.out.println("Last occurrence of 1: " + linkedList.lastIndexOf(1));
        System.out.println("Last occurrence of 77: " + linkedList.lastIndexOf(77));
        System.out.println();
    }
}