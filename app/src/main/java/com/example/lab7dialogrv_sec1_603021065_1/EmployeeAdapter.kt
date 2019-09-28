package com.example.lab7dialogrv_sec1_603021065_1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.std_item_layout.view.*
import java.security.AccessControlContext

class EmployeeAdapter (val items :List<Employee>, val context: Context):RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.std_item_layout,parent,false)
        return ViewHolder(view_item)
    }

    override fun getItemCount(): Int {
        return items.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvName?.text = "Name: "+items[position].name
        holder.tvGender?.text = "Gender: "+items[position].gender
        holder.tvEmail?.text = "E-mail: "+items[position].email
        holder.tvSalary?.text = "Salary: "+items[position].salary.toString()
    }

}
class ViewHolder (view: View) : RecyclerView.ViewHolder(view){

    val tvName: TextView? = view.tv_name
    val tvGender: TextView? = view.tv_gender
    val tvEmail: TextView? = view.tv_email
    val tvSalary: TextView? = view.tv_salary

}
