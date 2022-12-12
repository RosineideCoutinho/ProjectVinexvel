package com.rosineidecout.vinexvel;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.fragment.app.ListFragment;

import java.util.Arrays;
import java.util.List;

public class CategoriaListFragment extends ListFragment implements AdapterView.OnItemClickListener {


    @Override
    public void onStart() {


        super.onStart();
        List<String> categorias = Arrays.asList("Campo Grande", "São Paulo",
                "Miami");
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, categorias);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }





    @Override
    public void onItemClick(AdapterView<?> parent,
                            View view, int position,
                            long id){


    }

}
