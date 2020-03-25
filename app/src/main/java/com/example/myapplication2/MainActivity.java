package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import  java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView myReciclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private AppDatabase myData;
    public EditText name;
    public EditText mark;
    public Button adduser;
    public Button removeuser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myReciclerView=(RecyclerView) findViewById(R.id.my_recycler_view);
        myReciclerView.setHasFixedSize(true);

        mLayoutManager=new LinearLayoutManager(this);
        myReciclerView.setLayoutManager(mLayoutManager);
        mAdapter=new MyAdapter (users);
        myReciclerView.setAdapter(mAdapter);

        name=findViewById(R.id.name);
        mark=findViewById(R.id.mark);
        adduser=findViewById(R.id.button1);
        removeuser=findViewById(R.id.button2);

        adduser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        removeuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
