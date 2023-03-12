public class Practical9 {
    public static void main(String[] args) {
        myList L = new myList();
        for(int i=1; i<=5; i++)
            L.pushBack(i);
        L.print();
        


//        myDList dL = new myDList();
//        dL.pushFront(1);
//        dL.pushFront(2);
//        dL.pushFront(3);
//        dL.print();

    }

//    односвязный список
    public static class myList {
        Node Head;
        private class Node{
            int value;
            Node next;
        }

        public Node pushFront(int value){
            Node node = new Node();
            node.value = value;
            Node current = Head;

            if(current != null){
                node.next = Head;
            }
            Head = node;
            return node;
        }

        public Node pushBack(int value){
            Node node = new Node();
            node.value = value;
            Node current = Head;

            if(current == null){
                Head = node;
            }else{
                while(current.next != null)
                    current = current.next;
                current.next = node;
            }
            return node;
        }

        public void popBack(){
            Node current = Head;

            if(current != null){
                while(current.next != null && current.next.next != null)
                    current = current.next;
                if(current.next == null)
                    Head = null;
            }
        }

        public void reversal(){
//            for(int i = 0; i < array.length / 2; i++) {
//                int temp = array[i];
//                array[i] = array[array.length - i - 1];
//                array[array.length - i - 1] = temp;
//            }
        }

        public void print(){
            Node current = Head;
            while(current != null){
                System.out.printf("%d ", current.value);
                current = current.next;
            }
        }

        public Node find(int value){
            Node current = Head;
            while(current != null){
                if(current.value == value){
                    return current;
                }
                current = current.next;
            }
            return null;
        }
    }

//    двухсвязный список
    public static class myDList {
        Node Head, Tail;
        private class Node{
            int value;
            Node next;
            Node prew;
        }

        public void pushFront(int value){
            Node node = new Node();
            node.value = value;

            if(Head == null){
                Tail = node;
            }else{
                if(Head.next == null){
                    Head.next = Tail;
                    Tail.prew = Head;
                }else{
                    node.next = Head;
                    Head.prew = node;

                }
            }
            Head = node;
        }

        public void print(){
            Node current = Head;
            while(current != null){
                System.out.printf("%d ", current.value);
                current = current.next;
            }
        }
    }
}
