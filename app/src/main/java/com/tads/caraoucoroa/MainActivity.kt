//Gabriel Fernando Tochio 05/05/2020

package com.tads.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_jogar.setOnClickListener{

            val intent = Intent(applicationContext, ResultadoActivity::class.java)

            //Gerar Número Randômico

            val numero = Random().nextInt(2)

            //Enviar numero para outra Activity

            intent.putExtra("numero", numero)
            startActivity(intent)
        }
    }
}
