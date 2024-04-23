package jobsheet10;

public void clear() {
    if (!IsEmpty()) {
        front = rear = -l;
        size = o;
        System.out.println("Queue berhasil dikosongkan");
    } else {
        System.out.println("Queue masih kosong");
    }
}
