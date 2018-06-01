package canadore.mobileapp.com.harpreet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Happy extends AppCompatActivity {
Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);
        bt1=(Button) findViewById(R.id.bt1);
        bt2=(Button) findViewById(R.id.bt2);

        bt3=(Button) findViewById(R.id.bt3);

    }
    public void bt1(View view)
    {
        Intent i = new Intent(Happy.this, Image1.class);
        startActivity(i);
    }


    public void bt2(View view)
    {
        Intent i = new Intent(Happy.this, Image2.class);
        startActivity(i);
    }

    public void bt3(View view)
    {
        Intent i = new Intent(Happy.this, Image3.class);
        startActivity(i);
    }
}
