
package com.example.loginactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
import android.app.AlertDialog.Builder;

public class LoginActivity extends Activity {
    private Button Login;
    private EditText Email;
    private EditText Password;
    SQLiteDatabase db;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.login);

         Login=(Button)findViewById(R.id.btnLogin);
        Email=(EditText)findViewById(R.id.ETemail);
       Password=(EditText)findViewById(R.id.ETpassword);

       //Login.setOnClickListener(this);
        Login.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View view) {
                                         //System.out.println(Email.getText().toString());
                                        validate(Email.getText().toString(), Password.getText().toString());
                                         // Creating database and table
                                         /*db=openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE, null);
                                         db.execSQL("CREATE TABLE IF NOT EXISTS student(Email VARCHAR,Password VARCHAR);");


                                         // Inserting a record to the Student table
                                         if(view==Login)
                                         {
                                             // Checking for empty fields
                                             if(Email.getText().toString().trim().length()==0||
                                                     Password.getText().toString().trim().length()==0)
                                             {
                                                 showMessage("Error","Please enter all values");
                                                 return;
                                             }
                                             db.execSQL("INSERT INTO student VALUES('''+Email.getText()+''','''+Password.getText()+''');");
                                             showMessage("Success","Record added");
                                             clearText();
                                         }*/

                                     }
                                 });

            TextView registerScreen = (TextView) findViewById(R.id.link_to_register);
             //Listening to register new account link
        registerScreen.setOnClickListener(new View.OnClickListener()

            {

                public void onClick (View view){
                //Switching to Register screen
                Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(i);
           }
            });
    }


    /*public void showMessage(String title,String message)
    {
        Builder builder=new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }



    public void clearText()
    {
        Email.setText("");
        Password.setText("");
    }*/


private void validate(String Email,String Password) {
    // if(true) {
    if ((Email.equals("srishakthi")) && (Password.equals("siet"))) {
        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);
    }
}

}

