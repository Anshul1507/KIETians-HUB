package kietianshub.project.com.application;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CabsAndHotels extends Fragment {
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

        list.add(new Item("Ola",R.drawable.ola,"https://www.olacabs.com/"));
        list.add(new Item("Uber",R.drawable.uber,"https://www.uber.com/en/in"));
        list.add(new Item("Trivago",R.drawable.trivago,"https://www.trivago.in/"));
        list.add(new Item("Makemytrip",R.drawable.makemytrip,"https://www.makemytrip.com"));
        list.add(new Item("OYO",R.drawable.oyo,"https://www.oyorooms.com/"));
        list.add(new Item("Expedia",R.drawable.expedia,"https://www.expedia.co.in/"));
        list.add(new Item("Cleartrip",R.drawable.cleartrip,"https://www.cleartrip.com/"));
        list.add(new Item("Goibibo",R.drawable.goibibo,"https://www.goibibo.com/"));
        list.add(new Item("Travel Guru",R.drawable.travelguru,"https://www.travelguru.com/"));
        list.add(new Item("Agoda",R.drawable.agoda,"https://www.agoda.com/"));
        list.add(new Item("Yatra",R.drawable.yatra,"https://www.yatra.com/"));

        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(CabsAndHotels.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(CabsAndHotels.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
