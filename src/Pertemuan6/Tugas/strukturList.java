package tugas;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

public class strukturList {
    private Node HEAD;

    public strukturList() {
        HEAD = null;
    }

    public void addTail(int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            Node temp = HEAD;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void displayElement() {
        if (HEAD == null) {
            System.out.println("List Kosong");
            return;
        }

        Node temp = HEAD;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    //Algortitma Function Clear List
    //Function clearList()
    //HEAD ← null  // Menghapuskan seluruh elemen list
    //End Function

    public void clearList() {
        HEAD = null; // Menghapuskan seluruh elemen dan mengatur HEAD sehingga menjadi null
    }
}

