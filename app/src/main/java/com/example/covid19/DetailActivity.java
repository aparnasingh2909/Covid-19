package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountry,tvCases,tvTodayCases,tvDeaths;
    TextView tvTodayDeaths,tvRecovered,tvActive,tvCritical;
    PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent=getIntent();
        positionCountry=intent.getIntExtra("position",0);

        tvCountry=findViewById(R.id.tvCases1);
        tvCases=findViewById(R.id.tvCases2);
        tvTodayCases=findViewById(R.id.tvCases3);
        tvDeaths=findViewById(R.id.tvCases4);
        tvTodayDeaths=findViewById(R.id.tvCases5);
        tvRecovered=findViewById(R.id.tvCases6);
        tvActive=findViewById(R.id.tvCases7);
        tvCritical=findViewById(R.id.tvCases8);

        pieChart = findViewById(R.id.piechart2);

        /*pieChart.addPieSlice(new PieModel("Cases",Integer.parseInt(tvCases2.getText().toString()), Color.parseColor("#FFA726")));
        pieChart.addPieSlice(new PieModel("Recovered",Integer.parseInt(tvRecovered6.getText().toString()), Color.parseColor("#66BB6A")));
        pieChart.addPieSlice(new PieModel("Deaths",Integer.parseInt(tvDeaths.getText().toString()), Color.parseColor("#EF5350")));
        pieChart.addPieSlice(new PieModel("Active",Integer.parseInt(tvActive.getText().toString()), Color.parseColor("#29B6F6")));*/

        tvCountry.setText(AffectedCountries.countryModelsList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelsList.get(positionCountry).getCases());
        tvTodayCases.setText(AffectedCountries.countryModelsList.get(positionCountry).getTodayCases());
        tvDeaths.setText(AffectedCountries.countryModelsList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelsList.get(positionCountry).getTodayDeaths());
        tvRecovered.setText(AffectedCountries.countryModelsList.get(positionCountry).getRecovered());
        tvActive.setText(AffectedCountries.countryModelsList.get(positionCountry).getActive());
        tvCritical.setText(AffectedCountries.countryModelsList.get(positionCountry).getCritical());

        pieChart.addPieSlice(new PieModel("Cases",Integer.parseInt(tvCases.getText().toString()), Color.parseColor("#FFA726")));
        pieChart.addPieSlice(new PieModel("Recovered",Integer.parseInt(tvRecovered.getText().toString()), Color.parseColor("#66BB6A")));
        pieChart.addPieSlice(new PieModel("Deaths",Integer.parseInt(tvDeaths.getText().toString()), Color.parseColor("#EF5350")));
        pieChart.addPieSlice(new PieModel("Active",Integer.parseInt(tvActive.getText().toString()), Color.parseColor("#29B6F6")));
        pieChart.startAnimation();
    }
}