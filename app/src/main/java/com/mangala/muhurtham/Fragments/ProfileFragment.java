package com.mangala.muhurtham.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mangala.muhurtham.Common.Paperdb;
import com.mangala.muhurtham.Models.ProfileData;
import com.mangala.muhurtham.Models.User;
import com.mangala.muhurtham.R;

import io.paperdb.Paper;


public class ProfileFragment extends Fragment {

    private User user;
    private TextView txtName;
    public ProfileFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Paper.init(getContext());

        user = Paper.book().read(Paperdb.user);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);

        txtName = view.findViewById(R.id.txt_name);

        initData();

        return view;

    }

    private void initData() {
        if(user!=null){
            if (user.getMemberData().getName() != null) {
                txtName.setText(user.getMemberData().getName());
            } else {
                txtName.setText("N/A");
            }
        }else {
            Toast.makeText(getContext(), "null", Toast.LENGTH_SHORT).show();
        }
    }
}