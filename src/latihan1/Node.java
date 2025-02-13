package latihan1;

public class Node {
	private int nilai;
	private Node next;
	
	//inisialisasi kode
	public Node(int nilai) {
		this.nilai = nilai;
	}
	
	//Setter & Getter
	public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}