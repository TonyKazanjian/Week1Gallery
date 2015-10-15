package tony.week1gallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import tony.week1gallery.util.Constant;
import tony.week1gallery.view.ViewAdapter;

/**
 * Created by tonyk_000 on 10/11/2015.
 */
public class FullScreenImageActivity extends AppCompatActivity {

    ViewAdapter mViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        //TODO: get the extra for hte fullscreen image
        Intent intent = getIntent();
        Bundle imageBundle = intent.getExtras();
        //TODO: set the resource reference on an ImageView
        ImageView fullscreenImage = (ImageView)findViewById(R.id.iv_image_fullscreen);
        fullscreenImage.setImageResource(imageBundle.getInt(Constant.FULLSCREEN_IMAGE_EXTRA));
        //TODO: make sure that we are setting the activity up so that it is in immersive mode
        fullscreenImage.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN);
        //TODO: scale the image so it takes as much space as possible, scale appropriately in landscape or portrait
//        fullscreenImage.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        //TODO: go back to the main activity - when we go in to immersive mode, the toolbar goes away. When whe tap on the screen the toolbar comes back
        this.getSupportActionBar().hide();
    }
    
}
