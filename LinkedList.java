private class LinkedList {

private Node head; 
private Node tail;

    private boolean isEmpty() {
        if(head == tail == null)
            return true;
    }
    
    private void append(int data){  //add data to back
        Node node = new Node(data);
        
        if(head == null)
            head = tail = node;
        
        else{
            tail.next = node; 
            tail = node; 
        }
    }
    
    private void prepend(int data){  //add data to front
        Node node = new Node(data);
        
        if(head == null)
            head = tail = node;
        else{
            node.next = head;
            head = node; 
        }
        
    }
    
    private int size(){ //get number of nodes
        Node n = head; 
        int count = 0; 
        if(!isEmpty()){
            while(n!=null){
                count++;
                n = n.next; 
            }
        }
        
        return count; 
    }
    
    private int [] getDataFromStart(){  //read LinkedList from the front
        int arr [] = new int[size()];
        Node n = head;
        int i = 0;  
        
        while(n!=null){
            arr[i]= n.data;
            n=n.next;
            i++;
        }
        return arr; 
    }
    
    private int [] getDataFromEnd(){   //read LinkedList from the back
        int arr[] = new int[size()];
        Node n = head; 
        int i = size() -1; 
        while(n!=null){
            arr[i] = n.data; 
            n = n.next; 
            i--; 
        }
        
        return arr; 
    }
    
    private void reverseLinkedList() {
        Node previous = null; 
        Node current = head; 
        Node next = null; 
        
        if(current == null)
            return;
        
        while(current.next!=null) {
            next = current.next; 
            current.next = previous; 
            previous = current; 
            current = next;
        }
        
        
    }
    

}