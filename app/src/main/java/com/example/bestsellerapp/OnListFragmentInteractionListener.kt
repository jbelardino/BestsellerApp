package com.example.bestsellerapp

import com.example.bestsellerapp.BestSellerBook

/**
 * This interface is used by the [BestSellerBooksRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [BestSellerBooksFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: BestSellerBook)
}
