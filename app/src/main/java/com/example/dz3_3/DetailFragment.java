package com.example.dz3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;


public class DetailFragment extends Fragment {

    private TextView tvWin;
    private TextView tvClub;
    private ImageView ivFullscreen;
    private FootballClubModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvClub = view.findViewById(R.id.tv_club);
        tvWin = view.findViewById(R.id.tv_win);
        ivFullscreen = view.findViewById(R.id.iv_fullscreen);
        getData();
    }

    private void getData() {
        Bundle argument = getArguments();
        if (argument != null) {
            model = (FootballClubModel) argument.getSerializable("text");
            Glide.with(ivFullscreen.getContext()).load(model.getLabelUri()).into(ivFullscreen);
            tvClub.setText(model.getName());
            tvWin.setText(String.valueOf(model.getWins()));
        }
    }
}