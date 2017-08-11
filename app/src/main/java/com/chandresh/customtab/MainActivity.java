package com.chandresh.customtab;

import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openWeb(View view) {

        String url = "http://www.enggroom.com";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
// set toolbar color and/or setting custom actions before invoking build()
// Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent


        builder.setToolbarColor(ContextCompat.getColor(this, R.color.colorPrimary));
        builder.setSecondaryToolbarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));

        builder.setShowTitle(true);
// Application exit animation, Chrome enter animation.
        builder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
// vice versa
        builder.setExitAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
        CustomTabsIntent customTabsIntent = builder.build();
// and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }
}
