package itmaster.max.bitcoin;

import android.content.Intent;
import android.view.View;

public class ListenerConfirmar implements View.OnClickListener {
    MainActivity context;

    public ListenerConfirmar(MainActivity context) {
        this.context = context;
    }




    @Override
    public void onClick(View view) {
        Intent activity2 = new Intent(context, Main2Activity.class );
    }
}
