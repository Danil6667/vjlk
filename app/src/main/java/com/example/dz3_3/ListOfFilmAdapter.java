package com.example.dz3_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListOfFilmAdapter extends RecyclerView.Adapter<ListOfFilmAdapter.FilmViewHolder> {

    private List<String> ListOfFilm;

    public void setData(List<String>ListOfFilm){
        this.ListOfFilm = ListOfFilm;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FilmViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
        holder.onBind(ListOfFilm.get(position));

    }

    @Override
    public int getItemCount() {
        return ListOfFilm.size();
    }


    public class FilmViewHolder extends RecyclerView.ViewHolder {

        private TextView tvFilm;

        public FilmViewHolder(@NonNull View itemView) {
            super(itemView);
            tvFilm = itemView.findViewById(R.id.tv_film);
        }

        public void onBind(String film) {
            tvFilm.setText(film);
        }
    }
}
