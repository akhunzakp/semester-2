package jobsheet10;

    int[] data;
    int front;
    int rear;
    int size;
    int max;
    
public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

