package com.cis.kotlinactionbarbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.item1 -> {
                tv.text = "1번 메뉴"
            }
            R.id.item2 -> {
                tv.text = "2번 메뉴"
            }
            R.id.item3 -> {
                tv.text = "3번 메뉴"
            }
            R.id.item4 -> {
                tv.text = "4번 메뉴"
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
