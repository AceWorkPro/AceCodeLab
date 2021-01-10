package com.ace.lab.navigation;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ace.lab.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link APageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class APageFragment extends Fragment {
    private static final String TAG = "Test-A-Page";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public APageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment APageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static APageFragment newInstance(String param1, String param2) {
        APageFragment fragment = new APageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");

        View view = inflater.inflate(R.layout.fragment_a_page, container, false);

        Button button = view.findViewById(R.id.btn_skip);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_AFragment_to_BFragment);
            }
        });

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach");

    }
}