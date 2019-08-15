
package com.example.loginactivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class HomeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
       setContentView(R.layout.home);
        TextView homeScreen = (TextView) findViewById(R.id.link_to_back);

        //Listening to register new account link
        homeScreen.setOnClickListener(new View.OnClickListener()

        {

            public void onClick (View view){
                //Switching to Register screen
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
        });
        Button homeScreen1 = (Button) findViewById(R.id.CSEA1);
        homeScreen1.setOnClickListener(new View.OnClickListener()

        {

            public void onClick (View view){
                //Switching to home screen
                Intent i = new Intent(getApplicationContext(), AndroidListViewActivity1.class);
                startActivity(i);
            }
        });
        Button homeScreen2 = (Button) findViewById(R.id.CSEB1);
        homeScreen2.setOnClickListener(new View.OnClickListener()

        {

            public void onClick (View view){
                //Switching to home screen
                Intent i = new Intent(getApplicationContext(), AndroidListViewActivity1.class);
                startActivity(i);
            }
        });
    }
}
