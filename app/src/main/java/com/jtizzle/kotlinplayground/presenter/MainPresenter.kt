package com.jtizzle.kotlinplayground.presenter

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter
import com.jtizzle.kotlinplayground.TestObject
import com.jtizzle.kotlinplayground.view.MainView

/**
 * Created by johnhinton on 4/11/17.
 */
class MainPresenter : MvpBasePresenter<MainView>() {

    fun doWork() {
        val testObject = TestObject(2, 4, "memes")
        testObject.doWork()
        if (isViewAttached) {
            view.getString()
        }
    }
}