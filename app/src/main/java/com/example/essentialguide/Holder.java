package com.example.essentialguide;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {

    //view variable

    View view;
    public Holder(@NonNull View itemView) {
        super(itemView);

        view=itemView;
    }

    public void setView(Context context,String shopName,String shopAddress,String shopContact)
    {
        //passing refrence
        TextView name_es=view.findViewById(R.id.name_es);
        TextView address_es=view.findViewById(R.id.address_es);
        TextView contact_es=view.findViewById(R.id.contact_es);

        name_es.setText(shopName);
        address_es.setText(shopAddress);
        contact_es.setText(shopContact);


    }
}
