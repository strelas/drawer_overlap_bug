package com.paltalk.flutter.drawer_overlap_bug

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterFragment

class MainActivity : AppCompatActivity(R.layout.main_activity_lauout) {

	override fun setContentView(layoutResID: Int) {
		super.setContentView(layoutResID)
		supportFragmentManager
			.beginTransaction()
			.replace(R.id.fragment_container, FlutterFragment.createDefault(), "1234")
			.commitAllowingStateLoss()
	}
}
