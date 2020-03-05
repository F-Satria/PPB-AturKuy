package com.example.aturkuy;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentAK extends Fragment {
    View view;
    Button firstButton;
    private RecyclerView recyclerView;
    private TugasAdapter adapter;
    private ArrayList<Tugas> tugasArrayList;

    //Daftar Preview
    private int[] gambar = {R.drawable.coding, R.drawable.coding, R.drawable.coding, R.drawable.testing};
    //Daftar Tugas
    private String[] nama = {"Ngoding", "Ngoding", "Ngoding", "Testing"};
    //Daftar Deadline
    private String[] deadline = {"1 Maret 2020", "8 Maret 2020", "15 Maret 2020", "22 Maret 2020"};
    //Daftar Urgensi
    private String[] urgensi = {"Tinggi", "Tinggi", "Sedang", "Sangat Tinggi"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_ak, container, false);
        tugasArrayList = new ArrayList<>();
        RecyclerView recyclerView = view.findViewById(R.id.listTugasAK);
        DaftarItem();

        //Menggunakan LM dan Membuat List menjadi Vertikal
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        //Membuat Underline pada setiap item pada list
        DividerItemDecoration itemDecoration = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.line));
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new TugasAdapter(tugasArrayList);

        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);

// get the reference of Button
        firstButton = (Button) view.findViewById(R.id.first_btn);
// perform setOnClickListener on first Button
        firstButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
// display a message by using a Toast
            Toast.makeText(getActivity(), "First Fragment", Toast.LENGTH_LONG).show();
        }
    });
        return view;
}
    private void DaftarItem(){
        int count = 0;
        for (String name : nama){
            tugasArrayList.add(new Tugas(gambar[count], nama[count], deadline[count], urgensi[count]));
            count++;
        }
    }

}

