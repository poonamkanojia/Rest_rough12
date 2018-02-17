package com.poonam.rest_rough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etOwnEmail , etPass1 , etPass2 , etRestName , etReg , etResAddress , etPostal , etOwnerName , etContact , etCity , etState ;
    Button btnSave ;
    RadioButton rbYes , rbNo;
    CheckedTextView ctv1 , ctv2 , ctv3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etOwnEmail = (EditText) findViewById(R.id.etOwnEmail);
        etPass1 = (EditText) findViewById(R.id.etPass1);
        etPass2 = (EditText) findViewById(R.id.etPass2);
        etRestName = (EditText) findViewById(R.id.etRestName);
        etReg = (EditText) findViewById(R.id.etReg);
        etResAddress = (EditText) findViewById(R.id.etResAddress);
        etPostal = (EditText) findViewById(R.id.etPostal);
        etOwnerName = (EditText) findViewById(R.id.etOwnerName);
        etContact = (EditText) findViewById(R.id.etContact);
        etCity = (EditText) findViewById(R.id.etCity);
        etState = (EditText) findViewById(R.id.etState);
        btnSave = (Button) findViewById(R.id.btnSave);
        ctv1 = (CheckedTextView) findViewById(R.id.ctv1);
        ctv2 = (CheckedTextView) findViewById(R.id.ctv2);
        ctv3 = (CheckedTextView) findViewById(R.id.ctv3);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String OwnerEmail = etOwnEmail.getText().toString();
                String pass1 = etPass1.getText().toString();
                String pass2 = etPass2.getText().toString();
                String RestName = etRestName.getText().toString();
                String ResAddress = etResAddress.getText().toString();
                String postal = etPostal.getText().toString();

                String OwnerName = etOwnerName.getText().toString();
                String contact = etContact.getText().toString();
                String city = etCity.getText().toString();
                String state = etState.getText().toString();

                if (ctv1.isChecked())
                    ctv1.setChecked(false);
                else
                    ctv1.setChecked(true);

                if(OwnerName.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Invalid Name", Toast.LENGTH_LONG).show();
                    etOwnerName.requestFocus();
                    return;
                }//end of if

                if(OwnerEmail.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Invalid Email", Toast.LENGTH_LONG).show();
                    etOwnEmail.requestFocus();
                    return;
                }//end of if
                if(pass1.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Invalid Password", Toast.LENGTH_LONG).show();
                    etPass1.requestFocus();
                    return;
                }//end of if
                if(pass2.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Invalid Password", Toast.LENGTH_LONG).show();
                    etPass2.requestFocus();
                    return;
                }//end of if
                if(!(pass1.equals(pass2)))
                {
                    Toast.makeText(getApplicationContext(), "Password Not Matching", Toast.LENGTH_LONG).show();
                    etPass2.requestFocus();
                    return;
                }
                if(RestName.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Invalid Restaurant Name", Toast.LENGTH_LONG).show();
                    etRestName.requestFocus();
                    return;
                }//end of if
                if(ResAddress.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Invalid Restaurant Address", Toast.LENGTH_LONG).show();
                    etResAddress.requestFocus();
                    return;
                }//end of if
                if(postal.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Invalid Address", Toast.LENGTH_LONG).show();
                    etPostal.requestFocus();
                    return;
                }//end of if
                if(contact.length() != 10)
                {
                    Toast.makeText(getApplicationContext(), "Invalid Phone Number", Toast.LENGTH_LONG).show();
                    etContact.requestFocus();
                    return;
                }//end of if
                if(city.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Invalid City", Toast.LENGTH_LONG).show();
                    etCity.requestFocus();
                    return;
                }//end of if
                if(state.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Invalid State", Toast.LENGTH_LONG).show();
                    etState.requestFocus();
                    return;
                }
                Intent i = new Intent(getApplicationContext() , SecondAct.class);
                startActivity(i);
                finish();
            }//end of onclick
        });//end of button

    }//end of oncreate
}//end of main
