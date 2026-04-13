package com.lagradost.cloudstream3.ui.setup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lagradost.cloudstream3.R
import com.lagradost.cloudstream3.databinding.FragmentSetupLanguageBinding
import com.lagradost.cloudstream3.utils.LocaleHelper

class SetupFragmentLanguage : SetupFragment() {

    private var selectedLanguage: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_setup_language, container, false)
    }

    final override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentSetupLanguageBinding.bind(view)

        // Auto-skip language screen
        findNavController().navigate(R.id.action_navigation_setup_language_to_navigation_setup_extensions)

        val languages = listOf("en", "es", "fr", "de")

        val adapter = LanguageAdapter(requireContext(), languages) {
            selectedLanguage = it
        }

        binding.languageList.adapter = adapter

        binding.confirmButton.setOnClickListener {
            selectedLanguage?.let { lang ->
                LocaleHelper.setLocale(requireContext(), lang)
                findNavController().navigate(
                    R.id.action_navigation_setup_language_to_navigation_setup_extensions
                )
            }
        }
    }
}
