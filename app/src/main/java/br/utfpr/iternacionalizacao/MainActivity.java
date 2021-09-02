package br.utfpr.iternacionalizacao;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome, editTextSobrenome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextSobrenome = findViewById(R.id.editTextSobreNome);

        setTitle(R.string.novo_cadastro);

        Toast.makeText(this, getString(R.string.bem_vindo), Toast.LENGTH_SHORT).show();
    }

    public void limpar(View view){
        editTextNome.setText(null);
        editTextSobrenome.setText(null);
        editTextNome.requestFocus();
    }

    public void enviar(View view){
        String nome = editTextNome.getText().toString();
        String sobreNome = editTextSobrenome.getText().toString();

        Toast.makeText(this, getString(R.string.nome_completo,nome,sobreNome), Toast.LENGTH_SHORT).show();
    }

}