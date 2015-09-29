package tony.week1gallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import tony.week1gallery.model.GalleryItem;
import tony.week1gallery.view.ViewAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ViewAdapter viewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv_image_gallery);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        viewAdapter = new ViewAdapter(createMockContent());
        recyclerView.setAdapter(viewAdapter);
    }

    private List<GalleryItem> createMockContent(){

        List<GalleryItem> galleryItems = new ArrayList<>();

        GalleryItem galleryItem1 = new GalleryItem(R.drawable.vaultboy, getString(R.string.vaulString));
        GalleryItem galleryItem2 = new GalleryItem(R.drawable.batman, getString(R.string.batString));
        GalleryItem galleryItem3 = new GalleryItem(R.drawable.gokart, getString(R.string.gokartString));
        GalleryItem galleryItem4 = new GalleryItem(R.drawable.pizza, getString(R.string.pizzaString));

        galleryItems.add(galleryItem1);
        galleryItems.add(galleryItem2);
        galleryItems.add(galleryItem3);
        galleryItems.add(galleryItem4);

        return galleryItems;
    }

}
