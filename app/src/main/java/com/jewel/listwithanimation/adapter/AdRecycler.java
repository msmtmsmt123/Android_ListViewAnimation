package com.jewel.listwithanimation.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jewel.listwithanimation.R;
import com.jewel.listwithanimation.utils.MyAnimation;

import java.util.ArrayList;

/**
 * Created by Jewel on 2/10/2016.
 */
public class AdRecycler extends RecyclerView.Adapter<AdRecycler.MyViewHolder>{
    private ArrayList<String>list;
    private Context context;
    private View view;
    private LayoutInflater inflater;
    private AdRecycler myInstance;


    public AdRecycler(Context context){
        this.context=context;
        inflater=LayoutInflater.from(this.context);
        myInstance=this;
    }
    public void setData(ArrayList<String>list){
        this.list=list;
        notifyDataSetChanged();

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view=inflater.inflate(R.layout.row_item,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvName.setText(list.get(position));
        //MyAnimation.animateLeftRight(holder,true);
        MyAnimation.animateUpDown(holder,position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView tvName;

        public MyViewHolder(final View itemView) {
            super(itemView);
            tvName= (TextView) itemView.findViewById(R.id.tv_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    MyAnimation.animateLeftRight(itemView, false);
                    MyAnimation.rotation(itemView, false);
                }
            });
        }
    }
}
