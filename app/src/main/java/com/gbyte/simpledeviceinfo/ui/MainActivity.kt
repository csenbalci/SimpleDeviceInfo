package com.gbyte.simpledeviceinfo.ui

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.gbyte.simpledeviceinfo.R
import com.gbyte.simpledeviceinfo.core.CoreDeviceInfo
import com.google.android.material.appbar.SubtitleCollapsingToolbarLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(findViewById(R.id.toolbar))
        setCollapsingToolbar(findViewById(R.id.toolbar_layout))

        findViewById<BottomNavigationView>(R.id.bottomNavigationView).menu.getItem(2).isEnabled = false

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).setAnchorView(view).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun setCollapsingToolbar(collapsingToolbar: SubtitleCollapsingToolbarLayout) {
        collapsingToolbar.title = CoreDeviceInfo.getManufacturer() + " " + CoreDeviceInfo.getDevice()
        collapsingToolbar.subtitle = CoreDeviceInfo.getModel()
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.CollapsingToolbarTitleExpanded)
        collapsingToolbar.setExpandedSubtitleTextAppearance(R.style.CollapsingToolbarSubtitleExpanded)
        collapsingToolbar.setCollapsedTitleTextAppearance(R.style.CollapsingToolbarTitleCollapsed)
        collapsingToolbar.setCollapsedSubtitleTextAppearance(R.style.CollapsingToolbarSubtitleCollapsed)
    }
}