package ru.netology.domain;

public class MovieInfo {
    private int id;
    private int movieId;
    private String movieName;
    private String genre;
    private String url;
    private boolean premiereTomorrow;


    public MovieInfo() {}

    public MovieInfo(int id, int movieId, String movieName, String genre, String url, boolean premiereTomorrow) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.url = url;
        this.premiereTomorrow = premiereTomorrow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isPremiereTomorrow() {
        return premiereTomorrow;
    }

    public void setPremiereTomorrow(boolean premiereTomorrow) {
        this.premiereTomorrow = premiereTomorrow;
    }
}
