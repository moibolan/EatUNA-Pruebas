package com.example.eatuna.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.eatuna.R
import com.example.eatuna.ThirdFragment
import com.example.eatuna.model.SedeModel


class SedeAdapter(val sedeModelList:ArrayList<SedeModel>):RecyclerView.Adapter<SedeAdapter.sedeHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): sedeHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return sedeHolder(layoutInflater.inflate(R.layout.sedes_item, parent, false))
    }

    override fun getItemCount(): Int {
        return sedeModelList.size
    }

    override fun onBindViewHolder(holder: sedeHolder, position: Int) {
    //sedeHolder holder

        val currentItem = sedeModelList[position]
        holder.imageView.setImageResource(currentItem.image)
        holder.textViewTitle.text = currentItem.title
        holder.textViewDetails.text = currentItem.details



//Codigo comentado de error
//        holder.itemView.setOnClickListener{ view ->
//            view.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
//        }



//Intento #2 codigo da error
//        holder.itemView.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//               val bundle = bundleOf(SEDE_ID to sedeModelList[position].id.toString())
//              holder.itemView.findNavController().navigate(
//                 R.id.action_secondFragment_to_thirdFragment
//              )
//
//
//            }
//        })

    }

//    companion object {
//        const val SEDE_ID = "SedeModel_id"
//    }


    class sedeHolder(val itemView: View): RecyclerView.ViewHolder(itemView){


        val imageView : ImageView = itemView.findViewById(R.id.item_image)
        val textViewTitle: TextView = itemView.findViewById(R.id.item_title)
        val textViewDetails: TextView = itemView.findViewById(R.id.item_details)


    }





}