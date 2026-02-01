package com.estrada.mvvm;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView name, status;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageview);
        name = itemView.findViewById(R.id.userName);
        status = itemView.findViewById(R.id.userStatus);
    }
}