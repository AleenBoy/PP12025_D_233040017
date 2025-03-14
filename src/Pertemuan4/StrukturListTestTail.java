package Pertemuan4;

public class StrukturListTestTail {
    public static void main(String[] args) {
        StrukturLists list = new StrukturLists();

        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);

        System.out.println("Elemen list");
        list.displayElement();

        System.out.println(" ");

        list.removeTail();

        System.out.println("Hapus elemen di akhir");
        list.displayElement();

        System.out.println(" ");

        list.removeHead();

        System.out.println("Hapus elemen di awal");
        list.displayElement();

        System.out.println(" ");

        list.removeTail();

        System.out.println("Hapus elemen di akhir");
        list.displayElement();
    }
}

