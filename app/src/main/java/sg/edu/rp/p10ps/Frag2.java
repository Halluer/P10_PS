package sg.edu.rp.p10ps;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {

    ImageView iv;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        iv = view.findViewById(R.id.iv);
        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(getActivity()).load(imageUrl).into(iv);



        return view;
    }



}
