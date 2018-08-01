package itmaster.max.bitcoin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
   //declaro variables
    private TextView txv1, txv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bolsa = new Bundle();
        bolsa = getIntent().getExtras();

        String dato = bolsa.getString("NOMBRE");
        String dato2 = bolsa.getString("APELLIDO");
        String dato3 = bolsa.getString("EMAIL");

        txv1 = findViewById(R.id.txv1);
        txv2 = findViewById(R.id.txv2);

        txv1.setText(dato+""+dato2);
        txv2.setText(dato3);
    }
}
