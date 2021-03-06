package com.marcio.popularmoviesclean.movies.models

data class Movie(
    val id: String = "",
    val title: String = "",
    val posterUrl: String = "",
    val synopsis: String = "",
    val averageRating: String = "",
    val ratingsCount: String = "",
    val releaseDate: String = ""
)
