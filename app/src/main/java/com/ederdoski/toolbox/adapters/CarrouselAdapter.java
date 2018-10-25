package com.ederdoski.toolbox.adapters;


import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ederdoski.toolbox.R;
import com.ederdoski.toolbox.models.Carrousel;
import com.ederdoski.toolbox.models.Movies;

import java.util.ArrayList;
import java.util.List;

public class CarrouselAdapter extends RecyclerView.Adapter<CarrouselAdapter.MyViewHolder> {

    private Context mContext;
    private List<Carrousel> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public RecyclerView listCarrousel;

        public MyViewHolder(View view) {
            super(view);
            listCarrousel   = view.findViewById(R.id.listCarrousel);
            title           = view.findViewById(R.id.txtTitle);
        }
    }


    public CarrouselAdapter(Context mContext, List<Carrousel> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.node_list_carrousel, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        Carrousel aCarrousel = albumList.get(position);

        MoviesAdapter moviesAdapter = new MoviesAdapter((Activity) mContext, aCarrousel.getItems(), aCarrousel.getType());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);

        holder.title.setText(aCarrousel.getTitle());
        holder.listCarrousel.setLayoutManager(horizontalLayoutManager);
        holder.listCarrousel.setAdapter(moviesAdapter);

        ArrayList<Movies> aMovies = new ArrayList<>();

        List<Movies> carrouselMovies = aCarrousel.getItems();

        for(int i = 0; i < carrouselMovies.size(); i++){
            aMovies.add(new Movies(carrouselMovies.get(i).getTitle(), carrouselMovies.get(i).getUrl(), carrouselMovies.get(i).getVideo()));
        }
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

}
