package com.example.eatuna

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eatuna.adapters.SedeAdapter
import com.example.eatuna.model.SedeModel


class SecondFragment : Fragment(){

    lateinit var adapter: SedeAdapter
    lateinit var recyclerView: RecyclerView

    lateinit var sedeModelList : ArrayList<SedeModel>

    lateinit var idSede: Array<Long>
    lateinit var imageId: Array<Int>
    lateinit var title: Array<String>
    lateinit var detail: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       return inflater.inflate(R.layout.fragment_second, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = SedeAdapter(sedeModelList)
        recyclerView.adapter = adapter

    }



    private fun dataInitialize() {


    sedeModelList = arrayListOf<SedeModel>()

        idSede = arrayOf(
            1,2,3,4,5,6,7,8
        )


        imageId = arrayOf(
            R.drawable.flor,
            R.drawable.computadora,
            R.drawable.coco,
            R.drawable.mango,
            R.drawable.mariposa,
            R.drawable.helado,
            R.drawable.cafe,
            R.drawable.palmera
        )

        title = arrayOf(
            getString(R.string.Title1),
            getString(R.string.Title2),
            getString(R.string.Title3),
            getString(R.string.Title4),
            getString(R.string.Title5),
            getString(R.string.Title6),
            getString(R.string.Title7),
            getString(R.string.Title8)
        )

        detail = arrayOf(
            getString(R.string.Details1),
            getString(R.string.Details2),
            getString(R.string.Details3),
            getString(R.string.Details4),
            getString(R.string.Details5),
            getString(R.string.Details6),
            getString(R.string.Details7),
            getString(R.string.Details8)
        )

        for(i in imageId.indices){

            val sedeModel = SedeModel(idSede[i],imageId[i], title[i], detail[i])
            sedeModelList.add(sedeModel)

        }


    }




}