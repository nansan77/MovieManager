package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.manager.SearchManager;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class SearchManagerTest {

    private SearchManager manager = new SearchManager(10);
    Movie first = new Movie(1, "name1", "horror");
    Movie second = new Movie(2, "name2", "drama");
    Movie third = new Movie(3, "name3", "comedy");
    Movie fourth = new Movie(4, "name4", "cartoon");
    Movie fifth = new Movie(5, "name5", "action");
    Movie sixth = new Movie(6, "name6", "cartoon");
    Movie seventh = new Movie(7, "name7", "horror");
    Movie eighth = new Movie(8, "name8", "drama");
    Movie ninth = new Movie(9, "name9", "comedy");
    Movie tenth = new Movie(10, "name10", "cartoon");
    Movie eleventh = new Movie(11, "name11", "action");
    Movie twelfth = new Movie(12, "name12", "cartoon");
    Movie thirteen = new Movie(13, "name13", "drama");


    @Test
    void shouldAdd() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAfishaEmpty() {
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMaxMovie() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteen);



        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{thirteen, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLessMax() {
        SearchManager manager = new SearchManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowMoreMax10() {
        SearchManager manager = new SearchManager(13);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteen);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{thirteen, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldNotFilm () {
        SearchManager manager = new SearchManager(0);

        manager.add(first);
        manager.add(second);
        manager.add(third);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(expected, actual);

    }
}
