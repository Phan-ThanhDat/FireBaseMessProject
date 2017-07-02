package vn.myclass.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by nguyenbathanh on 8/9/16.
 */
public class AppInfoActivity extends Activity {
    private EditText edtUserName;
    private EditText edtPassword;
    private Button btnLogin;
    private String USER_NAME = "myclass";
    private String PASS_WORD = "android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appinfo);

        edtUserName = (EditText) findViewById(R.id.edt_username);
        edtPassword = (EditText) findViewById(R.id.edt_pass);

        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUserName.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if (username.equals(USER_NAME) && password.equals(PASS_WORD)) {
                    Toast.makeText(getApplicationContext(), "Login success!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login Fail! Check username or password again!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
