package work.beltran.discogsbrowser.collection

import androidx.lifecycle.ViewModel
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import work.beltran.discogsbrowser.common.domain.Album

class CollectionViewModel(
    collectionDataSourceFactory: DataSource.Factory<Int, Album>
) : ViewModel() {

    val liveData = LivePagedListBuilder(
        collectionDataSourceFactory, PagedList.Config.Builder()
            .setPageSize(20)
            .build()
    ).build()
}
