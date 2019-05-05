package mobile.varejeira.com.varejeira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.varejeira.mobile.R;

public class Cadastro_cliente extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText cpf;
    private EditText sexo;

    private Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);

        this.cpf = findViewById(R.id.cpfcliente);
        this.nome = findViewById(R.id.nomecliente);
        this.email = findViewById(R.id.emailcliente);
        this.sexo = findViewById(R.id.sexocliente);

        this.cadastrar = findViewById(R.id.buttonCadastrar);

        // Cadastrar Cliente
        this.cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
