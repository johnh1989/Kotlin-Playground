package com.jtizzle.kotlinplayground

import android.os.Bundle
import android.util.Log
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import com.jtizzle.kotlinplayground.presenter.MainPresenter
import com.jtizzle.kotlinplayground.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : MvpActivity<MainView, MainPresenter>(), MainView {

    override fun createPresenter(): MainPresenter {
        return MainPresenter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.hello.text = "GoodBye World"
        val obj = DataObject("John", 28)
        Log.i(TAG, "created data object" + obj)
        presenter.doWork()
    }

    override fun getString() {
        Log.i(TAG, "just testing... =]")
    }

    val TAG = "MainActivity"

}
