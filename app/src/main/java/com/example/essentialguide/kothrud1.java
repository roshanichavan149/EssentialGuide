package com.example.essentialguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class kothrud1 extends AppCompatActivity {

    RecyclerView recyclerView;
    DatabaseReference ref;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kothrud1);

        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        Context context;
        recyclerView.setLayoutManager(new LinearLayoutManager(context: this));
        database=FirebaseDatabase.getInstance();
        ref=database.getReference().child("Kothrud").child("Hospitals");

    }

    protected void onStart()
    {
        super.onStart();

        FirebaseRecyclerAdapter<user,Holder>firebaseRecyclerAdapter= new FirebaseRecyclerAdapter<user, Holder>(user.class,R.layout.data,Holder.class,ref)
        {
            @Override
            protected void populateViewHolder(Holder holder, user user, int i) {
                holder.setView(getApplicationContext(),user.getShopName(),user.getShopAddress(),user.getShopContact());
            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}