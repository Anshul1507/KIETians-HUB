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

public class FreeLancing extends Fragment {
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

        list.add(new Item("Naukri",R.drawable.naukri,"https://www.naukri.com/"));
        list.add(new Item("Career Builder",R.drawable.careerbuilder,"https://www.careerbuilder.co.in/"));
        list.add(new Item("Indeed",R.drawable.indeed,"https://www.indeed.co.in/"));
        list.add(new Item("Glass Door",R.drawable.glassdoor,"https://www.glassdoor.com/index.htm"));

        list.add(new Item("Shine",R.drawable.shine,"https://www.shine.com/"));
        list.add(new Item("Career Jet",R.drawable.careerjet,"https://www.careerjet.co.in/"));
        //list.add(new Item("Paytm Mall",R.drawable.paytmmall,"https://www.amazon.in/"));
        //list.add(new Item("Home Shop 18",R.drawable.homeshop18,"https://www.amazon.in/"));

       // list.add(new Item("Myntra",R.drawable.myntra,"https://www.amazon.in/"));
      //  list.add(new Item("ShopClues",R.drawable.shopclues,"https://www.amazon.in/"));

        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(FreeLancing.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(FreeLancing.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
