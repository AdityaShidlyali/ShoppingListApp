package com.adityashidlyali.shoppinglist.repositories

import com.adityashidlyali.shoppinglist.db.ShoppingDatabase
import com.adityashidlyali.shoppinglist.models.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    // inside the repository class we implement all the database methods which are defined inside
    // the ShoppingDao object and call these following and provide these methods for the ViewModel
    // so that ViewModel can call these methods.

    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}