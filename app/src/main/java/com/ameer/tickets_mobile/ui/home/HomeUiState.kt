package com.ameer.tickets_mobile.ui.home

data class HomeUiState(
    val file: List<FilmUiState> = listOf(
        FilmUiState(
            name = "Inception",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_.jpg",
            categories = listOf("Action", "Thriller", "Science Fiction")
        ),
        FilmUiState(
            name = "The Shawshank Redemption",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BNDE3ODcxYzMtY2YzZC00NmNlLWJiNDMtZDViZWM2MzIxZDYwXkEyXkFqcGdeQXVyNjAwNDUxODI@._V1_FMjpg_UX1000_.jpg",
            categories = listOf("Drama", "Crime")
        ),
        FilmUiState(
            name = "Pulp Fiction",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BNGNhMDIzZTUtNTBlZi00MTRlLWFjM2ItYzViMjE3YzI5MjljXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg",
            categories = listOf("Crime", "Drama")
        ),
        // Add more film instances with real image URLs
        FilmUiState(
            name = "The Dark Knight",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_.jpg",
            categories = listOf("Action", "Crime", "Drama")
        ),
        FilmUiState(
            name = "The Godfather",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg",
            categories = listOf("Crime", "Drama")
        ),
        FilmUiState(
            name = "Fight Club",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BMmEzNTkxYjQtZTc0MC00YTVjLTg5ZTEtZWMwOWVlYzY0NWIwXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_FMjpg_UX1000_.jpg",
            categories = listOf("Drama")
        ),
        FilmUiState(
            name = "Forrest Gump",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BOWNmNzdjYjQtZjIyOS00MDhiLTg4ZWUtZGZkZDE4ZDQwZTY1XkEyXkFqcGdeQXVyODk2ODI3MTU@._V1_.jpg",
            categories = listOf("Drama", "Romance")
        ),
        FilmUiState(
            name = "The Matrix",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BNzQzOTk3OTAtNDQ0Zi00ZTVkLWI0MTEtMDllZjNkYzNjNTc4L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_FMjpg_UX1000_.jpg",
            categories = listOf("Action", "Sci-Fi")
        ),
        FilmUiState(
            name = "The Lord of the Rings: The Fellowship of the Ring",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_.jpg",
            categories = listOf("Action", "Adventure", "Fantasy")
        ),
        FilmUiState(
            name = "Goodfellas",
            imageUrl = "https://m.media-amazon.com/images/M/MV5BY2NkZjEzMDgtN2RjYy00YzM1LWI4ZmQtMjIwYjFjNmI3ZGEwXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_FMjpg_UX1000_.jpg",
            categories = listOf("Crime", "Drama")
        )
    )

)


data class FilmUiState(
    val name: String = "",
    val imageUrl: String = "",
    val categories: List<String>,
)