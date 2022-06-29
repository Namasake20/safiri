package com.namasake.densey.framework.datasource.network.firebase

import com.google.firebase.firestore.FirebaseFirestore
import com.namasake.densey.business.domain.model.Blog
import com.namasake.densey.business.domain.util.Constants.BLOG_COLLECTION
import kotlinx.coroutines.tasks.await

class BlogDatabase {
    private val firestore = FirebaseFirestore.getInstance()
    private val blogCollection = firestore.collection(BLOG_COLLECTION)

    suspend fun getAllBlogs():List<Blog>{
        return try {
            blogCollection.get().await().toObjects(Blog::class.java)
        } catch (e: Exception){
            return emptyList()
        }
    }
}