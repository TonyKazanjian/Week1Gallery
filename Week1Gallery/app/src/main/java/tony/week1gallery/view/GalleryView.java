package tony.week1gallery.view;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import tony.week1gallery.R;
import tony.week1gallery.model.GalleryItem;

/**
 * Created by tonyk_000 on 9/18/2015.
 */
public class GalleryView extends RecyclerView {

    private ImageCardView imageCardView;

    private RecyclerView recyclerView;
    public GalleryView(Context context) {
        this(context, null);
    }

    public GalleryView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GalleryView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public void init(){
        recyclerView = (RecyclerView)findViewById(R.id.rv_image_gallery);
        recyclerView.setLayoutManager(new GridLayoutManager(super.getContext(),2));
        recyclerView.setAdapter(new ViewAdapter(imageCardView.populate(new GalleryItem(null,null)));)
    }
}
