package br.com.zup.minhamusicafavorita.detalhe.album.detalheAlbum.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import br.com.zup.minhamusicafavorita.ALBUM_KEY
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityDetalheAlbumBinding
import br.com.zup.minhamusicafavorita.detalhe.album.model.Album

class DetalheAlbumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheAlbumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickNoBotao()
        configuracaoDoBar()
        recuperarAlbum()
        clickNoBotao()

    }

    private fun clickNoBotao() {
        binding.favoritar.setOnClickListener {
            Toast.makeText(applicationContext, "Álbum favoritado com sucessso!", Toast.LENGTH_LONG)
                .show()
        }
    }

    private fun configuracaoDoBar() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(R.string.detalhe_name)
    }

    private fun recuperarAlbum() {
        val album = intent.getParcelableExtra<Album>(ALBUM_KEY)

        if (album != null) {
            exibirInformacoes(album)
        }
    }

    private fun exibirInformacoes(album: Album) {
        binding.imagemAlbum.setImageResource(album.getImagem())
        binding.tvNomeAlbum.text = album.getNome()
        binding.tvDetalheAlbum.text = album.getDetalhe()
        binding.tvArtista.text = album.getArtista()
        binding.tvLancamento.text = album.getLançamento()
        binding.tvGravador.text = album.getGravadora()
        binding.tvEstudio.text = album.getEstudio()
        binding.tvFormato.text = album.getFormato()
        binding.tvGenero.text = album.getGenero()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}