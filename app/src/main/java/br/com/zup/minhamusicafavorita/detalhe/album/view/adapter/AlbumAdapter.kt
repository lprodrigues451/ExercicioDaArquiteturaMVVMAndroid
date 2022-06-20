package br.com.zup.minhamusicafavorita.detalhe.fotos.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.minhamusicafavorita.databinding.MinhaMusicaItemBinding
import br.com.zup.minhamusicafavorita.detalhe.fotos.model.InformacaoAlbum

class AlbumAdapter(
    private var listaAlbum: MutableList<InformacaoAlbum>,
    private val clickHeroi: (album: InformacaoAlbum) -> Unit

) : RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumAdapter.ViewHolder {
        val binding = MinhaMusicaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumAdapter.ViewHolder, position: Int) {
        val album = listaAlbum[position]
        holder.adicionarInformacoesView(album)
        holder.binding.cvItemLista.setOnClickListener {
            clickHeroi(album)
        }
    }

    override fun getItemCount() = listaAlbum.size

    fun atualizarListaAlbum(novaLista: MutableList<InformacaoAlbum>) {
        if (listaAlbum.size == 0) {
            listaAlbum = novaLista
        } else {
            listaAlbum.addAll(novaLista)
        }
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: MinhaMusicaItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun adicionarInformacoesView(album: InformacaoAlbum) {
            binding.ivAlbum.setImageResource(album.getImagemAlbum())
        }
    }
}