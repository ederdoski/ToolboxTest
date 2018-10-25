package com.ederdoski.toolbox;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import com.ederdoski.toolbox.utils.Functions;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.marcinorlowski.fonty.Fonty;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Video extends AppCompatActivity {

    @BindView(R.id.playerView) PlayerView playerView;

    private void playVideo(){
        SimpleExoPlayer player = ExoPlayerFactory.newSimpleInstance(this);
        playerView.setPlayer(player);

        Uri videoUri = Uri.parse(Functions.getIntent(this));
        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(this, Util.getUserAgent(this, "Toolbox"));
        MediaSource videoSource = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(videoUri);
        player.prepare(videoSource);
    }

    private void fullScreenMode(){
        Video.this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_video);
        ButterKnife.bind(this);
        Fonty.setFonts(this);

        fullScreenMode();
        playVideo();
    }
}
