package quizastepuedaayudar.com.comunicarfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentEnvia extends Fragment {


    Comunicador comunicador;

    public FragmentEnvia() {
        // Required empty public constructor
    }

    public interface Comunicador{
        void enviar(String envia);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_envia, container, false);
        final EditText textoenvia = (EditText) v.findViewById(R.id.etenvia);
        Button btnenviar = (Button) v.findViewById(R.id.btnenviar);
        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 comunicador.enviar(textoenvia.getText().toString());
            }
        });

        return v;
    }

    @Override
    public void onAttach(Context context) {
        comunicador = (Comunicador) context;
        super.onAttach(context);
    }
}
