package com.aman.playmusix;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.aman.playmusix.MainActivity.albumFiles;
import static com.aman.playmusix.MusicAdapter.mFiles;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlbumFragment extends Fragment {

    private RecyclerView recyclerView;
    private AlbumAdapter albumAdapter;
    public AlbumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_album, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        if (albumFiles != null && !(albumFiles.size() < 1))
        {
            albumAdapter = new AlbumAdapter(getContext(), albumFiles);
            recyclerView.setAdapter(albumAdapter);
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        }
        return view;
    }
}
