package br.com.zup.minhamusicafavorita.detalhe.album.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import br.com.zup.minhamusicafavorita.ALBUM_KEY
import br.com.zup.minhamusicafavorita.databinding.FragmentFotosBinding
import br.com.zup.minhamusicafavorita.detalhe.album.detalheAlbum.view.DetalheAlbumActivity
import br.com.zup.minhamusicafavorita.detalhe.album.view.adapter.AlbumAdapter
import br.com.zup.minhamusicafavorita.detalhe.album.model.Album
import br.com.zup.minhamusicafavorita.detalhe.album.viewmodel.AlbumViewModel

class AlbumFragment : Fragment() {
    private lateinit var binding: FragmentFotosBinding
    private val viewModel: AlbumViewModel by lazy {
        ViewModelProvider(this)[AlbumViewModel::class.java]
    }
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
        observables()
        viewModel.getAllAlbum()
    }

    private fun exibirRecyclerView() {
        binding.rvAlbum.adapter = adapter
        binding.rvAlbum.layoutManager = GridLayoutManager(this.context, 2)
    }

    private fun observables() {
        viewModel.response.observe(viewLifecycleOwner) {
            adapter.atualizarListaAlbum(it as MutableList<Album>)
        }
    }

    private fun irParaDetalhe(album: Album) {
        val intent = Intent(context, DetalheAlbumActivity::class.java).apply {
            putExtra(ALBUM_KEY, album)
        }
        startActivity(intent)
    }
}