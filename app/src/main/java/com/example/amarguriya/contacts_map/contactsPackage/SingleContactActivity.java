package com.example.amarguriya.contacts_map.contactsPackage;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.amarguriya.contacts_map.R;

public class SingleContactActivity  extends Activity {

    // JSON node keys
    private static final String TAG_NAME = "name";
    private static final String TAG_EMAIL = "email";
    private static final String TAG_PHONE = "phone";
    private static final String TAG_PHONE_OFFICE = "officePhone";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_contact);

        // getting intent data
        Intent in = getIntent();

        // Get JSON values from previous intent
        String name = in.getStringExtra(TAG_NAME);
        String email = in.getStringExtra(TAG_EMAIL);
        String mobile = in.getStringExtra(TAG_PHONE);
        String office = in.getStringExtra(TAG_PHONE_OFFICE);

        // Displaying all values on the screen
        TextView lblName = (TextView) findViewById(R.id.name_label);
        TextView lblEmail = (TextView) findViewById(R.id.email_label);
        TextView lblMobile = (TextView) findViewById(R.id.mobile_label);
        TextView lboffice = (TextView) findViewById(R.id.office_number);

        lblName.setText(name);
        lblEmail.setText(email);
        lblMobile.setText(mobile);
        lboffice.setText(office);
    }
}