package primedevs.pro.postsapi.model

import io.reactivex.Single
import retrofit2.http.GET

interface PostApi {

    @GET("posts")
    fun getPosts(): Single<List<Post>>

}