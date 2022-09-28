package com.example.shareviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.shareviewmodel.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var binding : FragmentSecondBinding? =null
    private val sharedViewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



//        sharedViewModel.liveData.observe(viewLifecycleOwner) {
//            etSecond.setText(it)
//        }

        binding?.viewModel = sharedViewModel
        binding?.lifecycleOwner = viewLifecycleOwner

        binding?.btnSecond?.setOnClickListener {
            // TODO : update live data
            sharedViewModel.setText(binding?.etSecond?.text.toString())


            val  action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            findNavController().navigate(action)
        }
    }

}