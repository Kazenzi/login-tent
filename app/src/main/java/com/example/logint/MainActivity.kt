package com.example.logint

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var username: EditText
    lateinit var userId:EditText
    lateinit var newtenant:Button
    lateinit var login:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username=findViewById(R.id.medtName)
        userId=findViewById(R.id.medtId)
        newtenant=findViewById(R.id.mBtnnew)
        login=findViewById(R.id.mbtnlogin)
        login.setOnClickListener {


        }
    }
    private fun display_message(title:String,message: String) {
        var alertDialog: AlertDialog.Builder = AlertDialog.Builder(this)
        alertDialog.setCancelable(false)
        alertDialog.setTitle(title)
        alertDialog.setMessage(message)
        alertDialog.setPositiveButton("ok", DialogInterface.OnClickListener { dialogInterface, i ->
            dialogInterface.dismiss()
        })
        alertDialog.create().show()

    }
    private fun clear(){
        username=findViewById(R.id.medtName)
        userId=findViewById(R.id.medtId)
        username.setText("")
        userId.setText("")

    }


}