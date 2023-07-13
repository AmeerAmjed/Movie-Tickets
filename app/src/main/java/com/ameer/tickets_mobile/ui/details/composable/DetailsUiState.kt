package com.ameer.tickets_mobile.ui.details.composable

import com.ameer.tickets_mobile.ui.base.BaseUiState

data class DetailsUiState(
    val name: String = "The Shawshank Redemption",
    val imageUrl: String = "https://m.media-amazon.com/images/M/MV5BNDE3ODcxYzMtY2YzZC00NmNlLWJiNDMtZDViZWM2MzIxZDYwXkEyXkFqcGdeQXVyNjAwNDUxODI@._V1_FMjpg_UX1000_.jpg",
    val categories: List<String> = listOf("Drama", "Crime"),
    val duration: String = "2h 22m",
    val rate: RatingUiState = RatingUiState(),
    val actors: List<String> = listOf(
        "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/1/13/Joseph_Ragno.jpg/revision/latest?cb=20151129221729",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Morgan_Freeman_Deauville_2018.jpg/440px-Morgan_Freeman_Deauville_2018.jpg",
        "https://m.media-amazon.com/images/M/MV5BMjUyZDQ0NjktZmM5ZS00NzcxLTliMWYtNWUxNDcyMmExZjU0XkEyXkFqcGdeQXVyMTE1MjA4NzM@._V1_QL75_UY414_CR24,0,280,414_.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Clancy_Brown_by_Gage_Skidmore.jpg/440px-Clancy_Brown_by_Gage_Skidmore.jpg",
        "https://pbs.twimg.com/profile_images/636267498489278464/jvzP6T_-_400x400.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/c/cb/Gil_Bellows_2012.jpg",
        "https://static.wikia.nocookie.net/sopranos/images/7/74/David_Proval.png/revision/latest?cb=20150510062104",
        "https://static.wikia.nocookie.net/marvelmovies/images/e/ec/Jude_Ciccolella.jpg/revision/latest?cb=20191127214319"

    ),
    var descriptor: String = "Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion."
) : BaseUiState

data class RatingUiState(
    val imdb: ItemRatingUiState = ItemRatingUiState("9.3", "/10"),
    val rottenTomatoes: ItemRatingUiState = ItemRatingUiState("63%", ""),
    val ign: ItemRatingUiState = ItemRatingUiState("4", "/10"),
)

data class ItemRatingUiState(
    val rate: String, val from: String
)

