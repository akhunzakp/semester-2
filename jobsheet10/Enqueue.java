package jobsheet10;

public void Enqueue(int dt) {
    if (IsFull()) {
        System.out.println("Queue sudah penuh");
    } else {
        if (IsEmpty()) {
            front = rear = 0;
        } else {
            if (rear == max -1) {
            rear = 0;
            } else {
            rear++;
            }
        }
        data[rear] = dt;
    }
}
