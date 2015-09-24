package tony.week1gallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import tony.week1gallery.model.GalleryItem;
import tony.week1gallery.view.ImageCardView;
import tony.week1gallery.view.ViewAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ViewAdapter viewAdapter;
    ImageCardView imageCardView = new ImageCardView(this,null,0);
    List<GalleryItem> galleryItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv_image_gallery);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        viewAdapter = new ViewAdapter(galleryItems);
        recyclerView.setAdapter(viewAdapter);
        imageCardView.populate(galleryItems.get(0));
    }

}
