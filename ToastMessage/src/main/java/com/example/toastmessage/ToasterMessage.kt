package com.example.toastmessage

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun showToastForLongTime(context: Context,message:String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }

    fun showToastForShortTime(context: Context,message:String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}