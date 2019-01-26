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

public class Medicare extends Fragment {
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

        list.add(new Item("MedLife",R.drawable.medlife,"https://www.medlife.com/"));
        list.add(new Item("NetMeds",R.drawable.netmeds,"https://www.netmeds.com/"));
        list.add(new Item("OneMg",R.drawable.onemg,"https://www.onemg.com/"));
        list.add(new Item("Med Plus Mart",R.drawable.medplusmart,"https://www.medplusmart.com/"));
        list.add(new Item("M Chemist",R.drawable.mchemist,"https://www.mchemist.com/"));
        list.add(new Item("PinkBlue.in",R.drawable.pinkblue,"https://www.pinkblue.in/"));
        list.add(new Item("Health Kart",R.drawable.healthkart,"https://www.healthkart.com/"));
        list.add(new Item("Zotezo",R.drawable.zotezo,"https://www.zotezo.com/"));
        list.add(new Item("Health Genie",R.drawable.healthgenie,"https://www.healthgenie.in/"));
        list.add(new Item("BookMeds",R.drawable.bookmeds,"https://www.bookmeds.com/"));
        list.add(new Item("Himalaya",R.drawable.himalaya,"http://www.himalayawellness.com"));
        list.add(new Item("Practo",R.drawable.practo,"https://www.practo.com/"));
        list.add(new Item("Healthians",R.drawable.healthians,"https://www.healthians.com/"));

        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(Medicare.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(Medicare.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
