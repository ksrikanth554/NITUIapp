package com.sritech.www.nituiapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Lamda Style
        b1.setOnClickListener{
            txt1.setText(edt1.getText())
        }

        //Anonymouse InnerClass Style
       /* b1.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
             txt1.setText(edt1.getText())
                edt1.setText("")
            }
        })*/
       // b1.setOnClickListener(this)

    }
  /*  fun getText(v:View)//java style code
    {
      var e=findViewById<EditText>(R.id.edt1)
        var s=e.getText()
       var t=findViewById<TextView>(R.id.txt1)
        t.setText(s)
    }*/

    fun getText(v:View)
    {
        txt1.setText(edt1.getText())
        edt1.setText("")

    }

   /* override fun onClick(v: View?) {
        txt1.setText(edt1.getText())
        edt1.setText("")

    }*/


}
