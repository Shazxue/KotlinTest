package com.shaz.xue.kotlintest

import android.content.Context
import android.widget.Toast

/**
 * Created by xue on 2017/9/1.
 */
fun Context.toast(message: String, length :Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,message,length).show()
}