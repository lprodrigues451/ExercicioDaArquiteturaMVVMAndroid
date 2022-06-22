package br.com.zup.minhamusicafavorita.detalhe.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityDetalhesDaBandaBinding
import br.com.zup.minhamusicafavorita.detalhe.model.Detalhe
import br.com.zup.minhamusicafavorita.detalhe.view.adapter.DetalhePagerAdapter
import br.com.zup.minhamusicafavorita.detalhe.viewmodel.DetalheViewModel

import com.google.android.material.tabs.TabLayoutMediator

class DetalheActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhesDaBandaBinding
    var detalhe = Detalhe()
    private val listaDetalhe = listOf("Informações", "Fotos")

    private val viewModel: DetalheViewModel by lazy {
        ViewModelProvider(this)[DetalheViewModel::class.java]
    }

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

//    private fun observables() {
//        viewModel.response.observe(this) {
//            detalhe = it
//        }
//    }
//
//    private fun teste(): List<Detalhe>{
//        val listaDetalhe = List<Detalhe>
//        return listaDetalhe
//    }

}