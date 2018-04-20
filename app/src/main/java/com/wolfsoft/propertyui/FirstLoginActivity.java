package com.wolfsoft.propertyui;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import BeanClasses.BeanClassForCusine;
import BeanClasses.BeanClassForDish;
import adapter.PagerAdapterForBanner;
import adapter.RecycleAdapter_Cusine;
import adapter.RecycleAdapter_Dish;

public class FirstLoginActivity extends AppCompatActivity {
    private PagerAdapterForBanner pagerAdapterForBanner;

    private ViewPager viewPager;



    private ArrayList<BeanClassForDish> beanClassForDashboards;

    private RecyclerView recyclerView_dish;
    private RecycleAdapter_Dish mAdapter_dish;

    Integer image[] = {R.drawable.trandy_coffee,R.drawable.ice_cream,R.drawable.img1,R.drawable.kesar,R.drawable.trandy_coffee};
    String dish_name[] = {"Titos","Mambos","Titos","Mambos","Titos"};
    String dish_type[] = {"Goan","North Goa","South Goa","North Goa","South Goa"};
    String price[] = {"Rs 500 / person (app.)","Rs 800 / person (app.)","Rs 400 / person (app.)","Rs 200 / person (app.)","Rs 500 / person (app.)"};



    private ArrayList<BeanClassForCusine> beanClassForCusines;

    private RecyclerView recyclerView_cusine;
    private RecycleAdapter_Cusine mAdapter_cusine;


    Integer image1[] = {R.drawable.food,R.drawable.food1,R.drawable.paneer,R.drawable.paratha,R.drawable.parahta_long};
    String price1[] ={"Rs 350","Rs 200","Rs 550","Rs 400","Rs 250"};
    String cusine_name[] = {"Thai Cusine","Maxican","Desert","South Indian","Italian"};
    String city[] = {"Vadodara","Vadodara","Vadodara","Vadodara","Vadodara"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_login);

    recyclerView_dish = (RecyclerView) findViewById(R.id.recyclerview_dish);
    beanClassForDashboards = new ArrayList<>();



        for (int i = 0; i < image.length; i++) {
        BeanClassForDish beanClassForRecyclerView_contacts = new BeanClassForDish(image[i],dish_name[i],dish_type[i],price[i]);


        beanClassForDashboards.add(beanClassForRecyclerView_contacts);
    }


    mAdapter_dish = new RecycleAdapter_Dish(FirstLoginActivity.this,beanClassForDashboards);
    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(FirstLoginActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView_dish.setLayoutManager(mLayoutManager);
        recyclerView_dish.setItemAnimator(new DefaultItemAnimator());
        recyclerView_dish.setAdapter(mAdapter_dish);




    //        Cusine Recyclerview Code

    recyclerView_cusine = (RecyclerView) findViewById(R.id.recyclerview_cusine);
    beanClassForCusines = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
        BeanClassForCusine beanClassForCusine = new BeanClassForCusine(image1[i],price1[i],cusine_name[i],city[i]);


        beanClassForCusines.add(beanClassForCusine);
    }


    mAdapter_cusine = new RecycleAdapter_Cusine(FirstLoginActivity.this,beanClassForCusines);
    RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(FirstLoginActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView_cusine.setLayoutManager(mLayoutManager1);
        recyclerView_cusine.setItemAnimator(new DefaultItemAnimator());
        recyclerView_cusine.setAdapter(mAdapter_cusine);





        /*Banner ViewPager Code*/



    viewPager = (ViewPager) findViewById(R.id.viewpager);



    pagerAdapterForBanner = new PagerAdapterForBanner(getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapterForBanner);



}

    public void OpenClubs(View view) {
        Intent it = new Intent(FirstLoginActivity.this,TabMainActivity.class);
        startActivity(it);
    }
}


