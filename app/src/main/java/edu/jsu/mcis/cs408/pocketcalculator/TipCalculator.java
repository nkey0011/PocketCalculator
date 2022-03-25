package edu.jsu.mcis.cs408.pocketcalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import java.text.NumberFormat;

import edu.jsu.mcis.cs408.pocketcalculator.databinding.TipCalculatorBinding;

public class TipCalculator extends Fragment {

    private TipCalculatorBinding binding;

    EditText bill, tip, people;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = TipCalculatorBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // takes user's total bill input and converts to tangible number
                bill = binding.billInput;
                String user_bill = bill.getText().toString();
                float amt_bill = Float.parseFloat(user_bill);

                // takes user's tip input as whole number
                tip = binding.tipInput;
                String user_tip = tip.getText().toString();
                float amt_tip = Float.parseFloat(user_tip);

                // takes user's people input
                people = binding.peopleInput;
                String user_people = people.getText().toString();
                int amt_people = Integer.parseInt(user_people);

                // converts tip input into a decimal amount
                float tip_value = amt_tip / 100;

                /* adds tip to the final bill and divides by amount of people
                to get the price for each person*/
                double final_bill = (amt_bill + tip_value)/amt_people;

                NumberFormat money_format = NumberFormat.getCurrencyInstance();
                String output = money_format.format(final_bill);

                binding.result.setText("Price Per Person: " + output);
}
        });
    }
}
