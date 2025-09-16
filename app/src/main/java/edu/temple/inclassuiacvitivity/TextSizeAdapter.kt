package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text

class TextSizeAdapter(private val c: Context, private val numberArray: Array<Int>) : BaseAdapter() {


    override fun getCount(): Int {
        return numberArray.size
    }

    override fun getItem(position: Int): Any {
        return numberArray[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        return if(convertView != null){
            convertView as TextView
        }else{

            TextView(c)

        }.apply {
            text = numberArray[position].toString()
            textSize = 22f
        }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        return getView(position,convertView,parent).apply{
            textSize = numberArray[position].toFloat()
        }
    }

}