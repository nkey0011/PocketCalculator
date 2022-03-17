package edu.jsu.mcis.cs408.pocketcalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/*
tip calculator code
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
                to get the price for each person
                double final_bill = (amt_bill + tip_value)/amt_people;

                        NumberFormat money_format = NumberFormat.getCurrencyInstance();
                        String output = money_format.format(final_bill);

                        binding.result.setText("Price Per Person: " + output);
                        }
 */

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TipCalc#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TipCalc extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TipCalc() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment tipCalc.
     */
    // TODO: Rename and change types and number of parameters
    public static TipCalc newInstance(String param1, String param2) {
        TipCalc fragment = new TipCalc();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tip_calc, container, false);
    }
}