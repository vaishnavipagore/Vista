package com.example.vista1.ui.premium;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vista1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link premium#newInstance} factory method to
 * create an instance of this fragment.
 */
public class premium extends Fragment {

    // TODO: Rename and change types and number of parameters
    public static premium newInstance() {
        premium fragment = new premium();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_premium, container, false);
    }
}