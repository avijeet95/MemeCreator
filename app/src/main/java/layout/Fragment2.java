package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.avijeet95.android.memecreator.R;

public class Fragment2 extends Fragment {

    public Fragment2() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment2, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text_display);

        String str = getArguments().getString("text");
        textView.setText(str);
        return view;

    }
}
