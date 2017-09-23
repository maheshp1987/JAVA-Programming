package com.demo.eventoddtest.evenoddtester;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {


    EditText et1;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 =(EditText)findViewById(R.id.number);
        t1=(TextView)findViewById(R.id.result);
        b1=(Button)findViewById(R.id.btnclick);

        et1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                 et1.setText("");
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int no = Integer.parseInt(et1.getText().toString());
                if(no%2 ==0){
                    t1.setText(no + " Number is Even");
                }
                else{
                    t1.setText(no + " Number is Odd");
                }
            }
        });


    }


}
