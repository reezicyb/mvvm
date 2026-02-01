package com.estrada.mvvm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {

    Context context;
    List<UserItem> items;

    public UserAdapter(Context context, List<UserItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.imageView.setImageResource(items.get(position).getImage());
        holder.name.setText(items.get(position).getName());
        holder.status.setText(items.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}