package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieInfo {
    private int id;
    private int movieId;
    private String movieName;
    private String genre;
    private String filmUrl;
    private String imgUrl;
}
