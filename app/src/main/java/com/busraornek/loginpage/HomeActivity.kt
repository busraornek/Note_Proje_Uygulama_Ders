package com.busraornek.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.option_1 -> {
                // Respond to context menu item 1 click.
                true
            }
            R.id.option_2 -> {
                // Respond to context menu item 2 click.
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }

}