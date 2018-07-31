package itmaster.max.bitcoin;

import android.app.Activity;
import android.view.View;

public class ListenerReset implements View.OnClickListener {
    MainActivity context;

    public ListenerReset(MainActivity pcontext) {
        this.context = pcontext;
    }

    @Override
    public void onClick(View view) {
        context.getEt1().setText("");
        context.getEt2().setText("");
        context.getEt3().setText("");

    }
}
