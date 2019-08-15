package com.example.loginactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class SingleListItem1 extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_item_view1);

        TextView txtProduct = (TextView) findViewById(R.id.product_label);

        Intent i = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("product");
        // displaying selected product name
        txtProduct.setText(product);


        setContentView(R.layout.single_list_item_view1);
        Button registerScreen5 = (Button) findViewById(R.id.logout1);
        //Listening to register new account link
        registerScreen5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                //Switching to Register screen
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
        });



        TextView registerScreen1 = (TextView) findViewById(R.id.lastback);
        //Listening to register new account link
        registerScreen1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view){
                //Switching to Register screen
                Intent i = new Intent(getApplicationContext(), AndroidListViewActivity1.class);
                startActivity(i);
            }
        });

    }
}