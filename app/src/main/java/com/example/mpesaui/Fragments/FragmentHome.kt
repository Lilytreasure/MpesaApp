package com.example.mpesaui.Fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.mpesaui.R
import com.google.android.material.appbar.MaterialToolbar


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var toolbar: MaterialToolbar




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view  =inflater.inflate(R.layout.fragment_home, container, false)

       toolbar=view.findViewById(R.id.toolbar)
        toolbar.inflateMenu(R.menu.tabheader)

        //The proper way to cast menu items on the toolbar to access items via id

        toolbar.setOnMenuItemClickListener {
            onOptionsItemSelected(it)
        }

        return  view;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.ic1 -> {
               Toast.makeText(context,"Hello user",Toast.LENGTH_LONG)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}