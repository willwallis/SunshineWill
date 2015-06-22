package com.knewto.www.sunshinewill.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Creating an array list and add forecast values
        ArrayList<String> forecastList = new ArrayList<String>();
        forecastList.add("Today - Sunny - 88/63");
        forecastList.add("Tomorrow - Foggy - 70/46");
        forecastList.add("Weds - Cloudy - 72/63");
        forecastList.add("Thurs - Rainy - 64/51");
        forecastList.add("Fri - Foggy - 70/46");
        forecastList.add("Sat - Sunny - 76/68");

        //Alternate Array setup
        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/46",
                "Weds - Cloudy - 72/63",
                "Thurs - Rainy - 64/51",
                "Fri - Foggy - 70/46",
                "Sat - Sunny - 76/68"
        };

        List<String> weekForecast=new ArrayList<String>(Arrays.asList(forecastArray));

        // Setup adapter
        ArrayAdapter<String> ForecastAdapter = new ArrayAdapter<String> (
            // Context
            getActivity(),
            // ID of list item layout
            R.layout.list_item_forecast,
            // ID of the text view to populate
            R.id.list_item_forecast_textview,
            //Forecast Data
            weekForecast
        ) ;

        // OOB Stuff
        View mainFragmentView = inflater.inflate(R.layout.fragment_main, container, false);

        // Bind view to adapter
        ListView listview = (ListView) mainFragmentView.findViewById(R.id.listview_forecast);
        listview.setAdapter(ForecastAdapter);

        return mainFragmentView;
    }
}
