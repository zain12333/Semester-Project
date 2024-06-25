package com.mzain.projecttwo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.mzain.projecttwo.MoveFragments
import com.mzain.projecttwo.R

class BtmSheetPaymentMethodFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_btm_sheet_payment_method, container, false)
    }

    fun <FragmentManager> show(supportFragmentManager: FragmentManager, tag: String?) {

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnChangePaymentMethod = view.findViewById<Button>(R.id.btnChangePaymentMethod)

        btnChangePaymentMethod.setOnClickListener {
            MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager,ChangePaymentMethodFragment_38())
            dismiss()
        }
    }

    private fun dismiss() {
        TODO("Not yet implemented")
    }

}