package Pertemuan4;

public class StrukturLists {

    Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
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

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
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
    
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }
    
    private void dispose(Node node) {
        node.setNext(null);
        node = null;
    }
    public void removeTail() {
        Node preNode = null, lastNode;
        if (HEAD != null) {
            if (HEAD.getNext() == null) {
                HEAD = null;
                System.out.println("List is empty");
            } else {
                lastNode = HEAD;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }



}