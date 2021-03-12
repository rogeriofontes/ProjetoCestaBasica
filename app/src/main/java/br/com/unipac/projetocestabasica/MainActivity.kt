package br.com.unipac.projetocestabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast.makeText(this, "Estamos no OnCreate", Toast.LENGTH_LONG).show();

        val helloText: TextView = findViewById(R.id.hello);
        helloText.text = "Estou mudando o texto"

        val nomeET: EditText = findViewById(R.id.nomeET);
        val emailET: EditText = findViewById(R.id.emailET);
        val telefoneET: EditText = findViewById(R.id.telefoneET);

        val salvarBT: Button = findViewById(R.id.salvarBT)

        var clickButton = View.OnClickListener {
            var nome = nomeET.text.toString();
            var email = emailET.text.toString();
            var telefone = telefoneET.text.toString();

            var message = buildString {
                append(nome)
                append(email)
                append(telefone)
            }

            Toast.makeText(this, "Cadastro $message", Toast.LENGTH_LONG).show();
        }
        salvarBT.setOnClickListener(clickButton);
    }

    override fun onStart() {
        super.onStart()
        //Toast.makeText(this, "Estamos no onStart", Toast.LENGTH_LONG).show();
    }

    override fun onResume() {
        super.onResume()
        //Toast.makeText(this, "Estamos no onResume", Toast.LENGTH_LONG).show();
    }

    override fun onPause() {
        super.onPause()
        //Toast.makeText(this, "Estamos no onPause", Toast.LENGTH_LONG).show();
    }

    override fun onRestart() {
        super.onRestart()
        //Toast.makeText(this, "Estamos no onRestart", Toast.LENGTH_LONG).show();
    }

    override fun onStop() {
        super.onStop()
        //Toast.makeText(this, "Estamos no onStop", Toast.LENGTH_LONG).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        // Toast.makeText(this, "Estamos no onDestroy", Toast.LENGTH_LONG).show();
    }

}