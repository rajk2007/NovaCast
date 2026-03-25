package com.rajk2007.novacast.ui.setup

import android.view.View
import android.widget.AbsListView
import android.widget.ArrayAdapter
import androidx.core.content.edit
import androidx.core.util.forEach
import androidx.navigation.fragment.findNavController
import androidx.preference.PreferenceManager
import com.rajk2007.novacast.R
import com.rajk2007.novacast.TvType
import com.rajk2007.novacast.databinding.FragmentSetupMediaBinding
import com.rajk2007.novacast.mvvm.safe
import com.rajk2007.novacast.ui.BaseFragment
import com.rajk2007.novacast.utils.DataStoreHelper
import com.rajk2007.novacast.utils.UIHelper.fixSystemBarsPadding

class SetupFragmentMedia : BaseFragment<FragmentSetupMediaBinding>(
    BaseFragment.BindingCreator.Inflate(FragmentSetupMediaBinding::inflate)
) {

    override fun fixLayout(view: View) {
        fixSystemBarsPadding(view)
    }

    override fun onBindingCreated(binding: FragmentSetupMediaBinding) {
        safe {
            val ctx = context ?: return@safe
            val settingsManager = PreferenceManager.getDefaultSharedPreferences(ctx)

            val arrayAdapter =
                ArrayAdapter<String>(ctx, R.layout.sort_bottom_single_choice)

            val names = enumValues<TvType>().sorted().map { it.name }
            val selected = mutableListOf<Int>()

            arrayAdapter.addAll(names)
            binding.apply {
                listview1.let {
                    it.adapter = arrayAdapter
                    it.choiceMode = AbsListView.CHOICE_MODE_MULTIPLE

                    it.setOnItemClickListener { _, _, _, _ ->
                        it.checkedItemPositions?.forEach { key, value ->
                            if (value) {
                                selected.add(key)
                            } else {
                                selected.remove(key)
                            }
                        }
                        val prefValues = selected.mapNotNull { pos ->
                            val item =
                                it.getItemAtPosition(pos)?.toString() ?: return@mapNotNull null
                            val itemVal = TvType.valueOf(item)
                            itemVal.ordinal.toString()
                        }.toSet()
                        settingsManager.edit {
                            putStringSet(getString(R.string.prefer_media_type_key), prefValues)
                        }

                        // Regenerate set homepage
                        DataStoreHelper.currentHomePage = null
                    }
                }

                nextBtt.setOnClickListener {
                    findNavController().navigate(R.id.navigation_setup_media_to_navigation_setup_layout)
                }

                prevBtt.setOnClickListener {
                    findNavController().popBackStack()
                }
            }
        }
    }
}
