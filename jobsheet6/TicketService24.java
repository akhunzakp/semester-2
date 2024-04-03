package jobsheet6;

public class TicketService24 {
    Tickets24[] tickets = new Tickets24[10];
    int id = 0;

    void add(Tickets24 t) {
        if (id < tickets.length) {
            tickets[id] = t;
            id++;
        } else {
            System.out.println("List is full");
        }
    }

    void displayAll() {
        for (Tickets24 tdisplay : tickets) {
            if (tdisplay != null) {
                tdisplay.print();
            }
        }
    }

    void bubbleSort(boolean asc) {
        for (int i = 0; i < tickets.length; i++) {
            for (int j = 1; j < tickets.length; j++) {
                if (asc) {
                    if (tickets[j].price < tickets[j - 1].price) {
                        Tickets24 tmp = tickets[j];
                        tickets[j] = tickets[j - 1];
                        tickets[j - 1] = tmp;
                    }
                } else {
                    if (tickets[j].price > tickets[j - 1].price) {
                        Tickets24 tmp = tickets[j];
                        tickets[j] = tickets[j - 1];
                        tickets[j - 1] = tmp;
                    }
                }
            }
        }
    }

    void selectionSort(boolean asc) {
        for (int i = 0; i < tickets.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tickets.length; j++) {
                if (asc) {
                    if (tickets[j].price < tickets[min].price) {
                        min = j;
                    }
                } else {
                    if (tickets[j].price > tickets[min].price) {
                        min = j;
                    }
                }
            }
            Tickets24 tmp = tickets[i];
            tickets[i] = tickets[min];
            tickets[min] = tmp;
        }

    }
}
