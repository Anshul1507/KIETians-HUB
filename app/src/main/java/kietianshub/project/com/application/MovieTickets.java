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

public class MovieTickets extends Fragment {
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

        list.add(new Item("Book My Show",R.drawable.bookmyshow,"https://in.bookmyshow.com/"));
        list.add(new Item("INOX",R.drawable.inox,"https://www.inoxmovies.com/"));
        list.add(new Item("PVR Cinemas",R.drawable.pvrcinemas,"https://www.pvrcinemas.com/"));
        list.add(new Item("TicketNew",R.drawable.ticketnew,"https://www.ticketnew.com/"));
        list.add(new Item("Paytm Movies",R.drawable.paytmmovies,"https://paytm.com/movies"));
        list.add(new Item("Miraj Cinemas",R.drawable.mirajcinemas,"https://www.mirajcinemas.com/"));
        list.add(new Item("Just Tickets",R.drawable.justticket,"https://www.justickets.in/"));

        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(MovieTickets.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(MovieTickets.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
