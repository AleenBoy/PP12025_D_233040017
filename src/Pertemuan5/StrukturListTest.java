package Pertemuan5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturLists list = new StrukturLists();

        // Tambahkan elemen (2, 6, 3, 5, 1)
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(1);

        System.out.println("List awal:");
        list.printList(); // Output: 2 6 3 5 1

        // Hapus elemen tengah (3)
        list.removeMid();

        System.out.println("Setelah removeMid pertama:");
        list.printList(); // Output: 2 6 5 1

        // Hapus elemen tengah lagi (6)
        list.removeMid();

        System.out.println("Setelah removeMid kedua:");
        list.printList(); // Output: 2 1
    }
}
