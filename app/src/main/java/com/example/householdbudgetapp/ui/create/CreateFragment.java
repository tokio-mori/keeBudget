package com.example.householdbudgetapp.ui.create;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.householdbudgetapp.R;
import com.example.householdbudgetapp.databinding.FragmentCreateBinding;

public class CreateFragment extends Fragment {

    private EditText moeny;
    private EditText newCategory;
    private Spinner spinner;
    private Button button;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_create, container, false);

        moeny = view.findViewById(R.id.create_money);
        newCategory = view.findViewById(R.id.create_new_category);
        spinner = view.findViewById(R.id.create_category);
        button = view.findViewById(R.id.create_button);


        setupSpinner();

        return view;
//        return inflater.inflate(R.layout.fragment_create, container, false);
    }

    private void setupSpinner() {

        String[] categories = {"test_1", "test_2"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_spinner_item, categories);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }

    private void submitButton() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedCategory = spinner.getSelectedItem().toString();

                String amount = moeny.getText().toString();
            }
        });
    }



}