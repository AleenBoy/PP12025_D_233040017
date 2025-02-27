package Pertemuan4;

public class ListMain {
    public static void main(String[] args) {
//      latihan 3
        StrukturLists list1 = new StrukturLists();
        System.out.println("Latihan 3");
        list1.addTail(3);
        list1.addTail(4);
        list1.addMid(7,2);
        list1.addMid(8, 2);
        list1.addHead(5);
        list1.displayElement();
    }
}