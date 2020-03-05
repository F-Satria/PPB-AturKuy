package com.example.aturkuy;

import android.app.Fragment;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.Toast;

public class FragmentNAK extends Fragment {

    View view;
    Button secondButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_nak, container, false);

// get the reference of Button
        secondButton = (Button) view.findViewById(R.id.second_btn);

// perform setOnClickListener on second Button
        secondButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

// display a message by using a Toast
                Toast.makeText(getActivity(), "Second Fragment", Toast.LENGTH_LONG).show();

            }
        });

        return view;

    }
}