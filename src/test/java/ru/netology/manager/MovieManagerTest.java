package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieInfo;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieManager manager = new MovieManager();
    private MovieInfo first = new MovieInfo(1, 1, "movie1", "genre", "film1.com", "img.com");
    private MovieInfo second = new MovieInfo(2, 2, "movie2", "genre", "film2.com", "img.com");
    private MovieInfo third = new MovieInfo(3, 3, "movie3", "genre", "film3.com", "img.com");
    private MovieInfo fourth = new MovieInfo(4, 4, "movie4", "genre", "film4.com", "img.com");
    private MovieInfo fifth = new MovieInfo(5, 5, "movie5", "genre", "film5.com", "img.com");
    private MovieInfo sixth = new MovieInfo(6, 6, "movie6", "genre", "film6.com", "img.com");
    private MovieInfo seventh = new MovieInfo(7, 7, "movie7", "genre", "film7.com", "img.com");
    private MovieInfo eighth = new MovieInfo(8, 8, "movie8", "genre", "film8.com", "img.com");
    private MovieInfo ninth = new MovieInfo(9, 9, "movie9", "genre", "film9.com", "img.com");
    private MovieInfo tenth = new MovieInfo(10, 10, "movie10", "genre", "film10.com", "img.com");
    private MovieInfo eleventh = new MovieInfo(11, 11, "movie11", "genre", "film11.com", "img.com");

    @BeforeEach
    public void feedSetUp() {
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
    }

    @Test
    public void addEleventhMovie() {
        manager.addMovie(eleventh);

        MovieInfo[] actual = manager.showLastTen();
        MovieInfo[] expected = new MovieInfo[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showsFiveAddedMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);

        MovieInfo[] actual = manager.showLastTen();
        MovieInfo[] expected = new MovieInfo[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie(seventh);

        MovieInfo[] actual = manager.showLastTen();
        MovieInfo[] expected = new MovieInfo[]{seventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void feedWithoutMovies() {
        MovieManager manager = new MovieManager();

        MovieInfo[] actual = manager.showLastTen();
        MovieInfo[] expected = new MovieInfo[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addTenMovies() {

        MovieInfo[] actual = manager.showLastTen();
        MovieInfo[] expected = new MovieInfo[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addTwoSimilarMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie(third);
        manager.addMovie(third);

        MovieInfo[] actual = manager.showLastTen();
        MovieInfo[] expected = new MovieInfo[]{third, third};

        assertArrayEquals(expected, actual);
    }

}
