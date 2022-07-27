package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fragment.databinding.FragmentAboutBinding
import com.example.fragment.databinding.FragmentHomeBinding

class AboutFragment : Fragment() {

    private lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)

        binding.btnHome.setOnClickListener(){
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_aboutFragment_to_homeFragment)
        }

        binding.btnBack.setOnClickListener(){
            Navigation.findNavController(binding.root).popBackStack()
        }

        return binding.root
    }


}