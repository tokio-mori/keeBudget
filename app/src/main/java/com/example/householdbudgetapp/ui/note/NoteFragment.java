package com.example.householdbudgetapp.ui.note;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.householdbudgetapp.databinding.FragmentNoteBinding;

public class NoteFragment extends Fragment {

    private FragmentNoteBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NoteViewModel noteViewModel =
                new ViewModelProvider(this).get(NoteViewModel.class);

        binding = FragmentNoteBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNote;
        noteViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}