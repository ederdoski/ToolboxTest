package com.ederdoski.toolbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ederdoski.toolbox.adapters.CarrouselAdapter;
import com.ederdoski.toolbox.models.Carrousel;
import com.ederdoski.toolbox.models.Movies;
import com.ederdoski.toolbox.utils.Constants;
import com.ederdoski.toolbox.utils.JsonUtils;
import com.marcinorlowski.fonty.Fonty;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    ArrayList<Movies>    aMovies    = new ArrayList<>();
    ArrayList<Carrousel> aCarrousel = new ArrayList<>();

    @BindView(R.id.listCarrousel) RecyclerView listCarrousel;

    private void parseJsonCarrousel(){

        JSONArray jCarrousel = JsonUtils.parseJsonArray(Constants.CARROUSEL);

        for(int i=0; i<jCarrousel.length(); i++) {

            String info = JsonUtils.getFromJsonArray(jCarrousel, i).toString();

            JSONObject jData  =  JsonUtils.parseJson(info);

            String itemPoster = JsonUtils.getStringFromJson(jData, "items");

            JSONArray aItems  = JsonUtils.parseJsonArray(itemPoster);

            for(int j=0; j<aItems.length(); j++) {

                info = JsonUtils.getFromJsonArray(aItems, j).toString();
                JSONObject jAux =  JsonUtils.parseJson(info);

                aMovies.add(new Movies(JsonUtils.getStringFromJson(jAux, "title"),
                        JsonUtils.getStringFromJson(jAux, "url"),
                        JsonUtils.getStringFromJson(jAux, "video")));

            }
            aCarrousel.add(new Carrousel(JsonUtils.getStringFromJson(jData, "title"), JsonUtils.getStringFromJson(jData, "type"), aMovies));
            aMovies = new ArrayList<>();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Fonty.setFonts(this);

        parseJsonCarrousel();

        CarrouselAdapter adapter = new CarrouselAdapter(MainActivity.this, aCarrousel);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        listCarrousel.setLayoutManager(horizontalLayoutManager);
        listCarrousel.setAdapter(adapter);
    }
}


