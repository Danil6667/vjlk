package com.example.dz3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;


public class AddFragment extends Fragment {


    private EditText edPhoto, edName, edWin;
    private MaterialButton btmAdd;
    private FootballClubModel model;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edPhoto = view.findViewById(R.id.ed_photo);
        edName = view.findViewById(R.id.ed_name);
        edWin = view.findViewById(R.id.ed_win);
        btmAdd = view.findViewById(R.id.btm_one);
        click();
    }

    private void click() {
        btmAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textPhoto = edPhoto.getText().toString().trim();
                String textName = edName.getText().toString().trim();
                String textWin = edWin.getText().toString().trim();
                if (textPhoto.isEmpty()) {
                    edPhoto.setError("Заполните Поле");
                } else if (textName.isEmpty()) {
                    edName.setError("Заполните Поле");
                } else if (textWin.isEmpty()) {
                    edWin.setError("Заполните Поле");
                } else {
                    Bundle bundle = new Bundle();
                    model = new FootballClubModel(textPhoto, textName, Integer.parseInt(textWin), "#FFFFFF");
                    bundle.putSerializable("editClub", model);
                    getParentFragmentManager().setFragmentResult("OK", bundle);
                    getParentFragmentManager().popBackStack();
                }
            }
        });
    }
}