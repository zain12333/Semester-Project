package com.mzain.projecttwo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mzain.projecttwo.R
import com.mzain.projecttwo.databinding.FragmentProfilefragmentBinding

class Profilefragment : Fragment() {
    private var _binding: FragmentProfilefragmentBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_profilefragment, container, false)



        }


        }


