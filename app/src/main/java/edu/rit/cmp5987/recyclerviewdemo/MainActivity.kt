package edu.rit.cmp5987.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter()

        //use strting array
        adapter!!.titles = resources.getStringArray(R.array.titlesArray).toMutableList()
        adapter!!.details = resources.getStringArray(R.array.detailsArray).toMutableList()
        adapter!!.images = mutableListOf(R.drawable.android_image_1, R.drawable.android_image_2,
            R.drawable.android_image_1, R.drawable.android_image_3,R.drawable.android_image_4,
            R.drawable.android_image_5, R.drawable.android_image_6, R.drawable.android_image_7, R.drawable.android_image_8)
        recyclerView.adapter = adapter

    }//onCreate
}//Activity