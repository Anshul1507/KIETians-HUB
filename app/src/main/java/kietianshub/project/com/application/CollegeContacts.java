package kietianshub.project.com.application;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CollegeContacts extends Fragment {
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
        final ArrayList<Contact> list = new ArrayList<Contact>();

        list.add(new Contact("Anti-Ragging Committee",R.drawable.ic_forward));
        list.add(new Contact("Anti-Ragging Committee(Students)",R.drawable.ic_forward));
        list.add(new Contact("Internal Complaints Committee",R.drawable.ic_forward));
        list.add(new Contact("Institute Proctorial Board",R.drawable.ic_forward));
        list.add(new Contact("Functional Heads",R.drawable.ic_forward));
        list.add(new Contact("Additional HODs",R.drawable.ic_forward));
        list.add(new Contact("Indespensable Functionaries",R.drawable.ic_forward));



        final RecyclerViewContactAdapter adapter = new RecyclerViewContactAdapter(CollegeContacts.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new LinearLayoutManager(CollegeContacts.this.getActivity()));
        rv.setAdapter(adapter);
    }


}
