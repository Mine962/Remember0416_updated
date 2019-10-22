package com.dgsw.remember.InfoClass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.dgsw.remember.R;

public class infoFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section-icon";
    private static final String ARG_SECTION_COLOR = "section-color";

    public static infoFragment newInstance(int icon) {
        infoFragment fragment = new infoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, icon);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_information, container, false);
        ImageView image = (ImageView) rootView.findViewById(R.id.iv_icon);
        image.setImageResource(getArguments().getInt(ARG_SECTION_NUMBER));
        return rootView;
    }

}