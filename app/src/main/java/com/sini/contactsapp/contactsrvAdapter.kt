package com.sini.contactsapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sini.contactsapp.databinding.ActivityMainBinding
import com.sini.contactsapp.databinding.ContactlistBinding
import com.squareup.picasso.Picasso
import com.squareup.picasso.Picasso as Picasso1

class ContactrvAdapter(var contactlist:List<Contacts>):RecyclerView.Adapter<ContactViewHolder>(){
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
     var binding=ContactlistBinding.inflate(LayoutInflater.from(parent.context))
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var item=contactlist.get(position)
        holder.binding.imageView.toString()
        holder.binding.tvName.text= item.name
        holder.binding.tvPhoneNumber.text=item.phoneNumber.toString()
        holder.binding.tvEmail.text= item.Email


        Picasso
           .get()
           .load(item.image)
           .into(holder.binding.imageView)


    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}


class  ContactViewHolder(var binding:ContactlistBinding):RecyclerView.ViewHolder(binding.root)


