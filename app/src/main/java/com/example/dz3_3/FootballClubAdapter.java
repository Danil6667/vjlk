package com.example.dz3_3;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class FootballClubAdapter extends RecyclerView.Adapter<FootballClubAdapter.ClubViewHolder> implements View.OnClickListener
{

    private List<FootballClubModel> listClubs;
    private OnItemClickListener onItemClickListener;

    public FootballClubAdapter(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setData(List<FootballClubModel> listClubs) {
        this.listClubs = listClubs;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ClubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ClubViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_club, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClubViewHolder holder, int position) {
        holder.itemView.setOnClickListener(this);
        holder.onBind(listClubs.get(position));
    }

    @Override
    public int getItemCount() {
        return listClubs.size();
    }

    @Override
    public void onClick(View view) {
        onItemClickListener.onClick((FootballClubModel) view.getTag());
    }

    public static class ClubViewHolder extends RecyclerView.ViewHolder {

        private MaterialCardView mainContainer;
        private  ImageView ivLabel;
        private  TextView tvClub;
        private  TextView tvWins;

        public ClubViewHolder(@NonNull View itemView) {
            super(itemView);
            ivLabel = itemView.findViewById(R.id.iv_label);
            tvWins = itemView.findViewById(R.id.tv_win);
            tvClub = itemView.findViewById(R.id.tv_club);
            mainContainer = itemView.findViewById(R.id.main_container);
        }

        public void onBind(FootballClubModel clubs) {
            Glide.with(ivLabel.getContext()).load(clubs.getLabelUri()).into(ivLabel);
            tvWins.setText(String.valueOf(clubs.getWins()));
            tvClub.setText(clubs.getName());
            mainContainer.setCardBackgroundColor(Color.parseColor(clubs.getColorClub()));
            itemView.setTag(clubs);
        }
    }
}
