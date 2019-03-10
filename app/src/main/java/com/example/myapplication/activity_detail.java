package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_detail extends AppCompatActivity {
    TextView tname,toverview;
    ImageView ivBarbie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tname = findViewById(R.id.judul);
        toverview = findViewById(R.id.tv_overview);
        ivBarbie = findViewById(R.id.iv_movie);

        String name = getIntent().getStringExtra("name");
        String overview = getIntent().getStringExtra("overview");
        int gambar = getIntent().getIntExtra("gambar",0);

        tname.setText(name);
        toverview.setText(overview);
        ivBarbie.setImageResource(gambar);
    }
}
