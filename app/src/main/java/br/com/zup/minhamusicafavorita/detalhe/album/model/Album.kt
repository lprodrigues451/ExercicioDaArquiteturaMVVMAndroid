package br.com.zup.minhamusicafavorita.detalhe.album.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Album(
    private var imagem: Int,
    private var nome: String,
    private var detalhes: String,
    private var artista: String,
    private var lançamento: String,
    private var gravadora: String,
    private var estudio: String,
    private var formato: String,
    private var genero: String
) : Parcelable {
    fun getImagem()= imagem
    fun getNome() = nome
    fun getDetalhe() = detalhes
    fun getArtista() = artista
    fun getLançamento() = lançamento
    fun getGravadora() = gravadora
    fun getEstudio() = estudio
    fun getFormato() = formato
    fun getGenero() = genero


}