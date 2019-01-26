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

public class Recharge extends Fragment {
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

        list.add(new Item("Jio",R.drawable.jio,"https://www.jio.com/JioWebApp/index.html?root=primeRecharge"));
        list.add(new Item("Airtel",R.drawable.airtel,"https://www.airtel.in/prepaid-recharge"));
        list.add(new Item("MobiKwik",R.drawable.mobikwik,"https://www.mobikwik.com/Mobile-Recharge"));
        list.add(new Item("Paytm",R.drawable.paytm,"https://paytm.com/recharge"));
        list.add(new Item("Freecharge",R.drawable.freecharge,"https://www.freecharge.in/Recharge/Mobile"));
        list.add(new Item("Reliance Digital",R.drawable.reliance,"https://www.reliancedigitaltv.com/home.html"));
        list.add(new Item("Vodafone",R.drawable.vodafone,"https://shop.vodafone.in/shop/prepaid/easy-online-recharge.jsp"));
        list.add(new Item("Idea",R.drawable.idea,"https://care.ideacellular.com/wps/portal/account/online-recharge"));
        list.add(new Item("Telenor",R.drawable.telenor,"https://www.freecharge.in/telenor-mobile-recharge_html"));
        list.add(new Item("Docomo",R.drawable.docomo,"https://recharge.tatadocomo.com/ORPortal/thirdPartyHome"));

        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(Recharge.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(Recharge.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
