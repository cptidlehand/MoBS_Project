package com.example.mobs_prototype.ui.inventory_detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mobs_prototype.databinding.FragmentInventoryDetailBinding;

public class InventoryDetailFragment extends Fragment {


    private FragmentInventoryDetailBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InventoryDetailViewModel inventoryDetailViewModel =
                new ViewModelProvider(this).get(InventoryDetailViewModel.class);

        binding = FragmentInventoryDetailBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textInventoryDetail;
        inventoryDetailViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}




