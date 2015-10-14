package tony.week1gallery.view;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import tony.week1gallery.FullScreenImageActivity;
import tony.week1gallery.model.GalleryItem;
import tony.week1gallery.util.Constant;

/**
 * Created by tonyk_000 on 9/15/2015.
 */
public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewAdapterViewHolder> {

    List<GalleryItem> galleryItemList  = new ArrayList<>();

    public ViewAdapter (@NonNull List<GalleryItem> galleryItem){this.galleryItemList = galleryItem;
    }

    @Override
    public ViewAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //creation of ImageCardView happens here
        return new ViewAdapterViewHolder(new ImageCardView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewAdapterViewHolder holder, int position) {
       final GalleryItem itemForBinding= galleryItemList.get(position);
        holder.imageCardView.populate(itemForBinding);
        holder.imageCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, FullScreenImageActivity.class);
                intent.putExtra(Constant.FULLSCREEN_IMAGE_EXTRA, itemForBinding.getImage());
                context.startActivity(intent);
            }
        });
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
