package com.example.loginactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog.Builder;

public class RegisterActivity extends Activity {
    private Button Register;
    private EditText Email1;
    private EditText Fullname;
    private EditText password;
    SQLiteDatabase db1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set View to register.xml
        setContentView(R.layout.register);
        Register=(Button)findViewById(R.id.btnRegister);
        Fullname=(EditText)findViewById(R.id.reg_fullname);
        Email1=(EditText)findViewById(R.id.reg_email);
        password=(EditText)findViewById(R.id.reg_password);


        db1=openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE, null);
        db1.execSQL("CREATE TABLE IF NOT EXISTS Registertable(Fullname VARCHAR,Email1 VARCHAR,password VARCHAR);");
       // TextView loginScreen = (TextView) findViewById(R.id.link_to_login);
        // Listening to Login Screen link
        Register.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // Inserting a record to the Student table
                if(arg0==Register)
                {
                    // Checking for empty fields
                    if(Fullname.getText().toString().trim().length()==0||
                           Email1.getText().toString().trim().length()==0|| password.getText().toString().trim().length()==0)
                    {
                        showMessage("Error","Please enter all values");
                        return;
                    }
                    db1.execSQL("INSERT INTO Registertable VALUES('''+Fullname.getText()+''','''+Email1.getText()+''','''+password.getText()+''');");
                    showMessage("Success","Record added");
                    clearText();

                    Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(i);
                }



        // Closing registration screen
                // Switching to Login Screen/closing register scre
               // finish();
            }
        });

        TextView loginScreen = (TextView) findViewById(R.id.link_to_login);

        //Listening to register new account link
        loginScreen.setOnClickListener(new View.OnClickListener()

        {

            public void onClick (View view){
                //Switching to Register screen
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
        });
    }
public void showMessage(String title,String message)
        {
        Builder builder=new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
        }



public void clearText()
        {
            Fullname.setText("");
        Email1.setText("");
        password.setText("");
        }

        }