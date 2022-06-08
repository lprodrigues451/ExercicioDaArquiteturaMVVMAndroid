package br.com.zup.minhamusicafavorita.detalhe.fotos

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.zup.minhamusicafavorita.ALBUM_KEY
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityMainBinding
import br.com.zup.minhamusicafavorita.databinding.FragmentFotosBinding
import br.com.zup.minhamusicafavorita.detalhe.DetalhesDaBandaActivity
import br.com.zup.minhamusicafavorita.detalhe.detalheAlbum.DetalheAlbumActivity
import br.com.zup.minhamusicafavorita.detalhe.fotos.adapter.AlbumAdapter
import br.com.zup.minhamusicafavorita.detalhe.fotos.model.InformacaoAlbum

class FotosFragment : Fragment() {
    private lateinit var binding : FragmentFotosBinding

    private val adapter: AlbumAdapter by lazy {
        AlbumAdapter(arrayListOf(), this::irParaDetalhe)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFotosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      exibirRecyclerView()

    }

    private fun exibirRecyclerView() {
        adicionarItemListaAlbum()
        binding.rvAlbum.adapter = adapter
        binding.rvAlbum.layoutManager = GridLayoutManager(this.context, 2)
    }

    private fun adicionarItemListaAlbum() {
        val listaAlbum = mutableListOf<InformacaoAlbum>()
        listaAlbum.add(InformacaoAlbum(
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
        listaAlbum.add(InformacaoAlbum(
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
        listaAlbum.add(InformacaoAlbum(
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

        listaAlbum.add(InformacaoAlbum(
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

        listaAlbum.add(InformacaoAlbum(
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


        adapter.atualizarListaAlbum(listaAlbum)
    }

    fun irParaDetalhe(album: InformacaoAlbum) {
        val intent = Intent(context, DetalheAlbumActivity::class.java).apply {
         putExtra(ALBUM_KEY, album)
        }
        startActivity(intent)
    }
}