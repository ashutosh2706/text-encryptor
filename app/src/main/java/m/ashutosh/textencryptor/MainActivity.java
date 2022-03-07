package m.ashutosh.textencryptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import m.ashutosh.textencryptor_lib.Encryptor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button_enc);
        Button btn2 = findViewById(R.id.button_dec);
        EditText text = findViewById(R.id.text_field);
        EditText pwd = findViewById(R.id.password_field);
        btn1.setOnClickListener(view -> {

            if(TextUtils.isEmpty(text.getText().toString().trim()))
                text.setError("empty");
            else if(TextUtils.isEmpty(pwd.getText().toString().trim()))
                pwd.setError("empty");
            else {
                String s = text.getText().toString();
                String p = pwd.getText().toString();
                try {
                    text.setText(Encryptor.encrypt(s,p));
                } catch (Exception e) {
                    Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn2.setOnClickListener(view -> {
            if(TextUtils.isEmpty(text.getText().toString().trim()))
                text.setError("empty");
            else if(TextUtils.isEmpty(pwd.getText().toString().trim()))
                pwd.setError("empty");
            else {
                String s = text.getText().toString();
                String p = pwd.getText().toString();
                try {
                    text.setText(Encryptor.decrypt(s,p));
                } catch (Exception e) {
                    Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}