package com.facturafacil.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.facturafacil.app.databinding.ActivityMainBinding
import com.facturafacil.app.ui.ActionsFragment
import com.facturafacil.app.ui.MenuFragment
import com.facturafacil.app.ui.PhotosFragment
import com.facturafacil.app.ui.ProfileFragment
import com.facturafacil.app.ui.VideoFragment
import com.facturafacil.app.ui.WebFragment

class MainActivity : AppCompatActivity(), MenuFragment.OnMenuItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.menuContainer, MenuFragment())
                .replace(R.id.contentContainer, ProfileFragment())
                .commit()
        }
    }

    override fun onMenuItemSelected(menuId: String) {
        val fragment = when (menuId) {
            MenuFragment.ID_PROFILE -> ProfileFragment()
            MenuFragment.ID_PHOTOS -> PhotosFragment()
            MenuFragment.ID_VIDEO -> VideoFragment()
            MenuFragment.ID_WEB -> WebFragment()
            MenuFragment.ID_ACTIONS -> ActionsFragment()
            else -> ProfileFragment()
        }

        showContent(fragment)
    }

    private fun showContent(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.contentContainer, fragment)
            .commit()
    }
}
