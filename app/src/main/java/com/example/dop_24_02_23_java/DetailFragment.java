package com.example.dop_24_02_23_java;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dop_24_02_23_java.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {
    FragmentDetailBinding binding;

    FlatModel flatModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getExtraFragment();
    }

    private void getExtraFragment() {
        if (getArguments() != null) {
            flatModel = (FlatModel) getArguments().getSerializable("flat");
            binding.tvName.setText(flatModel.getName());
            binding.tvDesc.setText(flatModel.getDesc());
            binding.imgFlat.setImageResource(flatModel.getImage());

        }
    }
}