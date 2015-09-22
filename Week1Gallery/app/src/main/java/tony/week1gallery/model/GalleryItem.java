package tony.week1gallery.model;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tonyk_000 on 9/15/2015.
 */
public class GalleryItem {

    //TODO: change these to image (can be a drawable) and string
    private ImageView image;
    private TextView caption;

    public GalleryItem(ImageView image, TextView caption) {
        this.image = image;
        this.caption = caption;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public TextView getCaption() {
        return caption;
    }

    public void setCaption(TextView caption) {
        this.caption = caption;
    }
}
