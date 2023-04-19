package com.example.fastingguide

import CustomDialogClass
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ratingTV : TextView = findViewById(R.id.test)
        ratingTV.setOnClickListener{
            var dialogv= CustomDialogClass()
            dialogv.show(supportFragmentManager, "Custom Dialog")
        }



    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun receiveFeedback(feedback: String) {
        val ratingTV : TextView = findViewById(R.id.test)
        ratingTV.text = feedback;
    }
}


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
    when(item.itemId)
    {
        R.id.item1-> Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
        R.id.item2-> Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show()
    }
    return true;
}



