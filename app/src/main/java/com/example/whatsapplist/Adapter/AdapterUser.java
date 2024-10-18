package com.example.whatsapplist.Adapter;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapplist.Model.User;
import com.example.whatsapplist.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.UserViewHolder> {

    private List<User> userList = new ArrayList<>();

    public AdapterUser(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creating views;
        View itemList;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        itemList = layoutInflater.inflate(R.layout.user_item, parent, false);
        return new UserViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        //Show views in the screen;
        holder.photo.setImageResource(userList.get(position).getPhoto());
        holder.name.setText(userList.get(position).getName());
        holder.message.setText(userList.get(position).getMessage());
        holder.hour.setText(userList.get(position).getHour());
        if (userList.get(position).getCountMessage() != "") {
            holder.countMessage.setText(userList.get(position).getCountMessage());
            holder.countMessage.setVisibility(View.VISIBLE);
            holder.message.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        //View Type;
        private ImageView photo;
        private TextView name;
        private TextView message;
        private TextView hour;
        private Button countMessage;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            photo = itemView.findViewById(R.id.photo_user);
            name = itemView.findViewById(R.id.name_user);
            message = itemView.findViewById(R.id.message_user);
            hour = itemView.findViewById(R.id.hour_user);
            countMessage = itemView.findViewById(R.id.count_msg_user);

        }
    }
}
