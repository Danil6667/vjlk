package com.example.dz3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class RecyclerFragment extends Fragment {

    private ListOfFilmAdapter adapter = new ListOfFilmAdapter();
    private List<String> ListOfFilm = new ArrayList<>();
    private RecyclerView rvListOfFilm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvListOfFilm= view.findViewById(R.id.rv_films);
        ListOfFilm.add("Rogue One");
        ListOfFilm.add("The Revenant");
        ListOfFilm.add("Star Trek");
        ListOfFilm.add("Captain America: Civil War");
        ListOfFilm.add("The Imitation Game");
        ListOfFilm.add("Shutter Island");
        ListOfFilm.add("12 Years a Slave");
        ListOfFilm.add("Mad Max: Fury Road");
        ListOfFilm.add("Gone girl");
        ListOfFilm.add("The Dark Knight Rises");
        ListOfFilm.add("Django Unchained");
        ListOfFilm.add("The Wolf of Wall Street");
        initialize();
        adapter.setData(ListOfFilm);
    }

    private void initialize() {
        rvListOfFilm.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        rvListOfFilm.setAdapter(adapter);
    }
}