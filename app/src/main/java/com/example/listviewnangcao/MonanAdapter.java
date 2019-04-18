package com.example.listviewnangcao;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MonanAdapter extends ArrayAdapter<Monan> {

    public MonanAdapter(Context context, int resource, List<Monan> objects) {
        super(context, resource, objects);
    }

    class ViewHolder{
        TextView txtTenmonan,txtGiamonan;
        ImageView imgMonan;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView ==null){
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.dong_listview_monan,null);
            viewHolder = new ViewHolder();
            viewHolder.txtTenmonan = convertView.findViewById(R.id.textviewTenmonan);
            viewHolder.txtGiamonan = convertView.findViewById(R.id.textviewGiamonan);
            viewHolder.imgMonan = convertView.findViewById(R.id.imageviewMonan);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Monan monan = getItem(position);
        viewHolder.txtTenmonan.setText(monan.getTen());
        viewHolder.txtGiamonan.setText(monan.getGia() + " đồng");
        viewHolder.imgMonan.setImageResource(monan.getHinhanh());
        return convertView;
    }
}
