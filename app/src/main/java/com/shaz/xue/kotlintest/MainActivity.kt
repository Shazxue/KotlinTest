package com.shaz.xue.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_kotlin.text ="Kotlin赋值成功"

        btn_kotlin.text = "点击测试"
        btn_kotlin.setOnClickListener{
            toast("测试成功")
        }
    }
}
