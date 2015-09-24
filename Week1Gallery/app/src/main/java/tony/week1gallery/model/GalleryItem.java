package tony.week1gallery.model;

/**
 * Created by tonyk_000 on 9/15/2015.
 */
public class GalleryItem {

    //TODO: change these to image (can be a drawable) and string
    private int image;
    private String caption;

    public GalleryItem(int image, String caption) {
        this.image = image;
        this.caption = caption;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
