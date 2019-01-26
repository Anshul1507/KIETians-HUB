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

public class OnlineStoreFragment extends Fragment {
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


        list.add(new Item("Amazon",R.drawable.amazon,"https://www.amazon.in/"));
        list.add(new Item("Flipkart",R.drawable.flipkart,"https://www.flipkart.com/"));
        list.add(new Item("ShopClues",R.drawable.shopclues,"https://www.shopclues.com/"));
        list.add(new Item("Myntra",R.drawable.myntra,"https://www.myntra.com/"));
        list.add(new Item("Paytm Mall",R.drawable.paytmmall,"https://paytmmall.com/"));
        list.add(new Item("Ali Express",R.drawable.aliexpress,"https://www.aliexpress.com/"));
        list.add(new Item("Club Factory",R.drawable.clubfactory,"https://www.clubfactory.com/"));
        list.add(new Item("Home Shop 18",R.drawable.homeshop18,"https://www.homeshop18.com/"));
        list.add(new Item("Snapdeal",R.drawable.snapdeal,"https://www.snapdeal.com/"));
        list.add(new Item("Jabong",R.drawable.jabong,"https://www.jabong.com/"));
        list.add(new Item("Yep Me",R.drawable.yepme,"https://www.yepme.com/"));
        list.add(new Item("Vishal Mart",R.drawable.vmart,"https://www.vmart.co.in/"));
        list.add(new Item("Bewakoof",R.drawable.bewakoof,"https://www.bewakoof.com/"));
        list.add(new Item("Mr Voonik",R.drawable.mrvoonik,"https://www.voonik.com/"));
        list.add(new Item("LifeStyle",R.drawable.lifestyle,"https://www.lifestyle.com/"));
        list.add(new Item("Ebay",R.drawable.ebay,"https://www.ebay.com/"));
        list.add(new Item("Naaptol",R.drawable.naaptol,"https://www.naaptool.com/"));
        list.add(new Item("Big Basket",R.drawable.bigbasket,"https://www.bigbasket.com/"));
        list.add(new Item("Cool Winks",R.drawable.coolwinks,"https://www.coolwinks.com/"));
        list.add(new Item("Ajio",R.drawable.ajio,"https://www.ajio.com/"));
        list.add(new Item("Lenskart",R.drawable.lenskart,"https://www.lenskart.com/"));

        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(OnlineStoreFragment.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(OnlineStoreFragment.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
