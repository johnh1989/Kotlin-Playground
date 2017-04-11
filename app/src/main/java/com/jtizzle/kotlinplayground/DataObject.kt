package com.jtizzle.kotlinplayground

import android.util.Log

/**
 * Created by johnhinton on 4/11/17.
 */
class DataObject(val name: String, val age: Int) {

    val TAG = "DataObject"

    init{
        Log.i(TAG, "data object created: name=$name age=$age")
    }

    override fun toString(): String {
        return "DataObject(name='$name', age=$age)"
    }


}