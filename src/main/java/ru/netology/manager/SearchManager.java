package ru.netology.manager;
import ru.netology.domain.Movie;
public class SearchManager {
    private Movie[] items = new Movie[0];
    private int itemsToShowMovie;

    public SearchManager(int itemsToShowMovie) {
        this.itemsToShowMovie = itemsToShowMovie;
    }


    public void add(Movie item) {
        int length = items.length + 1;
        Movie[] tmp = new Movie[length];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Movie[] getAll() {
        int length = itemsToShowMovie;

        if (itemsToShowMovie < 0) {
            length = 0;
        }

        if (length > items.length) {
            length = items.length;
        }

        Movie[] result = new Movie[length];

        for (int i = 0; i < length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
