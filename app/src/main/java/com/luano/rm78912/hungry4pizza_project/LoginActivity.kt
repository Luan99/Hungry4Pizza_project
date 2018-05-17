package com.luano.rm78912.hungry4pizza_project

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    // clique no botao
    fun logar(view: View) {
        //recupera os valores digitados
        val login = etLogin.text.toString()
        val senha = etSenha.text.toString()

        // Valida o usuario e a senha
        if (login == "FIAP" && senha == "123") {
            // mudar de tela
            // tela de destino
            val intent = Intent(this,PedidoActivity::class)
            //passa um valor de uma tela para a outra
            intent.putExtra("Usuario", login)
            //Iniciar outra tela
            startActivity(intent)
            finish()
        } else {
            //Login ou senha invalidos
            Toast.makeText(this, "Usuario ou senha invalidos",
            Toast.LENGTH_SHORT).show()
        }
    }
}
