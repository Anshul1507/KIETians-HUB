package kietianshub.project.com.application;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Sports extends Fragment {
    private Toolbar toolbar;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view,container,false);
        toolbar = rootView.findViewById(R.id.toolbar);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final ArrayList<Item> list = new ArrayList<Item>();

        list.add(new Item("CricBuzz",R.drawable.cricbuzz,"https://www.cricbuzz.com/"));
        list.add(new Item("Yahoo Cricket",R.drawable.yahoocricket,"https://cricket.yahoo.net/"));
        list.add(new Item("ESPN",R.drawable.espn,"https://www.espn.in/"));
        list.add(new Item("TOI Sports",R.drawable.toisports,"https://timesofindia.indiatimes.com/sports"));
        list.add(new Item("BBC Sport",R.drawable.bbcsport,"https://www.bbc.com/sport"));

        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(Sports.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(Sports.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
