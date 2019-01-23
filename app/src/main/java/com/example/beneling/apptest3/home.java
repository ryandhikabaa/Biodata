package com.example.beneling.apptest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class    home extends AppCompatActivity {

    //a list to store all the products
    List<product> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

            //getting the recyclerview from xml
            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            //initializing the productlist
            productList = new ArrayList<>();


            //adding some items to our list
            productList.add(
                    new product(
                            1,
                            "Ryandhika Bintang A",
                            "X RPL 2",
                            4.3,
                            60000,
                            R.drawable.dhika,
                            R.string.Ryandhika));

            productList.add(
                    new product(
                            1,
                            "Hariyanto",
                            "XI RPL",
                            4.3,
                            60000,
                            R.drawable.hariyanto,
                            R.string.Hariyanto));

            productList.add(
                    new product(
                            1,
                            "Hasan Wijaya",
                            "X RPL 1",
                            4.3,
                            60000,
                            R.drawable.hasan,
                            R.string.Hasan));

        productList.add(
                new product(
                        1,
                        "Naufal M. Firdaus",
                        "XII RPL ",
                        4.3,
                        60000,
                        R.drawable.noval,
                        R.string.Naufal));

        productList.add(
                new product(
                        1,
                        "Istiqomah",
                        "XII RPL",
                        4.3,
                        60000,
                        R.drawable.isti,
                        R.string.Istiqomah));

        productList.add(
                new product(
                        1,
                        "Abu Rijal Qudsy",
                        "X RPL 2",
                        4.3,
                        60000,
                        R.drawable.qudsy,
                        R.string.Qudsy));

        productList.add(
                new product(
                        1,
                        "Nur Achmad Shafy",
                        "X RPL 2",
                        4.3,
                        60000,
                        R.drawable.rais,
                        R.string.Rais));

        productList.add(
                new product(
                        1,
                        "Aditya Ivan P.",
                        "X RPL 1",
                        4.3,
                        60000,
                        R.drawable.ivan,
                        R.string.Ivan));

        productList.add(
                new product(
                        1,
                        "Indra Wahyu M.",
                        "X RPL 1",
                        4.3,
                        60000,
                        R.drawable.indra,
                        R.string.Indra));

        //creating recyclerview adapter
            product_adapter adapter = new product_adapter(this, productList);

            //setting adapter to recyclerview
            recyclerView.setAdapter(adapter);
        }

    }

