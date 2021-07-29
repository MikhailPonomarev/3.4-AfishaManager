package ru.netology.manager;

import ru.netology.domain.MovieInfo;

public class MovieManager {
    private MovieInfo[] movies = new MovieInfo[0];

    public void add(MovieInfo movie) { //добавление в ленту
        int length = movies.length + 1;
        MovieInfo[] tmp = new MovieInfo[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MovieInfo[] getAll() { //вывод в ленту в обратном порядке
        MovieInfo[] result = new MovieInfo[movies.length];
        for (int i = 0;  i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

//    //РЕПОЗИТОРИЙ
//    public void save(MovieInfo movie) {
//        int length = movies.length + 1; //длина нового массива
//        MovieInfo[] tmp = new MovieInfo[length]; //переименовать tmp во что то более говорящее
//        System.arraycopy(movies, 0, tmp, 0, movies.length);
//        int lastIndex = tmp.length - 1;
//        tmp[lastIndex] = movie;
//        movies = tmp;
//    }
//
//    public MovieInfo[] getAll() {
//        return movies;
//    }
//
//    //МЕНЕДЖЕР
//    public void addMovie(MovieInfo ) { //метод добавления фильмов в ленту
//        int length = movies.length;
//        P
//
//
//    }
//
//    public MovieInfo getAllRevert() { //выдача в обратном порядке
//    }
}
