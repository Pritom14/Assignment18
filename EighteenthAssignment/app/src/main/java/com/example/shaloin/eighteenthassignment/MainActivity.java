package com.example.shaloin.eighteenthassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

public class MainActivity extends AppCompatActivity {

    private Tracker tracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnalyticsDemo analyticsDemo=(AnalyticsDemo)getApplication();
        tracker=analyticsDemo.getDefaultTracker();
    }

    @Override
    protected void onResume() {
        super.onResume();
        tracker.setScreenName("Main Screen");
        tracker.send(new HitBuilders.ScreenViewBuilder().build());

    }
}
