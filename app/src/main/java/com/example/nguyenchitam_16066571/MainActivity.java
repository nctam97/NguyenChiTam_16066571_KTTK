package com.example.nguyenchitam_16066571;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDn;
    EditText editTK, editMK;
    CheckBox checkLuu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDn=(Button)findViewById(R.id.btn_dn);
        editTK=(EditText)findViewById(R.id.edt_tk);
        editMK=(EditText)findViewById(R.id.edt_mk);
        checkLuu=(CheckBox)findViewById(R.id.cb_Luu);
        checkLuu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this,"Đã chọn", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Đã bỏ chọn",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkLuu.isChecked()){
                    Toast.makeText(MainActivity.this,"Đã đăng nhập, thông tin đã lưu",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Đã đăng nhập, thông tin chưa được lưu",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
