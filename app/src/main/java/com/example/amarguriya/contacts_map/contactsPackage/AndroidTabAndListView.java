package com.example.amarguriya.contacts_map.contactsPackage;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.amarguriya.contacts_map.R;
import com.example.amarguriya.contacts_map.jsonPackage.ActivityJSON;
import com.example.amarguriya.contacts_map.mapPackage.MapsActivity;

/**
 * Created by AmaRguRiyA on 10-01-2017.
 */

public class AndroidTabAndListView extends TabActivity {
    // TabSpec Names
    private static final String CONTACTS = "All Contatcts";
    private static final String MAP = "Contacts Map";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.androidtabandlistview);

        TabHost tabHost = getTabHost();

        // Inbox Tab
        TabHost.TabSpec inboxSpec = tabHost.newTabSpec(CONTACTS);
        // Tab Icon
        inboxSpec.setIndicator(CONTACTS);
        Intent inboxIntent = new Intent(this, ActivityJSON.class);
        // Tab Content
        inboxSpec.setContent(inboxIntent);

        // Outbox Tab

        TabHost.TabSpec outboxSpec = tabHost.newTabSpec(MAP);
        outboxSpec.setIndicator(MAP);

        Intent outboxIntent = new Intent(this, MapsActivity.class);
        outboxSpec.setContent(outboxIntent);


        // Adding all TabSpec to TabHost
        tabHost.addTab(inboxSpec); // Adding Inbox tab
        tabHost.addTab(outboxSpec); // Adding Outbox tab
    }
}
