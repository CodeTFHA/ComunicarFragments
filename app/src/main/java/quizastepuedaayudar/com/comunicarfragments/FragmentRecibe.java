package quizastepuedaayudar.com.comunicarfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecibe extends Fragment {

    TextView txtrecibe;
    public FragmentRecibe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recibe, container, false);
        txtrecibe = (TextView) v.findViewById(R.id.txtrecibe);
        return v;
    }

    public void recibirTexto(String texto)
    {
        txtrecibe.setText(texto);
    }

}
