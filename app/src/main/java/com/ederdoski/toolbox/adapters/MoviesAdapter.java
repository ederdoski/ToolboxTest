package com.ederdoski.toolbox.adapters;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ederdoski.toolbox.R;
import com.ederdoski.toolbox.Video;
import com.ederdoski.toolbox.models.Movies;
import com.ederdoski.toolbox.utils.Functions;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.GroceryViewHolder>{

    private ArrayList<Movies> aMovies;
    private Activity act;
    private String type;

    public MoviesAdapter(Activity _act,  ArrayList<Movies> _aMovies, String _type){
        this.aMovies = _aMovies;
        this.act     = _act;
        this.type    = _type;
    }

    @Override
    public MoviesAdapter.GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.node_list_movie, parent, false);
        MoviesAdapter.GroceryViewHolder gvh = new MoviesAdapter.GroceryViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(MoviesAdapter.GroceryViewHolder holder, final int position) {

        String titleMovie = aMovies.get(position).getTitle();

        DisplayMetrics displaymetrics = new DisplayMetrics();
        act.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);

        holder.cardMovie.getLayoutParams().height = displaymetrics.widthPixels / 2;

        if(type.equals("thumb")){

            if(titleMovie.length() > 20){
                titleMovie = titleMovie.substring(0,18) + "...";
            }

            holder.cardMovie.getLayoutParams().width = displaymetrics.widthPixels / 2;
            Functions.setImage(act, aMovies.get(position).getUrl(), 640, 480, false, holder.imgMovie);
        }

        if(type.equals("poster")){

            if(titleMovie.length() > 12){
                titleMovie = titleMovie.substring(0,11) + "...";
            }

            holder.cardMovie.getLayoutParams().width = displaymetrics.widthPixels / 3;
            Functions.setImage(act, aMovies.get(position).getUrl(), 320, 480, false, holder.imgMovie);
        }

        if(type.equals("random")){

            if(titleMovie.length() > 12){
                titleMovie = titleMovie.substring(0,10) + "...";
            }
            holder.cardMovie.getLayoutParams().width = displaymetrics.widthPixels / 3;
            Functions.setImage(act, aMovies.get(position).getUrl(), 320, 480, true, holder.imgMovie);
        }

        holder.txtview.setText(titleMovie);

        holder.imgMovie.setOnClickListener(v -> {

            if(!aMovies.get(position).getVideo().equals("")) {
                Functions.changeActivity(act, Video.class, aMovies.get(position).getVideo());
            }else{
                Toast.makeText(act, "Este item no posee video.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return aMovies.size();
    }

    public class GroceryViewHolder extends RecyclerView.ViewHolder {

        CardView cardMovie;
        ImageView imgMovie;
        TextView txtview;

        public GroceryViewHolder(View view) {
            super(view);
            imgMovie  = view.findViewById(R.id.imgMovie);
            cardMovie = view.findViewById(R.id.cardMovie);
            txtview   = view.findViewById(R.id.txtTitle);
        }
    }
}