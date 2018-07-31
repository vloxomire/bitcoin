package itmaster.max.bitcoin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2, et3;
    private Button confirmar, reset;
    private ListenerConfirmar listenerConfirmar;
    private ListenerReset listenerReset;

    public EditText getEt1() {
        return et1;
    }

    public EditText getEt2() {
        return et2;
    }

    public EditText getEt3() {
        return et3;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        confirmar = findViewById(R.id.confirmar);
        reset = findViewById(R.id.reset);
        listenerConfirmar = new ListenerConfirmar(this);
        listenerReset = new ListenerReset(this);


    }
}
