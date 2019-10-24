package com.iics1154ita.gazo.daniellefrancisco.labactivity4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] name, version, api, releaseDate;
    ListView listView;
    int[] aLogo = {R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q10};
    ArrayList<AndroidVersions> AndroidList = new ArrayList<>();
    String[] versionInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Android Versions");
        name = getResources().getStringArray(R.array.Name);
        version = getResources().getStringArray(R.array.Version);
        api = getResources().getStringArray(R.array.API);
        releaseDate = getResources().getStringArray(R.array.ReleaseDate);
        versionInfo = getResources().getStringArray(R.array.Trivia);
        for(int i=0; i < name.length; i++){
            AndroidList.add(new AndroidVersions(aLogo[i], name[i], "Ver. " + version[i], "API Level " + api[i], "Released " + releaseDate[i]));
//            versionInfo[i] = "Version: " + version[i] + "\nRelease Date: " + releaseDate[i] + "\nAPI: " + api[i];
        }

        listView = findViewById(R.id.listView);
//        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, names);
        ArrayAdapter myArrayAdapter = new AndroidVersionsAdapter(this, R.layout.item, AndroidList);
        listView.setAdapter(myArrayAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        Object clickItemObj = adapterView.getAdapter().getItem(i);
//        Toast.makeText(this, clickItemObj.toString(), Toast.LENGTH_LONG).show();
        final AlertDialog.Builder myDialog = new AlertDialog.Builder(this);
        myDialog.setTitle(AndroidList.get(i).getName());
        myDialog.setIcon(AndroidList.get(i).getLogo());
        myDialog.setMessage(versionInfo[i]);
        myDialog.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        myDialog.create().show();
    }
}
