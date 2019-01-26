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

public class News extends Fragment {
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


        list.add(new Item("TOI",R.drawable.toi,"https://timesofindia.indiatimes.com/"));
        list.add(new Item("India Today",R.drawable.indiatoday,"https://www.indiatoday.in/"));
        list.add(new Item("NDTV",R.drawable.ndtv,"https://www.ndtv.com/"));
        list.add(new Item("The Hindu",R.drawable.thehindu,"https://www.thehindu.com/"));
        list.add(new Item("Hindustan Times",R.drawable.ht,"https://www.hindustantimes.com/"));
        list.add(new Item("Daily Hunt",R.drawable.dailyhunt,"https://www.dailyhunt.in/"));
        list.add(new Item("Indian Express",R.drawable.indianexpress,"https://indianexpress.com/"));
        list.add(new Item("Money Control",R.drawable.moneycontrol,"https://www.moneycontrol.com/"));
        list.add(new Item("Economic Times",R.drawable.economictimes,"https://economictimes.indiatimes.com/"));
        list.add(new Item("Times Now",R.drawable.timesnow,"https://www.timesnownews.com/"));
        list.add(new Item("Dainik Jaagran",R.drawable.dainikjagran,"https://www.jagran.com/"));
        list.add(new Item("Dainik Bhaskar",R.drawable.dainikbhaskar,"https://www.bhaskar.com/"));
        list.add(new Item("Hindustan",R.drawable.hindustan,"https://www.livehindustan.com/"));
        list.add(new Item("Amar Ujala",R.drawable.amarujala,"https://www.amarujala.com/"));
        list.add(new Item("Jan Satta",R.drawable.jansatta,"https://www.jansatta.com/"));


        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(News.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(News.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
