public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        for (int a: arrayList) System.out.print(a + " ");

        arrayList.remove(2);
        //arrayList.remove(8); returns Error
        System.out.println();
        for (int a: arrayList) System.out.print(a + " ");

        System.out.println();
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(3));
        //System.out.println(arrayList.get(9)); returns Error


    }
}