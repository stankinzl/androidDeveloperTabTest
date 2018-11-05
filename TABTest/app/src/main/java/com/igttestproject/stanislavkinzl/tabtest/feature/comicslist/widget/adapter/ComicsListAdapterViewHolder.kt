package com.igttestproject.stanislavkinzl.tabtest.feature.comicslist.widget.adapter

import android.net.Uri
import android.view.View
import com.igttestproject.stanislavkinzl.tabtest.app.ImageLoader
import com.igttestproject.stanislavkinzl.tabtest.app.base.BaseViewHolder
import com.igttestproject.stanislavkinzl.tabtest.app.model.Comic
import kotlinx.android.synthetic.main.comic_card.*

class ComicsListAdapterViewHolder(
        override val containerView: View,
        private val imageLoader: ImageLoader
) : BaseViewHolder(containerView) {

    fun showImage(url: String?) {
        url?.let { imageLoader.load(it, comics_list_item_thumbnail) }
    }

    fun showComic(comic: Comic) {
        showImage(comic.url)
        comics_list_item_title.text = comic.name
        comics_list_itemcount.text = comic.pageCount.toString()
    }

}