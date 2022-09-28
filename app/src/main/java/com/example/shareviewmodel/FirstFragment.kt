package com.example.shareviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.shareviewmodel.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var binding : FragmentFirstBinding ? = null
    private val sharedViewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etFirst = view.findViewById<EditText>(R.id.etFirst)
        val btnFirst = view.findViewById<Button>(R.id.btnFirst)

//        sharedViewModel.liveData.observe(viewLifecycleOwner, Observer {
//            etFirst.setText(it)
//        })

        binding?.viewModel = sharedViewModel
        binding?.lifecycleOwner = viewLifecycleOwner


        btnFirst.setOnClickListener {
            // TODO : update the live data on ViewModel
            sharedViewModel.setText(etFirst.text.toString())

            // TODO : navigate to second fragment
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            findNavController().navigate(action)
        }
    }

}