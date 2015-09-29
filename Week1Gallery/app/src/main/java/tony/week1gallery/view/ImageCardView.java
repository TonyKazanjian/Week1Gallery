package tony.week1gallery.view;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import tony.week1gallery.R;
import tony.week1gallery.model.GalleryItem;

/**
 * Created by tonyk_000 on 9/14/2015.
 */
public final class ImageCardView extends CardView {

    ImageView galleryImage;
    TextView galleryImageCaption;

    //this is just something you have to have when you're making a custom view so you are being specific in your implementation
    public ImageCardView(Context context) {
        this(context, null);
    }

    public ImageCardView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    //this is where you inflate your layout
    public ImageCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

        inflate(this.getContext(), R.layout.gallery_image_item, this);
        //this takes gallery_image_item and uses the imagecardview (this) as the root layout. The merge in gallery_image_item becomes ImageCardView
        galleryImage = (ImageView)findViewById(R.id.iv_gallery_image);
        //galleryImage.setImageResource(R.drawable.vaultboy);
        galleryImageCaption = (TextView)findViewById(R.id.tv_caption);
        //galleryImageCaption.setText(R.string.vaulString);
    }

    public void populate(GalleryItem galleryItem){

        galleryImage.setImageResource(galleryItem.getImage());
        galleryImageCaption.setText(galleryItem.getCaption());
    }
}
