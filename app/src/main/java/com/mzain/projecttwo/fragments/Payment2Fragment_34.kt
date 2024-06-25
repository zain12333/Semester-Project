package com.mzain.projecttwo.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mzain.projecttwo.R
import com.mzain.projecttwo.Zain49
import com.mzain.projecttwo.databinding.FragmentPayment234Binding

class Payment2Fragment_34 : Fragment() {

    private var _binding: FragmentPayment234Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPayment234Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnPayOrderPayment = binding.btnPayOrderPrice

        var orderCount = 1

        btnPayOrderPayment.setOnClickListener {
            startActivity(Intent(requireContext(), Zain49::class.java))
        }

        // logic to increment / decrement order count
        val inc = binding.ivIncrement
        val dec = binding.ivDecrement
        val orders = binding.tvOrderCount

        inc.setOnClickListener {
            orders.text = (++orderCount).toString()
        }

        dec.setOnClickListener {
            if (orderCount > 0) {
                orders.text = (--orderCount).toString()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
