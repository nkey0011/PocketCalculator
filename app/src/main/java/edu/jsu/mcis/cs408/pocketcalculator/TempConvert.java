package edu.jsu.mcis.cs408.pocketcalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import edu.jsu.mcis.cs408.pocketcalculator.databinding.TempConvertBinding;

public class TempConvert extends Fragment {

   private TempConvertBinding binding;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = TempConvertBinding.inflate(getLayoutInflater(), container, false);
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
            public void onClick(View v){

                    String f = binding.inputF.getText().toString();
                    String c = binding.inputC.getText().toString();

                    if (f.equals("")) {
                        if (!c.equals("")) {

                            double celsius = Double.parseDouble(c);
                            double fahrenheit = Double.parseDouble(f);

                            binding.inputF.setText(Double.toString(fahrenheit)) ;
                        }
                    }
                    else {
                        double fahrenheit = Double.parseDouble(f);
                        double celsius = ((fahrenheit - 32) * (5.0 / 9.0));

                        binding.inputC.setText(Double.toString(celsius));

                }
            }

        });
    }
}