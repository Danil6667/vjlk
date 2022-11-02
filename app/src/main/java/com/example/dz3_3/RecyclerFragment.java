package com.example.dz3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class RecyclerFragment extends Fragment implements OnItemClickListener {

    private final FootballClubRepository repository = new FootballClubRepository();
    private final FootballClubAdapter adapter = new FootballClubAdapter(this);
    private RecyclerView rvListOfFilm;
    private FloatingActionButton btmAdd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvListOfFilm = view.findViewById(R.id.rv_list_of_club);
        btmAdd = view.findViewById(R.id.btm_add);

        initialize();
        click();
        adapter.setData(repository.getListOfClubs());
    }

    private void click() {
        btmAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddFragment addFragment = new AddFragment();
                FragmentManager fragmentManager = getChildFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, addFragment)
                        .commit();
            }
        });
    }

    private void initialize() {
        rvListOfFilm.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvListOfFilm.setAdapter(adapter);
    }

    @Override
    public void onClick(FootballClubModel model) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("text",model);
        bundle.putString("club", model.getName());
        bundle.putInt("win", model.getWins());
        getParentFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.anim_rignt_to_left, R.anim.anim_rignt_to_left,
                        R.anim.anim_left_to_rignt, R.anim.exit_left_to_right)
                .add(R.id.fragment_container, DetailFragment.class, bundle)
                .addToBackStack("RecyclerFragment")
                .commit();

    }
}