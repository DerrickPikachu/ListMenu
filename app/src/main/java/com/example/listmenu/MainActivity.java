package com.example.listmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView menuList;
    TextView txv;
    boolean[] isCheck;
    String[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuList = findViewById(R.id.menuList);
        txv = findViewById(R.id.txv);
        list = getResources().getStringArray(R.array.menuList);
        isCheck = new boolean[list.length];

        menuList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String res = "your order is:";
        isCheck[i] = !isCheck[i];

        for (int j=0; j<list.length; j++) {
            if (isCheck[j]) {
                res = res + " " + list[j];
            }
        }

        txv.setText(res);
    }
}
