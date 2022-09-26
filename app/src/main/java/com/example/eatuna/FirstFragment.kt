package com.example.eatuna

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val nextBtn : Button = view.findViewById(R.id.next)

        nextBtn.setOnClickListener{


//            val fragment = SecondFragment()
//            val transaction = fragmentManager?.beginTransaction()
//            transaction?.replace(R.id.nav_container, fragment)?.commit()

            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
          //  val transaction = fragmentManager?.beginTransaction()
           // transaction?.replace(R.id.my_nav, R.id.action_firstFragment_to_secondFragment).commit()


        }

//        holder.itemView.setOnClickListener() {
//            val bundle = bundleOf(TASK_ID to taskList[position].id.toString())
//
//            holder.itemView.findNavController().navigate(
//                R.id.action_taskListScreen_to_taskScreen, bundle
//            )
//        }

        return view
    }


}