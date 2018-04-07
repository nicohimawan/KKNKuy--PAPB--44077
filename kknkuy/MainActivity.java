package com.kkn.papb.kknkuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button Button;
    private ImageButton ImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = (Button) findViewById(R.id.Button);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChat();
            }
        });
        ImageButton = (ImageButton) findViewById(R.id.ImageButton);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenOprec();
            }
        });


    }
    public void openChat(){
        Intent intent = new Intent(this, BlankFragment.class);
        startActivity(intent);
    }
    public void OpenOprec() {
        Intent intent = new Intent(this, Oprec.class);
        startActivity(intent);
}
}
