package com.example.franvanna.eagleeye2;

/**
 * Created by Franvanna on 3/8/2018.
 */


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by Franvanna on 1/10/2018.
 */

public class AdapterMainMenu extends RecyclerView.Adapter<AdapterMainMenu.ViewHolder> {


    private static final String TAG = "ADP_REC_IT";

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivMenuIco;
        TextView ivMenuText;
        View layout;

        public ViewHolder(View view) {
            super(view);
            layout = view;
            ivMenuIco = (ImageView) layout.findViewById(R.id.ivMenuIco);
            ivMenuText = (TextView) layout.findViewById(R.id.ivMenuText);
        }
    }

    private Context context;
    private List<MenuItem> menuItemList;
    private CallbacksAdapterMenuItems callbacksAdapterMenuItems;


    public AdapterMainMenu(Context context, List<MenuItem> menuItemList, CallbacksAdapterMenuItems callbacksAdapterMenuItems){

        this.context = context;
        this.menuItemList = menuItemList;
        this.callbacksAdapterMenuItems = callbacksAdapterMenuItems;



    }

    @Override
    public AdapterMainMenu.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_adapter_menu, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final AdapterMainMenu.ViewHolder holder, int position) {

        final MenuItem menuItem = menuItemList.get(position);



        holder.ivMenuText.setText(menuItem.getMenuText());
        holder.ivMenuIco.setImageDrawable(context.getResources().getDrawable(menuItem.getMenuIco()));


        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callbacksAdapterMenuItems.onItemClicked(menuItem);

            }
        });
    }

    @Override
    public int getItemCount() {
        return menuItemList.size();
    }

    public interface CallbacksAdapterMenuItems {
        void onItemClicked(MenuItem menuItem);

    }



}
