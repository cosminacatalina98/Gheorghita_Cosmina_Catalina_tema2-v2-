package com.example.myapplication2;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    public List<User> users;

    public static class ViewHolder extends RecyclerView.ViewHolder{
    public TextView mTextView;
    public ViewHolder(TextView v){
        super (v);
        mTextView=v;
    }
}
public MyAdapter(List<User> myDataset){
    users=myDataset;
}


    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    TextView v=(TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.my_text_view, parent,false);
    ViewHolder vh= new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
    //holder.mTextView.setText(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
