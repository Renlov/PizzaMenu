package com.example.pizza;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardAdapterHolder> {
    Context context;
    private ArrayList<CardResource> arrayList;

    public CardAdapter(ArrayList<CardResource> arrayList, Context context){
        this.arrayList = arrayList;
        this.context = context;
    }

    public class CardAdapterHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;

        public CardAdapterHolder(@NonNull final View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text2);

            }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            CardResource cardResource = arrayList.get(position);

            Intent intent = new Intent(context, MainActivity2.class);
            intent.putExtra("imageResource", cardResource.getImageResource());
            context.startActivity(intent);

        }
    }


    @NonNull
    @Override
    public CardAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_review, parent, false);
        CardAdapterHolder cardAdapterHolder = new CardAdapterHolder(view);
        return cardAdapterHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapterHolder holder, int position) {
        final CardResource cardResource = arrayList.get(position);
        holder.imageView.setImageResource(cardResource.getImageResource());
        holder.textView1.setText(cardResource.getText1());
        holder.textView2.setText(cardResource.getText2());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
