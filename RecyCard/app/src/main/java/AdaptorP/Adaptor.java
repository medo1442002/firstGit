package AdaptorP;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gardenia.recycard.R;

import java.util.List;

import ListITEM.ListItem;

/**
 * Created by gardenia on 2/17/2018.
 */

public class Adaptor extends RecyclerView.Adapter<Adaptor.ViewHolder> {
    Context context;
    List<ListItem>listItems;

    public Adaptor(Context context, List<ListItem> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
View view= LayoutInflater.from(parent.getContext())
        .inflate(R.layout.list_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItem item=listItems.get(position);
        holder.name.setText(item.getName());
        holder.fname.setText(item.getFamilyName());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,fname;
        public ViewHolder(View itemView) {
            super(itemView);

            name=(TextView)itemView.findViewById(R.id.nameId);
            fname=(TextView)itemView.findViewById(R.id.famil_nameId);
        }
    }
}
