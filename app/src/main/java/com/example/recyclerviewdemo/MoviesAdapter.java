package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.model.Movie;

import java.util.ArrayList;
import java.util.List;

class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
//Step 1: Create a class which extends RecyclerView.ViewHolder
    // Step 2: Let base class implement MyViewHolder
// Step 3: Implement methods
List<Movie> list= new ArrayList<>();

    public MoviesAdapter(List<Movie> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_movies, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
Movie movie= list.get(position);
holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGerne());
        holder.year.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
    public TextView title, year, genre;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.tvTitle);
        genre = (TextView) itemView.findViewById(R.id.tvGenre);
        year = (TextView) itemView.findViewById(R.id.tvYear);
    }
    }

    public MoviesAdapter(Context applicationContext, int rv_movies, List<Movie> movieList) {
    }
}
