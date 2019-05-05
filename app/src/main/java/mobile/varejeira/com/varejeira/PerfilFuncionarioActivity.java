package mobile.varejeira.com.varejeira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.varejeira.mobile.R;

public class PerfilFuncionarioActivity extends AppCompatActivity {

    private TextView nomeFuncionario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_funcionario);
    }
}
