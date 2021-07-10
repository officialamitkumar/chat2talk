package com.example.chat2talk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.chat2talk.databinding.RowConversationBinding;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UsersViewHolder> {

    Context context;
    ArrayList<User> users;
   public UserAdapter(Context context,ArrayList<User> users){
       this.context=context;
       this.users=users;
   }
    @Override
    public UsersViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(context).inflate(R.layout.row_conversation,parent,false);
        return new UsersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  UserAdapter.UsersViewHolder holder, int position) {

       User user = users.get(position);
       holder.binding.userName.setText(user.getName());

        Glide.with(context).load(user.getProfileImage())
                .placeholder(R.drawable.avatar)
                .into(holder.binding.profile);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class UsersViewHolder extends RecyclerView.ViewHolder{

        RowConversationBinding binding;

        public UsersViewHolder(@NonNull View itemView){
            super(itemView);
            binding = RowConversationBinding.bind(itemView);
        }
    }
}
