package com.br.marvelapp.ui.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.br.marvelapp.ui.base.BaseFragment
import com.example.marvelapp.databinding.FragmentListCharacterBinding

class FavoriteCharacterFragment : BaseFragment<FragmentListCharacterBinding, FavoriteCharacterViewModel>() {

    override val viewModel: FavoriteCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListCharacterBinding = FragmentListCharacterBinding.inflate(inflater, container, false)
}
