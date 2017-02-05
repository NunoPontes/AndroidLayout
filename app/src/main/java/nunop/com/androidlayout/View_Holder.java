package nunop.com.androidlayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nunop.com.androidlayout.R;

/**
 * Created by nunop on 31/01/2017.
 */

public class View_Holder extends RecyclerView.ViewHolder {


    TextView title;


    View_Holder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.title);

    }
}