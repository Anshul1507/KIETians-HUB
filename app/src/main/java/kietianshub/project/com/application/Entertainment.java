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
import android.widget.EditText;

import java.util.ArrayList;

public class Entertainment extends Fragment {
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

        list.add(new Item("Youtube",R.drawable.youtube,"https://www.youtube.com"));
        list.add(new Item("Voot",R.drawable.voot,"https://www.voot.com/"));
        list.add(new Item("Vimeo",R.drawable.vimeo,"https://www.vimeo.com/"));
        list.add(new Item("Gaana",R.drawable.gaana,"https://www.gaana.com/"));

        list.add(new Item("Hungama",R.drawable.hungama,"https://www.hungama.com/"));
        list.add(new Item("Raaga",R.drawable.raaga,"https://www.raaga.com/"));
        list.add(new Item("Saavn",R.drawable.saavn,"https://www.saavn.com/"));
        list.add(new Item("Smule",R.drawable.smule,"https://www.smule.com/"));

        list.add(new Item("Sound Cloud",R.drawable.soundcloud,"https://www.soundcloud.com/"));
        list.add(new Item("ScoopWhoop",R.drawable.scoopwhoop,"https://www.scoopwhoop.com/"));
        list.add(new Item("Amazon Prime",R.drawable.amazonprime,"https://www.primevideo.com/"));

        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(Entertainment.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(Entertainment.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
