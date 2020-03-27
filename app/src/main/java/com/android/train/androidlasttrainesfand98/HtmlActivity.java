package com.android.train.androidlasttrainesfand98;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class HtmlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
        TextView txtHtml = findViewById(R.id.txtHtml);
        txtHtml.setText(Html.fromHtml("<h2>Test</h2><br/><p>This is a Test for Html View</p>"));
    }
}
