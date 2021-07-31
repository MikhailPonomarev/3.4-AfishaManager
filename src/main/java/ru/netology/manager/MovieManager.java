package ru.netology.manager;

import ru.netology.domain.MovieInfo;

public class MovieManager {
    private MovieInfo[] movies = new MovieInfo[0];
    private int feedCount = 10;

    public MovieManager(int feed) {
        this.feedCount = feed;
    }

    public MovieManager() {
    }

    public void addMovie(MovieInfo movie) {
        int length = movies.length + 1;
        MovieInfo[] tmp = new MovieInfo[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MovieInfo[] showLastTen() {
        int count = feedCount;
        if (feedCount > movies.length) {
            count = movies.length;
        }
        MovieInfo[] result = new MovieInfo[count];
        for (int i = 0; i < count; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;

    }

}
