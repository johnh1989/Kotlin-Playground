package com.jtizzle.kotlinplayground

import android.util.Log

/**
 * Created by johnhinton on 4/11/17.
 */

class TestObject(val x: Int, val y: Int, val z: String) {

    var blah: String? = null

    companion object {
        internal val TAG = TestObject::class.java.simpleName
    }

    fun doWork() {
        Log.i(TAG, "doWork called$blah")
    }
}
