package com.hanfl.behavior.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.hanfl.behavior.R;
import com.hanfl.behavior.model.Product;

import javax.inject.Inject;

public class FactoryActivity extends AppCompatActivity {

    @Inject
    Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        findViewById(R.id.btn_java).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


    public Product getProduct() {
        return product;
    }
}
