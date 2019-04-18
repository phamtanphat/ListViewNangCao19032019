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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.dong_listview_monan,null);

        TextView txtTenmonan = convertView.findViewById(R.id.textviewTenmonan);
        TextView txtGiamonan = convertView.findViewById(R.id.textviewGiamonan);
        ImageView imgMonan = convertView.findViewById(R.id.imageviewMonan);

        Monan monan = getItem(position);
        txtTenmonan.setText(monan.getTen());
        txtGiamonan.setText(monan.getGia() + " đồng");
        imgMonan.setImageResource(monan.getHinhanh());
        return convertView;
    }
}
