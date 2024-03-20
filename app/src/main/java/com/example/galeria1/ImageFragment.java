package com.example.galeria1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;

public class ImageFragment extends Fragment {

    private static final String ARG_IMAGE_URL = "image_url";

    public ImageFragment() {

    }

    public static ImageFragment newInstance(String imageUrl) {
        ImageFragment fragment = new ImageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_IMAGE_URL, imageUrl);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_image, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = view.findViewById(R.id.imageView);
        String imageUrl = getArguments().getString(ARG_IMAGE_URL);
        Picasso.get().load(imageUrl).into(imageView);
    }
}