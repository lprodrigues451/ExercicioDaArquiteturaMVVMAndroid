package br.com.zup.minhamusicafavorita.detalhe.album.repository

import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.detalhe.album.model.Album

class AlbumRepository {
    fun getListAlbum(): List<Album> {
        val listAlbum = mutableListOf<Album>()

        listAlbum.add(
            Album(
            R.drawable.abum_djavu,
            "O Furacão é show",
            "Artista: Cd Banda Djavu E Dj Juninho Portugal - O Furacão É Show",
            "Artista : Banda Djavú",
            "Lançamento : 2009",
            "Gravadora: independente",
            "Estúdio(s): Banda Djavu Stúdio",
            "Formato(s): CD, download digital",
            "Gêneros: Tecnobrega"
        )
        )
        listAlbum.add(
            Album(
            R.drawable.album_5anos,
            "5 Anos de Sucesso",
            "Cd Banda Djavu E Dj Juninho Portugal -  É Show5 Anos de Sucesso",
            "Artista : Banda Djavú",
            "Lançamento : 2013",
            "Gravadora: independente",
            "Estúdio(s): Banda Djavu Stúdio",
            "Formato(s): CD, download digital",
            "Gêneros: Tecnobrega"
        )
        )
        listAlbum.add(
            Album(
            R.drawable.a_volta_fenomeno,
            "a volta do fenômeno",
            "Cd Banda Djavu E Dj Juninho Portugal -  a volta do fenômeno",
            "Artista : Banda Djavú",
            "Lançamento : 2013",
            "Gravadora: independente",
            "Estúdio(s): Banda Djavu Stúdio",
            "Formato(s): CD, download digital",
            "Gêneros: Tecnobrega"
        )
        )
        listAlbum.add(
            Album(
            R.drawable.dez_anos,
            "Banda Djavú 10 Anos",
            "Cd Banda Djavu  -  10 anos de Djavú",
            "Artista : Banda Djavú",
            "Lançamento : 2019",
            "Gravadora: independente",
            "Estúdio(s): Banda Djavu Stúdio",
            "Formato(s): CD, download digital",
            "Gêneros: Tecnobrega"
        )
        )
        listAlbum.add(
            Album(
            R.drawable.pegada_do_piseiro,
            "Na Pegada do Piseiro ",
            "Cd Banda Djavu  - Na Pegada do Piseiro djavu",
            "Artista : Banda Djavú",
            "Lançamento : 2020",
            "Gravadora: independente",
            "Estúdio(s): Banda Djavu Stúdio",
            "Formato(s): CD, download digital",
            "Gêneros: Tecnobrega"
        )
        )
        return listAlbum
    }
}