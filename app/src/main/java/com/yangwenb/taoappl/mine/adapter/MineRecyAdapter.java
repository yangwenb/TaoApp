package com.yangwenb.taoappl.mine.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yangwenb.taoappl.R;
import com.yangwenb.taoappl.mine.bean.MineRecyBean;

import java.util.ArrayList;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public class MineRecyAdapter extends RecyclerView.Adapter<MineRecyAdapter.ViewHolder> {
    private ArrayList<MineRecyBean> recyList;

    public MineRecyAdapter(ArrayList<MineRecyBean> recyList) {
        this.recyList = recyList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //加载布局
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mine_recy, viewGroup, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        MineRecyBean mineRecyBean = recyList.get(i);
        if (mineRecyBean != null) {
            if (!mineRecyBean.getShu().isEmpty()){
                viewHolder.shu.setText(mineRecyBean.getShu());
            }
            viewHolder.title.setText(mineRecyBean.getTitle());
            Glide.with(viewHolder.itemView.getContext()).load(mineRecyBean.getPic()).into(viewHolder.pic);
        }

    }

    @Override
    public int getItemCount() {
        return recyList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView pic;
        private TextView title;
        private TextView shu;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            pic = itemView.findViewById(R.id.mine_rv_pic);
            title = itemView.findViewById(R.id.mine_rv_titlt);
            shu = itemView.findViewById(R.id.mine_rv_shu);
        }
    }
}
