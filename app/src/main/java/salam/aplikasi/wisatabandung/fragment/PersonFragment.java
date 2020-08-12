package salam.aplikasi.wisatabandung.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import salam.aplikasi.wisatabandung.R;

public class PersonFragment extends Fragment {
//    NIM :10117280 NAMA : Richie Sambora
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vi = inflater.inflate(R.layout.fragment_person, container, false);

        ImageView img = vi.findViewById(R.id.imgAvatar);
        img.setImageResource(R.drawable.rchback);


        return  vi;
    }
}