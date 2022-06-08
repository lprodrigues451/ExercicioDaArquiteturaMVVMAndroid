package br.com.zup.minhamusicafavorita.detalhe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityDetalhesDaBandaBinding
import br.com.zup.minhamusicafavorita.detalhe.adapter.DetalhePagerAdapter

import com.google.android.material.tabs.TabLayoutMediator

class DetalhesDaBandaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhesDaBandaBinding
    private val listaDetalhe = listOf("Informações", "Fotos")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesDaBandaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        exibirAppBarCustomizada()
        exibirViewPagerTabLayout()
    }

    private fun exibirAppBarCustomizada() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(getString(R.string.Detalhe_bar))
    }

    private fun exibirViewPagerTabLayout() {
        val informacoesPagerAdapter =
            DetalhePagerAdapter(supportFragmentManager, lifecycle, listaDetalhe)
        binding.vpDetalhe.adapter = informacoesPagerAdapter

        TabLayoutMediator(binding.tlDetalhe, binding.vpDetalhe) { tab, posicao ->
            tab.text = listaDetalhe[posicao]
        }.attach()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }



}