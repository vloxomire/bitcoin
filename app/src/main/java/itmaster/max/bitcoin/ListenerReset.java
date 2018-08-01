package itmaster.max.bitcoin;

import android.app.Activity;
import android.view.View;

public class ListenerReset implements View.OnClickListener {
    MainActivity pcontext;

    public ListenerReset(MainActivity pcontext) {
        this.pcontext = pcontext;
    }

    @Override
    public void onClick(View view) {
        pcontext.getEt1().setText("");
        pcontext.getEt2().setText("");
        pcontext.getEt3().setText("");

    }
}
