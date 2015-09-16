package tony.week1gallery.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import tony.week1gallery.R;
import tony.week1gallery.model.GalleryItem;

/**
 * Created by tonyk_000 on 9/15/2015.
 */
public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewAdapterViewHolder> {

    ImageCardView imageCardView;
    GalleryItem galleryItem;


    public ViewAdapter (GalleryItem galleryItem){
        this.galleryItem = galleryItem;
    }

    @Override
    public ViewAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO: make the recyclerview gallery with the split column
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_view, parent, false);
        return new ViewAdapterViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(ViewAdapterViewHolder holder, int position) {
        imageCardView.populate(galleryItem);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    protected class ViewAdapterViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView caption;


        public ViewAdapterViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.iv_gallery_image);
            caption = (TextView) itemView.findViewById(R.id.tv_caption);
        }

    }
}
