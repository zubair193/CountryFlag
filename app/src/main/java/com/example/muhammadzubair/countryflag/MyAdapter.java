package com.example.muhammadzubair.countryflag;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context mContext;
    private List<country> mData;

    public MyAdapter(Context mContext, List<country> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater minflater = LayoutInflater.from(mContext);
        view = minflater.inflate(R.layout.cardview_layout, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int i) {

        holder.tv_country_name.setText(mData.get(i).getName());
        holder.img_country_flag_thumbnail.setImageResource(mData.get(i).getCounrty_flag_Thumbnail());

        //set Click Listener
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,countryinfo.class);

                // Passing Data to countryinfo Activity
                intent.putExtra("c_name",mData.get(i).getName());
                intent.putExtra("c_thumbnail", mData.get(i).getCounrty_flag_Thumbnail());

                //Start the activity
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_country_name;
        ImageView img_country_flag_thumbnail;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_country_name = (TextView) itemView.findViewById(R.id.country_name_id);
            img_country_flag_thumbnail = (ImageView)  itemView.findViewById(R.id.country_image_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
