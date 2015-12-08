package quizastepuedaayudar.com.comunicarfragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Principal extends AppCompatActivity implements FragmentEnvia.Comunicador{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public void enviar(String envia) {
         FragmentRecibe recibe = (FragmentRecibe) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        if (recibe != null)
        {
            recibe.recibirTexto(envia);
        }
    }
}
