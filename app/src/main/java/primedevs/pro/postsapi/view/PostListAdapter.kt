package primedevs.pro.postsapi.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import primedevs.pro.postsapi.R
import primedevs.pro.postsapi.model.Post


class PostListAdapter(var postList: ArrayList<Post>) :
    RecyclerView.Adapter<PostListViewHolder>() {

    fun updatePosts(newPostList: List<Post>) {
        postList.clear()
        postList.addAll(newPostList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.post_item, parent, false)
        return PostListViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostListViewHolder, position: Int) {
        holder.userId.text = postList[position].userId.toString()
        holder.id.text = postList[position].id.toString()
        holder.title.text = postList[position].title
        holder.body.text = postList[position].body
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}

class PostListViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val userId: TextView = view.findViewById(R.id.textView_userId)
    val id: TextView = view.findViewById(R.id.textView_id)
    val title: TextView = view.findViewById(R.id.textView_title)
    val body: TextView = view.findViewById(R.id.textView_body)
}