package com.example.viewbindingsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbindingsample.databinding.FragmentSampleBinding


class SampleFragment : Fragment() {

    private var _binding: FragmentSampleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSampleBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUserInfo()
    }

    private fun setUserInfo() {
        with(binding) {
            tvUsername.text = "Username : Milan Vadhel"
            tvEmail.text = "Email : milan.vadhel@mindinventroy.com"
        }
    }

    /**
     * Fragments outlive their views.
     * Make sure you clean up any references to the binding class instance in the fragment's onDestroyView() method.
     * */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}