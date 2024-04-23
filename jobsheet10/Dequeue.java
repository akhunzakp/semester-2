package jobsheet10;

public int Dequeue() {
    int dt = 0;
    if (IsEmpty() ) {
        System.out.println("Queue masih kosong");
    } else {
        dt = data[front];
        size--;
        if (IsEmpty()) {
            front = rear = -1;
        }else {
            if (front == max -1) {
                front = 0;
            }else {
                front==;
            }
        }
    }
    return dt;
}
