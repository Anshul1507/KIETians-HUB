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

public class Elearning extends Fragment {
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

        list.add(new Item("Codecademy",R.drawable.codecademy,"https://www.codecademy.com/"));
        list.add(new Item("Lynda",R.drawable.lynda,"https://www.lynda.com/"));
        list.add(new Item("Udemy",R.drawable.udemy,"https://www.udemy.com/"));
        list.add(new Item("Udacity",R.drawable.udacity,"https://www.udacity.com/"));
        list.add(new Item("Khan Academy",R.drawable.khanacademy,"https://www.khanacademy.org/"));
        list.add(new Item("Coursera",R.drawable.coursera,"https://www.coursera.org/"));
        list.add(new Item("W3schools",R.drawable.w3schools,"https://www.w3schools.com/"));
        list.add(new Item("Code Pen",R.drawable.codepen,"https://codepen.io/"));
        list.add(new Item("Tutorials Point",R.drawable.tutorialspoint,"https://www.tutorialspoint.com/"));
        list.add(new Item("JavaT Point",R.drawable.javatpoint,"https://www.javatpoint.com/"));
        list.add(new Item("C Plus Plus",R.drawable.cplusplus,"https://www.cplusplus.com/"));
        list.add(new Item("Edx",R.drawable.edx,"https://www.edx.org/"));
        list.add(new Item("Android Documentation",R.drawable.android,"https://developer.android.com/docs/"));
        list.add(new Item("Php",R.drawable.php,"https://www.php.net/"));
        list.add(new Item("Tree House",R.drawable.treehouse,"https://www.uber.com/en/in"));

        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(Elearning.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(Elearning.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
