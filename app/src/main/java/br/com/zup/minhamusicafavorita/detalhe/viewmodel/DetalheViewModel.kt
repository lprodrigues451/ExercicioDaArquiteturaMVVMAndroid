package br.com.zup.minhamusicafavorita.detalhe.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.minhamusicafavorita.detalhe.model.Detalhe

class DetalheViewModel : ViewModel(){
    private val _response: MutableLiveData<Detalhe> = MutableLiveData()
    val response: LiveData<Detalhe> = _response
    fun getAllDetalhe(){
        try {
            _response.value
        }catch (ex: Exception){
            Log.i("Error", "------> ${ex.message}")
        }
    }
}