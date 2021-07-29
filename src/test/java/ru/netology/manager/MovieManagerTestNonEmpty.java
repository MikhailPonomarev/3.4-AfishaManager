package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieInfo;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTestNonEmpty {
    MovieManager manager = new MovieManager();
    MovieInfo first = new MovieInfo(1,1,"starwars","sci-fi","www.com",false);

    @Test
    public void addMovie() {
        manager.add(first);
        assertArrayEquals(manager.getAll(), new MovieInfo[]{first});
    }


}