class QueUsingLinkedList {

    ListNode head = null;
    ListNode tail = null;

   public boolean isEmpty(){
        return head == null && tail == null;
    }
    // Their is no need to add isFull condition
     public void add(int data){
       ListNode newNode = new ListNode(data);

       // For adding first time data in que
         if(tail == null){
             head = tail = newNode;
         }
         tail.next = newNode;
         tail = newNode;
     }
     public int remove(){
         if (head == null) {
             System.out.println("Q is Empty");
             return -1;
         }
       int front = head.data;
         if(head == tail){
             head = tail = null;
         }
         else {
         head= head.next;
         }
                 return front;

     }

     public int peek(){
       if(isEmpty()){
           System.out.println("Q is Empty");
           return -1;
       }
       return head.data;
     }

     public void prinQ(){
       ListNode temp = head ;
       while(temp != null){
           System.out.println(temp.data);
           temp = temp.next;
       }
     }



}
