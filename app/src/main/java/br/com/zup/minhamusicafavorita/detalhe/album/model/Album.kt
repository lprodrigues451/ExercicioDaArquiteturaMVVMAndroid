package br.com.zup.minhamusicafavorita.detalhe.album.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class InformacaoAlbum(
    private var imagem: Int,
    private var nomeAlbum: String,
    private var detalhesDoAlbum: String,
    private var artista: String,
    private var lançamento: String,
    private var gravadora: String,
    private var estudio: String,
    private var formato: String,
    private var genero: String
) : Parcelable {
    fun getImagemAlbum()= this.imagem
    fun getNomeAlbum() = this.nomeAlbum
    fun getNomeDetalheDoAlbum() = this.detalhesDoAlbum
    fun getArtista() = this.artista
    fun getLançamento() = this.lançamento
    fun getGravadora() = this.gravadora
    fun getEstudio() = this.estudio
    fun getFormato() = this.formato
    fun getGenero() = this.genero


}