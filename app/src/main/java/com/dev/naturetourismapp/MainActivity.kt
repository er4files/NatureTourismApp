package com.dev.naturetourismapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvNatures: RecyclerView
    private val list = ArrayList<Nature>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNatures = findViewById(R.id.rv_natures)
        rvNatures.setHasFixedSize(true)

        list.addAll(getListNatures())
        showRecyclerList()
    }
    private fun getListNatures(): ArrayList<Nature> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listNature = ArrayList<Nature>()
        for (i in dataName.indices) {
            val nature = Nature(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
            listNature.add(nature)
        }
        return listNature
    }

    private fun showRecyclerList() {
        rvNatures.layoutManager = LinearLayoutManager(this)
        val listNatureAdapter = ListNatureAdapter(list)
        rvNatures.adapter = listNatureAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_list -> {
                rvNatures.layoutManager = LinearLayoutManager(this)
            }
            R.id.action_grid -> {
                rvNatures.layoutManager = GridLayoutManager(this, 2)
            }
            R.id.about_page -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }


}