package tony.week1gallery.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import tony.week1gallery.model.GalleryItem;

/**
 * Created by tonyk_000 on 9/15/2015.
 */
public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewAdapterViewHolder> {

    List<GalleryItem> galleryItemList  = new ArrayList<>();

    public ViewAdapter (@NonNull List<GalleryItem> galleryItem){this.galleryItemList = galleryItem;
    }

    @Override
    public ViewAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewAdapterViewHolder(new ImageCardView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewAdapterViewHolder holder, int position) {
        holder.imageCardView.populate(galleryItemList.get(position));
    }

    @Override
    public int getItemCount() {
        return galleryItemList.size();
    }

    protected static class ViewAdapterViewHolder extends RecyclerView.ViewHolder {

       public ImageCardView imageCardView;

        public ViewAdapterViewHolder(ImageCardView imageCardView) {
            super(imageCardView);
            this.imageCardView = imageCardView;
        }

    }
}
