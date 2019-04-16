package com.example.listviewnangcao;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonanAdapter extends BaseAdapter {
    ArrayList<Monan> mangmonan;
    Context context;
    //constructor == phuong thức khởi tạo
    public MonanAdapter(ArrayList<Monan> mangmonan , Context context) {
        this.mangmonan = mangmonan;
        this.context = context;
    }
    @Override
    public int getCount() {
        return mangmonan.size();
    }

    @Override
    public Object getItem(int position) {
        return mangmonan.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.dong_listview_monan,null);

        TextView txtTenmonan = convertView.findViewById(R.id.textviewTenmonan);
        TextView txtGiamonan = convertView.findViewById(R.id.textviewGiamonan);
        ImageView imgMonan = convertView.findViewById(R.id.imageviewMonan);

        Monan monan = (Monan) getItem(position);
        txtTenmonan.setText(monan.getTen());
        txtGiamonan.setText(monan.getGia() + " đồng");
        imgMonan.setImageResource(monan.getHinhanh());
        return convertView;
    }
}
