import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.ListenableFuturePagingSource;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;

import com.google.common.util.concurrent.ListenableFuture;

public class GalleryPagingSource {
    ListenableFuturePagingSource<Integer, ImageData> {

        GalleryRepository galleryRepository;

        Integer initialLoadSize = 0;

        public GalleryPagingSource(GalleryRepository galleryRepository) {
            this.galleryRepository = galleryRepository;
        }

        @Nullable
        @Override
        public Integer getRefreshKey(PagingState<Integer, ImageData> pagingState) {
            return null;
        }

        @NonNull
        @Override
        public ListenableFuture<PagingSource.LoadResult<Integer, ImageData>>loadFuture(LoadParams<Integer> loadParams) {
            Integer nextPageNumber = loadParams.getKey();
        }
    }
}
