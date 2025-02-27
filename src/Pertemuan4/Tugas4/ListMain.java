
package Tugas4;

public class ListMain {
    public static void main(String[] args) {
//      Tugas A
        StrukturLists list1 = new StrukturLists();
        System.out.println("Elemen Tugas a: ");
        list1.addHead(2.1);
        list1.addTail(4.5);
        list1.addMid(3.4,2);
        list1.displayElement();

        System.out.println();

//      Tugas B
        StrukturLists list2 = new StrukturLists();
        System.out.println("Elemen Tugas b: ");
        list2.addTail(2.1);
        list2.addHead(3.4);
        list2.addMid(4.5,4);
        list2.addMid(1.1,3);
        list2.addTail(5.5);
        list2.displayElement();
    }
}
