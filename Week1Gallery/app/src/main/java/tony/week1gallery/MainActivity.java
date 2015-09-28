package tony.week1gallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import tony.week1gallery.model.GalleryItem;
import tony.week1gallery.view.ImageCardView;
import tony.week1gallery.view.ViewAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ViewAdapter viewAdapter;
    ImageCardView imageCardView;
    ImageView mImage;
    TextView mCaption;
    GalleryItem mGalleryItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv_image_gallery);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mImage = (ImageView) recyclerView.findViewById(R.id.iv_gallery_image);
        mCaption = (TextView) recyclerView.findViewById(R.id.tv_caption);
        viewAdapter = new ViewAdapter(createMockContent(mGalleryItem));
        recyclerView.setAdapter(viewAdapter);
    }

    private List<GalleryItem> createMockContent(GalleryItem galleryItem){

        int galleryImage = mImage.getId();
        String galleryCaption = mCaption.toString();
        galleryItem = new GalleryItem(galleryImage,galleryCaption);
        List<GalleryItem> galleryItems = new ArrayList<>();
        galleryItems.add(0,galleryItem);
        imageCardView = new ImageCardView(this,null,0);
        imageCardView.populate(galleryItems.get(0));
        return galleryItems;
    }

}
