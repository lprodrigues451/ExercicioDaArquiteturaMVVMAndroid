package br.com.zup.minhamusicafavorita.detalhe.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.zup.minhamusicafavorita.detalhe.fotos.view.FotosFragment
import br.com.zup.minhamusicafavorita.detalhe.informacao.view.InformacaoFragment

class DetalhePagerAdapter(
    fragmentManager:FragmentManager,
    lifecycle: Lifecycle,
    private var listaDetalhe: List<String>): FragmentStateAdapter(fragmentManager,lifecycle) {

    override fun getItemCount(): Int {
        return listaDetalhe.size
    }

    override fun createFragment(position: Int): Fragment {
            when(position){
                0-> return InformacaoFragment()
                1-> return FotosFragment()

            }
        return InformacaoFragment()
    }
}