package Pertemuan4;

public class StrukturListTestHead {
    public static void main(String[] args) {
        StrukturLists list = new StrukturLists();

        list.addHead(2);
        list.addHead(9);
        list.addHead(7);
        System.out.println("Elemen list");
        list.displayElement();

        System.out.println("");

        list.removeHead();
        System.out.println("List setelah dihapus");
        list.displayElement();

        System.out.println("");

        list.removeHead();
        System.out.println("List setelah dihapus");
        list.displayElement();

        System.out.println("");

        list.removeHead();
        System.out.println("List setelah dihapus");
        list.displayElement();

        System.out.println("");

        list.removeHead();
        list.displayElement(); // Cek apakah list sudah kosong
    }
}
