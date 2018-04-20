package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.wolfsoft.propertyui.R;

import java.util.ArrayList;

import adapter.RecycleAdapter_propertylist;
import model.Property;


/**
 * Created by Wolf Soft on 10/10/2017.
 */

public class NearByFragment extends Fragment {

    View view;

    private String address[]= {"Kalung,Yogykurta","Bantul,Yogykurta","Kalung,Yogykurta","Bantul,Yogykurta"};
    private String bed[]= {"3 tickets","3 tickets","2 tickets","4 tickets"};
    private String shower[]= {"3 people","4 people ","3 people" ,"2 people"};
    private String sqft[]= {"1 dish ","2 dish","1 dish","2 dish"};
    private String price[]= {"$1,00,0","$2,00,0","$1,50,0","$3,80,0"};
    private int image[]= {R.drawable.titos1,R.drawable.titos5,R.drawable.titos4,R.drawable.titos3};

    private ArrayList<Property> propertyArrayList;
    private RecyclerView recyclerView;
    private RecycleAdapter_propertylist mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_neabyproperty, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_property);
        propertyArrayList = new ArrayList<>();

        for (int i = 0; i < address.length; i++) {
            Property beanClassForRecyclerView_contacts = new Property(address[i],price[i],bed[i],shower[i],sqft[i],image[i]);

            propertyArrayList.add(beanClassForRecyclerView_contacts);
        }

        mAdapter = new RecycleAdapter_propertylist(getActivity(),propertyArrayList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
