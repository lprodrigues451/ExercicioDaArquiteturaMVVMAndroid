package br.com.zup.minhamusicafavorita.home.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.databinding.ActivityHomeBinding
import br.com.zup.minhamusicafavorita.detalhe.view.DetalheActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoDetalhe.setOnClickListener {
            startActivity(Intent(this, DetalheActivity::class.java))
        }
    }
}