package com.soctag.fragmentactionbarshow_hide;



import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("NewApi")
public class MyFragment extends Fragment  {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View myView=inflater.inflate(R.layout.fragment_layout, container, false);
		
	
		
		((MainActivity)getActivity()).getSupportActionBar().hide();
		
		
		
		
		return myView;
		
		
	}

}

