package com.example.newsappvertical;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewRVAdapter extends RecyclerView.Adapter<NewRVAdapter.ViewHolder> {
    private ArrayList<ArticlesModel> articlesModelArrayList;
    private Context context;

    public NewRVAdapter(ArrayList<ArticlesModel> articlesModelArrayList, Context context) {
        this.articlesModelArrayList = articlesModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public NewRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.new_rv_item,parent,false);
        return new NewRVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewRVAdapter.ViewHolder holder, int position) {
        ArticlesModel articles = articlesModelArrayList.get(position);
        holder.titleTV.setText(articles.getTitle());
        holder.subTitleTV.setText(articles.getDescription());
        Picasso.get().load(articles.getUrlToImage()).into(holder.newsIV);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,NewsDetailActivity.class);
                i.putExtra("title",articles.getTitle());
                i.putExtra("content",articles.getTitle());
                i.putExtra("description",articles.getTitle());
                i.putExtra("url",articles.getTitle());
                i.putExtra("urlToImage",articles.getTitle());
                context.startActivity(i);
                }
        });

    }

    @Override
    public int getItemCount() {
        return articlesModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView titleTV, subTitleTV;
        private ImageView newsIV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV= (TextView)itemView.findViewById(R.id.idTVNewsHeading);
            subTitleTV= (TextView)itemView.findViewById(R.id.idTVSubTitle);
            newsIV=(ImageView) itemView.findViewById(R.id.idIVNews);
        }
    }
}
