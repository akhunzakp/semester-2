package jobsheet6;

public class PremierLeagueService24 {
    PremierLeague24[] leagues = new PremierLeague24[20];
    int id = 0;

    void add(PremierLeague24 pl) {
        if (id < leagues.length) {
            leagues[id] = pl;
            id++;
        } else {
            System.out.println("List is full");
        }
    }

    void displayAll() {
        for (PremierLeague24 premierLeague : leagues) {
            if (premierLeague != null) {
                premierLeague.print();
            }
        }
    }

    void insertionSort(boolean asc) {
        for (int i = 1; i < leagues.length; i++) {
            PremierLeague24 tmp = leagues[i];
            int j = i;
            if (asc) {
                while (j > 0 && leagues[j - 1].points < tmp.points) {
                    leagues[j] = leagues[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && leagues[j - 1].points > tmp.points) {
                    leagues[j] = leagues[j - 1];
                    j--;
                }
            }
            leagues[j] = tmp;
        }
    }
}
