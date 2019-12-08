package com.example.holidaybox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeThumbnailView;

public class WhiteChristmasPie extends YouTubeBaseActivity {
    private static final String TAG = "WhiteChristmasPie";
    YouTubePlayerView YouTubePlayerView;
    Button buttonPlay;
    YouTubePlayer.OnInitializedListener OnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube);
        Log.d(TAG, "Starting");
        buttonPlay = (Button)findViewById(R.id.playButton);
        YouTubePlayerView = (YouTubePlayerView)findViewById(R.id.youtubePlayer);

        OnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "Finished");

                youTubePlayer.loadVideo("386gWRpYfes");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "Failed to Initialize");
            }
        };
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Initializing video");
                YouTubePlayerView.initialize(YoutubeConfiguration.getApiKey(), OnInitializedListener);

            }
        });
    }
}

