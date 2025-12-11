class CircularQueueUsingArray {
    int arr[];
    int front;
    int rear;
    int size;

    CircularQueueUsingArray(int n){
        arr = new int[n];
        front = -1;
        rear = -1;
        size  = n;
    }

    public boolean isEmpty(){
        return rear == -1 && front == -1;

    }
    public boolean isFull(){
        return (rear+1)%size == front;
    }
    public  void add(int data){
        if(isFull()){
            System.out.println("CQ is full");
            return;
        }
        if(front == -1) { // add first element
            front = 0;
        }
        rear  = (rear+1)%size;

        arr[rear] = data;

    }
    public  int remove(){
        if(isEmpty()){
            System.out.println("CQ is empty");
            return -1;
        }
        int n = arr[front];
        if(rear == front){
            rear=front=-1;
        }
        else {

        front = (front+1)%size;
        }
        return  n;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("CQ is empty");
            return -1;
        }
        return arr[front];
    }

    public void printCQ(){
     if(front == -1){

         System.out.println("CQ Empty");
         return;
     }
     int i = front;
     while(true){
         System.out.println(arr[i]);
         if(i == rear){
             break;
         }
         i = (i+1)%size;
     }


    }
}
