package br.com.zup.minhamusicafavorita.detalhe.album.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.minhamusicafavorita.detalhe.album.model.Album
import br.com.zup.minhamusicafavorita.detalhe.album.repository.AlbumRepository
import java.lang.Exception

class AlbumViewModel :ViewModel() {

    private var repository = AlbumRepository()
    private val _response: MutableLiveData<List<Album>> = MutableLiveData()
    val response: LiveData<List<Album>> = _response
    fun getAllAlbum(){
        try {
            _response.value = repository.getListAlbum()
        }catch (ex: Exception){
            Log.i("Error", "------> ${ex.message}")
        }
    }
}