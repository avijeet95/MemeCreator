package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.avijeet95.android.memecreator.R;

/**
 * A simple {@link Fragment} subclass.
 */

public class Fragment1 extends Fragment implements View.OnClickListener{


    public Fragment1() {
        // Required empty public constructor
    }
    private EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment1, container, false);
        editText = (EditText) view.findViewById(R.id.edit1);
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                String str = editText.getText().toString();
                Fragment2 fragment2 = new Fragment2();

                android.support.v4.app.FragmentTransaction var = getFragmentManager().beginTransaction();
                Bundle bundle = new Bundle();
                bundle.putString("text",str);
                fragment2.setArguments(bundle);
                var.replace(R.id.frame2,fragment2);
                var.commit();


        }
    }
}
