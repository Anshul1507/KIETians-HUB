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

public class SocialNetworkAndMail extends Fragment {
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

        list.add(new Item("Facebook",R.drawable.facebook,"https://www.facebook.com/"));
        list.add(new Item("Twitter",R.drawable.twitter,"https://twitter.com/"));
        list.add(new Item("LinkedIn",R.drawable.linkedin,"https://www.linkedin.com/"));
        list.add(new Item("Instagram",R.drawable.instagram,"https://www.instagram.com/accounts/login/"));
        list.add(new Item("Google+",R.drawable.googleplus,"https://plus.google.com/"));
        list.add(new Item("PhotoBucket",R.drawable.photobucket,"https://www.photobucket.com/"));
        list.add(new Item("Tumblr",R.drawable.tumblr,"https://www.tumblr.com/"));
        list.add(new Item("Pinterest",R.drawable.pinterest,"https://in.pinterest.com/"));
        list.add(new Item("Telegram",R.drawable.telegram,"https://web.telegram.org/"));
        list.add(new Item("Flickr",R.drawable.flickr,"https://www.flickr.com/"));
        list.add(new Item("Quora",R.drawable.quora,"https://www.quora.com/"));
        list.add(new Item("Reddit",R.drawable.reddit,"https://www.reddit.com/"));
        list.add(new Item("GMail",R.drawable.gmail,"https://www.google.com/gmail/"));
        list.add(new Item("Outlook",R.drawable.outlook,"https://outlook.live.com/"));
        list.add(new Item("Yahoo",R.drawable.yahoo,"https://in.yahoo.com/"));


        final RecyclerViewItemAdapter adapter = new RecyclerViewItemAdapter(SocialNetworkAndMail.this.getActivity(),list);
        final RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(SocialNetworkAndMail.this.getActivity(),3));
        rv.setAdapter(adapter);
    }


}
