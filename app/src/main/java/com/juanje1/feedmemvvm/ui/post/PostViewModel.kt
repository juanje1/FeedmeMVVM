package com.juanje1.feedmemvvm.ui.post

import androidx.lifecycle.MutableLiveData
import com.juanje1.feedmemvvm.base.BaseViewModel
import com.juanje1.feedmemvvm.model.Post

class PostViewModel: BaseViewModel() {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle(): MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody(): MutableLiveData<String>{
        return postBody
    }
}