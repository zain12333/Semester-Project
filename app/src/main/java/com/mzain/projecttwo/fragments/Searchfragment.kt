package com.mzain.projecttwo.fragments

import android.os.Bundle
import android.view.*
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.mzain.projecttwo.R
import com.mzain.projecttwo.databinding.FragmentSearchfragmentBinding

class SearchFragment : Fragment() {
    private var _binding: FragmentSearchfragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchfragmentBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            resources.getStringArray(R.array.cricket_bat_brands_array)
        )

        binding.lvListview.adapter = adapter
        binding.lvListview.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(requireContext(), parent?.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
        }

        binding.lvListview.emptyView = binding.tvEmptyTextview
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.nav_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

//    val search:MenuItem?  =menu?.findItem(R.id.nav_search)
//            val searchView: searchview =search?.actionView as searchview
//    searchview.queryHint ="search somenthing"
//    searchview.setOnqueryTextListener(object:searchview.On)

    fun onQueryTextChange(newText:String?):Boolean {
        adapter.filter.filter(newText)
        return true
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
