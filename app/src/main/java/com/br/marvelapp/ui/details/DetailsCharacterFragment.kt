package com.br.marvelapp.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.br.marvelapp.ui.base.BaseFragment
import com.example.marvelapp.databinding.FragmentDetailsCharacterBinding

class DetailsCharacterFragment : BaseFragment<FragmentDetailsCharacterBinding, DetailsCharacterViewModel>() {

    override val viewModel: DetailsCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailsCharacterBinding = FragmentDetailsCharacterBinding.inflate(inflater, container, false)
}
