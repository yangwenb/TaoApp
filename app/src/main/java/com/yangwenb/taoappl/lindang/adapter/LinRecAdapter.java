package com.yangwenb.taoappl.lindang.adapter;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangwenb.taoappl.R;
import com.yangwenb.taoappl.lindang.bean.LinRecyBean;

import java.util.ArrayList;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public class LinRecAdapter extends RecyclerView.Adapter<LinRecAdapter.ViewHolder> {


    private ArrayList<LinRecyBean> recyList;

    public LinRecAdapter(ArrayList<LinRecyBean> recyList) {
        this.recyList = recyList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //加载布局
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lin_recy, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        //加载数据
        if (recyList != null && recyList.size() > 0) {
            LinRecyBean linRecyBean = recyList.get(i);
            viewHolder.text.setText(linRecyBean.getLin_text());
            viewHolder.title.setText(linRecyBean.getLin_title());
            Glide.with(viewHolder.text.getContext()).load(linRecyBean.getLinpicId()).into(viewHolder.pic);
        }
    }

    @Override
    public int getItemCount() {
        return recyList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView pic;
        private TextView title;
        private TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pic = itemView.findViewById(R.id.lin_rv_pic);
            title = itemView.findViewById(R.id.lin_rv_title);
            text = itemView.findViewById(R.id.lin_rv_text);
        }
    }
}
