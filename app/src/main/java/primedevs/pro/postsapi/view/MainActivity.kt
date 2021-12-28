package primedevs.pro.postsapi.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import primedevs.pro.postsapi.databinding.ActivityMainBinding
import primedevs.pro.postsapi.viewmodel.PostListViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: PostListViewModel
    private lateinit var binding: ActivityMainBinding
    private val postListAdapter: PostListAdapter = PostListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel =ViewModelProvider(this).get(PostListViewModel::class.java)
        viewModel.refresh()

        binding.postsList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = postListAdapter
        }

        observeViewModel()
    }

    private fun observeViewModel() {
        viewModel.posts.observe(this,{
            it?.let {
                postListAdapter.updatePosts(it)
            }
        })
    }
}