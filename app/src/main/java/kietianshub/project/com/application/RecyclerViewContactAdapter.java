package kietianshub.project.com.application;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewContactAdapter extends RecyclerView.Adapter<RecyclerViewContactAdapter.MyViewHolder> {
        private ArrayList<Contact> mData;
        private Context context;

        public RecyclerViewContactAdapter(Activity context, ArrayList<Contact> mData) {
            this.context = context;
            this.mData = mData;

        }

        @Override
        public RecyclerViewContactAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_view_contact, parent, false);
            context = parent.getContext();


            return new RecyclerViewContactAdapter.MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final RecyclerViewContactAdapter.MyViewHolder holder, final int position) {
            holder.setData(mData.get(position));


            holder.setItemClickListener(new ItemClickListener() {
                @Override
                public void onClick(View view, int position, boolean b) {
                   intent(position+1);
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
            public Contact pName;
            private ItemClickListener itemClickListener;
            TextView text_cardView;
            ImageView image_cardView;

            public MyViewHolder(@NonNull final View itemView) {
                super(itemView);
                text_cardView = itemView.findViewById(R.id.title_cardView_contact);
                image_cardView = itemView.findViewById(R.id.image_cardView_contact);
                itemView.setOnClickListener((View.OnClickListener) this);
            }
            public void setItemClickListener(ItemClickListener itemClickListener) {
                this.itemClickListener = itemClickListener;

            }

            public void setData(Contact pName) {
                this.pName = pName;
                text_cardView.setText(pName.getmName());
                image_cardView.setImageResource(pName.getmImage());

            }

            @Override
            public void onClick(View view) {
                itemClickListener.onClick(view, getAdapterPosition(), false);
            }
        }
        public void intent(int pos){
           Intent n = new Intent(context,MainContact.class);
           n.putExtra("key",pos);
           context.startActivity(n);

        }



}
