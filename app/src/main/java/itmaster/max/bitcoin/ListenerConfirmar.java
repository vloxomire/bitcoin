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
        //
        activity2.putExtra("NOMBRE",this.context.getEt1().getText());
        activity2.putExtra("APELLIDO",this.context.getEt2().getText());
        activity2.putExtra("EMAIL",this.context.getEt3().getText());
        context.startActivity(activity2);
    }
}
