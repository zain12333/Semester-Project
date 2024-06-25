package com.mzain.projecttwo.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mzain.projecttwo.Emptycart
import com.mzain.projecttwo.PaymentHostActivity
import com.mzain.projecttwo.PaymentMethod
import com.mzain.projecttwo.SearchBat
import com.mzain.projecttwo.databinding.FragmentHomefragmentBinding
import com.mzain.projecttwo.recommendedOption

class homefragment : Fragment() {
    private var _binding: FragmentHomefragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomefragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Access the ImageView through the binding object
        val imageView = binding.ivBat

        binding.recommendedOptions.setOnClickListener {
            // Start RecommendedOptionActivity
            val intent = Intent(requireContext(), recommendedOption::class.java)
            startActivity(intent)
        }

        binding.topRatedProducts.setOnClickListener {
            // Start TopRatedProducts
            val intent = Intent(requireContext(), recommendedOption::class.java)
            startActivity(intent)
        }

        binding.dealAroundYou.setOnClickListener {
            // Start TopRatedProducts
            val intent = Intent(requireContext(), recommendedOption::class.java)
            startActivity(intent)
        }

        binding.searchbar.setOnClickListener {
            // Start TopRatedProducts
            val intent = Intent(requireContext(), SearchBat::class.java)
            startActivity(intent)
        }

        binding.cart.setOnClickListener {
            // Start TopRatedProducts
            val intent = Intent(requireContext(), Emptycart::class.java)
            startActivity(intent)
        }

        // moving to pay for order screen
        binding.batting.setOnClickListener {
            startActivity(Intent(requireContext(), PaymentMethod::class.java))
        }

        binding.btnshop.setOnClickListener {
            startActivity(Intent(requireContext(), PaymentMethod::class.java))
        }
        binding.cardView1st.setOnClickListener {
            startActivity(Intent(requireContext(), PaymentMethod::class.java))
        }

        // Set onClickListener for btn_shop

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
