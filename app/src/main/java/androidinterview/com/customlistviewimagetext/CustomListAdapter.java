package androidinterview.com.customlistviewimagetext;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.letslearn120.R;

public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final String[] alpha;
    private final Integer[] imgid;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid, String[] alpha) {
        super(context, R.layout.activity_mylist, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.alpha =alpha;
    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_mylist, null,true);

        TextView txtTitle1 = (TextView) rowView.findViewById(R.id.Itemname);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.Alpha);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        txtTitle1.setText(itemname[position]);
        txtTitle2.setText(alpha[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;

    };
}