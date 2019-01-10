package com.softinit.whatsdirect.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softinit.whatsdirect.R
import com.softinit.whatsdirect.adapters.MainViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var mMainViewPagerAdapter: MainViewPagerAdapter
    private lateinit var mViewPager: androidx.viewpager.widget.ViewPager
    private lateinit var mTabLayout: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()

//        val x = DialogSpinner(this, supportFragmentManager).apply {
//            setAdapter(DialogSpinnerAdapter(this@MainActivity, arrayListOf(
//                object: SpinnerItem {
//                    override fun getImageId() = R.drawable.ic_launcher_foreground
//                    override fun getText() = "ANDROID"
//                }
//            )))
//        }



//        val x = SearchableDialog.newInstance(arrayListOf(
//            object: SpinnerItem {
//                override fun getImageId() = R.drawable.ic_launcher_foreground
//                override fun getText() = "ANDROID"
//            }
//        )).apply fuck@{
//            this@fuck.show(supportFragmentManager, "fragment_new_dialog")
//        }

    }

    fun setup() {
        setupViewPager()
    }

    fun setupViewPager() {
        mMainViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mViewPager = findViewById(R.id.mainViewPager)
        mTabLayout = findViewById(R.id.mainTabLayout)

        mViewPager.adapter = mMainViewPagerAdapter
        mTabLayout.setupWithViewPager(mViewPager)
    }
}
