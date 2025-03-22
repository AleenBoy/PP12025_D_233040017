package pertemuan6;

import pertemuan4.Node;

public class strukturList {

    Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }
    
    private void dispose(Node node) {
    	node.setNext(null);
    	node = null;  
    }
    
    public void removeHead() {
    	if(isEmpty()) {
    		System.out.println("List is empty");
    	}else {
    		Node temp = HEAD;
    		HEAD = HEAD.getNext();
    		dispose(temp);
    	}
    }
    
    public void removeTail() {
    	if(isEmpty()) {
    		System.out.println("List is empty");
    	}else {
    		Node lastNode = HEAD;
    		Node preNode = null;
    		
    		while(lastNode.getNext() != null) {
    			preNode = lastNode;
    			lastNode = lastNode.getNext();
    		}
    		
    		preNode.setNext(null);
    		dispose(lastNode);
    	}
    }
    
    public void removeMid(int data) {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node preNode = null;
            Node tempNode = HEAD;
            boolean ketemu = false;

            // Jika data ada di HEAD
            if (HEAD.getData() == data) {
                HEAD = HEAD.getNext(); // Pindahkan HEAD ke next
                dispose(tempNode); // Hapus node lama
                System.out.println("Data " + data + " berhasil dihapus");
                return;
            }

            // Traversal untuk mencari data
            while (tempNode != null && !ketemu) {
                if (tempNode.getData() == data) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext(); // Perbaikan disini
                }
            }

            // Jika ketemu, hapus node
            if (ketemu) {
                preNode.setNext(tempNode.getNext()); // Hubungkan node sebelumnya ke next node setelah node yang dihapus
                dispose(tempNode); // Hapus node
                System.out.println("Data " + data + " berhasil dihapus");
            } else {
                System.out.println("Data " + data + " tidak ditemukan");
            }
        }
    }


    public void addTail(int data) {
        Node posNode = null;
        Node curNode = null;

        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void displayElement() { // Ubah nama metode agar sesuai dengan yang diminta
        Node temp = HEAD;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(int data, int position) {
        Node curNode = null;
        Node posNode = null;
        int i;

        Node newNode = new Node(data);

        if (HEAD == null) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            if(position == 1) {
                newNode.setNext(curNode);
                HEAD = newNode;
            } else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }
    
    //Latihan 1 Pertemuan 6
    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.getData() == x)
                ketemu = true;
            else
                curNode = curNode.getNext();
        }

        return ketemu;
    }
    
    //Latihan 3 Pertemuan 6
    public int size() {
    	Node curNode = HEAD;
    	int jumlah = 0;
    	
    	while (curNode != null) {
    		jumlah = jumlah + 1;
    		curNode = curNode.getNext();
    	}
    	
    	return jumlah;
    }
}