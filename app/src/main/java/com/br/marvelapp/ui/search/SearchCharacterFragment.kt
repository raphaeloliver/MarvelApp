package com.br.marvelapp.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.br.marvelapp.ui.base.BaseFragment
import com.example.marvelapp.databinding.FragmentListCharacterBinding

class SearchCharacterFragment :
    BaseFragment<FragmentListCharacterBinding, SearchCharacterViewModel>() {

    override val viewModel: SearchCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListCharacterBinding =
        FragmentListCharacterBinding.inflate(inflater, container, false)
}
