package com.example.aorora.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aorora.R;
import com.example.aorora.model.RetroPhoto;

import java.util.List;

public class GridViewAdapter extends RecyclerView.Adapter<GridViewAdapter.GridViewHolder> {
    private List<RetroPhoto> dataList;
    private Context context;

    public GridViewAdapter(Context context, List<RetroPhoto> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class GridViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView userName;
        ImageView coverImage;

        GridViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            userName = mView.findViewById(R.id.friends_user_name_tv);
            coverImage = mView.findViewById(R.id.cover_image_friends);
        }
    }

    @NonNull
    @Override
    public GridViewAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_friends_grid, parent, false);
        return new GridViewAdapter.GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewAdapter.GridViewHolder customViewHolder, int position) {
        customViewHolder.userName.setText(dataList.get(position).getTitle().substring(1,7));
        customViewHolder.coverImage.setImageResource(R.drawable.orange_butterfly_image);
    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
