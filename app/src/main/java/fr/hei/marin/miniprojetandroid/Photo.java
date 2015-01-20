package fr.hei.marin.miniprojetandroid;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Marin on 20/01/2015.
 */
public class Photo extends Fragment {

    public Photo(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_photos, container, false);

        return rootView;
    }
}
