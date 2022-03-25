package edu.jsu.mcis.cs408.pocketcalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import edu.jsu.mcis.cs408.pocketcalculator.databinding.DistanceConvertBinding;



public class DistanceConvert extends Fragment {

    private DistanceConvertBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DistanceConvertBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.convert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String m = binding.inputM.getText().toString();
                String k = binding.inputK.getText().toString();

                if (m.equals("")) {
                    if (!k.equals("")) {

                        double kilometers = Double.parseDouble(k);
                        double miles = Double.parseDouble(m);

                        binding.inputM.setText(Double.toString(miles));
                    }
                } else {
                    double miles = Double.parseDouble(m);
                    double kilometers = (miles * 1.6);

                    binding.inputK.setText(Double.toString(kilometers));
                }
            }


        });
    }
}