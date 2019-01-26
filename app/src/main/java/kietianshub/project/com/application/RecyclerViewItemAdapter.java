package kietianshub.project.com.application;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewItemAdapter extends RecyclerView.Adapter<RecyclerViewItemAdapter.MyViewHolder> {
    private static final String TAG = RecyclerViewItemAdapter.class.getSimpleName();
    private ArrayList<Item> mData;
    private Context context;

    //For linking
    private CustomTabsServiceConnection customTabsServiceConnection;
    private CustomTabsClient mClient;
    CustomTabsSession customTabsSession;

    public RecyclerViewItemAdapter(Activity context, ArrayList<Item> mData) {
        this.context = context;
        this.mData = mData;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_items, parent, false);
        context = parent.getContext();


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.setData(mData.get(position));


        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean b) {
                customTabLinking(holder.pName.getUrl());
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mData != null) {
            return mData.size();
        }
        return 0;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public CardView cardView;
        public Item pName;
        private ItemClickListener itemClickListener;
        TextView tv_cardView;
        ImageView iv_cardView;

        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            tv_cardView = itemView.findViewById(R.id.title_cardView);
            iv_cardView = itemView.findViewById(R.id.image_cardView);
            itemView.setOnClickListener((View.OnClickListener) this);
        }
        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;

        }

        public void setData(Item pName) {
            this.pName = pName;
            tv_cardView.setText(pName.getTitle());
            iv_cardView.setImageResource(pName.getThumbnail());

        }

        @Override
        public void onClick(View view) {
            itemClickListener.onClick(view, getAdapterPosition(), false);
        }
    }

    public void customTabLinking(String url){
        customTabsServiceConnection = new CustomTabsServiceConnection() {
            @Override
            public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                //pre-warning means to fast the surfing
                mClient = customTabsClient;
                mClient.warmup(0L);
                customTabsSession = mClient.newSession(null);
            }


            @Override
            public void onServiceDisconnected(ComponentName componentName) {
                mClient = null;
            }
        };
        CustomTabsClient.bindCustomTabsService(context,"com.android.chrome",customTabsServiceConnection);
        Uri uri = Uri.parse(url);

        //Create an Intent Builder
        CustomTabsIntent.Builder intentBuilder = new CustomTabsIntent.Builder();
        //Begin Customizing
        //Set Toolbar Colors
        intentBuilder.setToolbarColor(ContextCompat.getColor(context,R.color.colorPrimary));
        intentBuilder.setSecondaryToolbarColor(ContextCompat.getColor(context,R.color.colorPrimaryDark));

        //Set Start and Exit Animations
        intentBuilder.setStartAnimations(context,R.anim.slide_in_right,R.anim.slide_out_left);
        intentBuilder.setExitAnimations(context,android.R.anim.slide_in_left,android.R.anim.slide_out_right);

        //build custom tabs intent
        CustomTabsIntent customTabsIntent =  intentBuilder.build();
        customTabsIntent.intent.setPackage("com.android.chrome");
        customTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        customTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        intentBuilder.setShowTitle(true);
        intentBuilder.enableUrlBarHiding();

        //Setting a custom back button


        //launch the url
        customTabsIntent.launchUrl(context,uri);

    }
}



