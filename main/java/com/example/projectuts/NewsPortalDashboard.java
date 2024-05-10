package com.example.projectuts;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class NewsPortalDashboard extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_portal_dashboard);

        List<NewsItem> NewsItems = new ArrayList<>();
        NewsItems.add(new NewsItem("Nama: ", "Ghina Nurul Ardhiani"));
        NewsItems.add(new NewsItem("NIM : ", "22552011141"));
        NewsItems.add(new NewsItem("Kelas : ", "TIF 222K"));
        NewsItems.add(new NewsItem("Matkul : ", "Pemograman Mobile 1"));
        NewsItems.add(new NewsItem("Kampus : ", "Universitas Teknologi Bandung"));

        // Create the adapter to convert the array to views
        NewsAdapter adapter = new NewsAdapter(this, NewsItems);

        // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
