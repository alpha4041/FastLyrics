package io.github.teccheck.fastlyrics.model

data class SongWithLyrics(
    val title: String,
    val artist: String,
    val lyrics: String,
    val sourceUrl: String,
    val album: String?,
    val artUrl: String?
)