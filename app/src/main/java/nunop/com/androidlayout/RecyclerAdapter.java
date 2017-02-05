package nunop.com.androidlayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import nunop.com.androidlayout.R;

/**
 * Created by nunop on 31/01/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<nunop.com.androidlayout.View_Holder> {

    List<Data> list = Collections.emptyList();
    Context context;

    public RecyclerAdapter(List<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public nunop.com.androidlayout.View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row, parent, false);
        nunop.com.androidlayout.View_Holder holder = new nunop.com.androidlayout.View_Holder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(nunop.com.androidlayout.View_Holder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).title);


        //animate(holder);

    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Insert a new item to the RecyclerView on a predefined position
    public void insert(int position, Data data) {
        list.add(position, data);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(Data data) {
        int position = list.indexOf(data);
        list.remove(position);
        notifyItemRemoved(position);
    }
}