package com.mzain.projecttwo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.mzain.projecttwo.R

class EditOrderBtmSheetFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_order_btm_sheet, container, false)
    }

    fun <FragmentManager> show(supportFragmentManager: FragmentManager, tag: String?) {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnOrder = view.findViewById<Button>(R.id.btnCheckOrderBSV)
        val btnCheckOrderAgain = view.findViewById<Button>(R.id.btnOrderCheckAgainBSV)

        // closes BSV
        btnOrder.setOnClickListener {
            dismiss()
        }

        // implement logic to check order again
        btnCheckOrderAgain.setOnClickListener {

        }


    }

    private fun dismiss() {
        TODO("Not yet implemented")
    }
}