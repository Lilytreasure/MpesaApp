package com.example.mpesaui.Fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.mpesaui.R
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomsheet.BottomSheetDialog


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHome : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var toolbar: MaterialToolbar
    private  lateinit var  buttonSend:Button
    private  lateinit var  buttonPay:Button
    private  lateinit var  buttonWithdraw:Button
    private  lateinit var  buttonAirtime:Button


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

        //send/receive money button

        buttonSend=view.findViewById(R.id.btnSend)

        buttonSend.setOnClickListener(){

            //bottomSheet send/request
            val dialog=BottomSheetDialog(requireContext())
            val view = layoutInflater.inflate(R.layout. bottomsheet_send, null)
            dialog.setContentView(view)
            dialog.show()


        }

        //pay button
        buttonPay=view.findViewById(R.id.btnPay)
        buttonPay.setOnClickListener(){
            //bottomSheet pay
            val dialog=BottomSheetDialog(requireContext())
            val view = layoutInflater.inflate(R.layout. bottomsheet_pay, null)
            dialog.setContentView(view)
            dialog.show()

        }

        //Withdraw Button
        buttonWithdraw=view.findViewById(R.id.btnWithdraw)
        buttonWithdraw.setOnClickListener(){
            //bottomSheet pay
            val dialog=BottomSheetDialog(requireContext())
            val view = layoutInflater.inflate(R.layout. bottomsheet_withdraw, null)
            dialog.setContentView(view)
            dialog.show()

        }

        //Airtime Button
        buttonAirtime=view.findViewById(R.id.btnAirtime)
        buttonAirtime.setOnClickListener(){
            //bottomSheet pay
            val dialog=BottomSheetDialog(requireContext())
            val view = layoutInflater.inflate(R.layout. bottomsheet_airtime, null)
            dialog.setContentView(view)
            dialog.show()

        }






        return  view;
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.ic1 -> {
               Toast.makeText(requireContext(),"Hello user",Toast.LENGTH_LONG)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}