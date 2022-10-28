package com.example.dz3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;


public class FirstFragment extends Fragment {

    EditText editPassword;
    String isPassword = "aziz";
    MaterialButton buttonConfig;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ferst, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        editPassword = view.findViewById(R.id.ed_password);
        buttonConfig = view.findViewById(R.id.btn_vxod);
        click();
    }

    private void click() {

        buttonConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = editPassword.getText().toString().trim();
                if (!password.equals(isPassword)){
                    editPassword.setError("Неверный Пароль");
                }else{
                    requireActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, new RecyclerFragment())
                            .addToBackStack("FirstFragment")
                            .commit();
                }
            }
        });
    }
}