package com.intelivita.customalertviewlib

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.intelivita.fancyalertboxlib.R


class FancyAlertBox (ctx: Context){

    var context:Context
    init {
        this.context = ctx
    }

    fun showAlert(viewGroup: ViewGroup, title:String, message:String) {
        val dialogView: View =
                LayoutInflater.from(context).inflate(R.layout.my_dialog, viewGroup, false)
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder.setView(dialogView)

        val alertDialog: AlertDialog = builder.create()

        var txtTitle = dialogView.findViewById<TextView>(R.id.txtTitle)
        txtTitle.text = title
        var txtMsg = dialogView.findViewById<TextView>(R.id.txtMessage)
        txtMsg.text = message

        var btnOk = dialogView.findViewById<Button>(R.id.buttonOk)
        btnOk.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                alertDialog.dismiss()
            }
        })
        alertDialog.show()
    }
}
