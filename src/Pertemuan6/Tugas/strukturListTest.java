package tugas;

public class strukturListTest {
    public static void main(String[] args) {
        strukturList list = new strukturList();

        // Tambah elemen(4, 3, 7, 8, 1, 9)
        list.addTail(4);
        list.addTail(3);
        list.addTail(7);
        list.addTail(8);
        list.addTail(1);
        list.addTail(9);

        // Tampilkan elemen list sebelum dihapus
        list.displayElement(); 

        // Hapus semua elemen dalam list
        list.clearList();

        // Tampilkan elemen list setelah dihapus
        list.displayElement(); 
    }
}




