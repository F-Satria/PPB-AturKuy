package com.example.aturkuy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class TugasAdapter extends RecyclerView.Adapter<TugasAdapter.TugasViewHolder> {


    private ArrayList<Tugas> arrayList;

    public TugasAdapter(ArrayList<Tugas> arrayList) {
        this.arrayList = arrayList;
    }

    public class TugasViewHolder extends RecyclerView.ViewHolder{
        private ImageView preview;
        private TextView txtNama, txtNpm, txtNoHp;

        public TugasViewHolder(View itemView) {
            super(itemView);
            preview = (ImageView) itemView.findViewById(R.id.itemPreview);
            txtNama = (TextView) itemView.findViewById(R.id.taskName);
            txtNpm = (TextView) itemView.findViewById(R.id.taskDeadline);
            txtNoHp = (TextView) itemView.findViewById(R.id.taskUrgensi);
        }
    }

    @Override
    public TugasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_ak, parent, false);
        return new TugasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TugasViewHolder holder, int position) {
        holder.preview.setImageResource(arrayList.get(position).getPreview());
        holder.txtNama.setText(arrayList.get(position).getNama());
        holder.txtNpm.setText(arrayList.get(position).getDeadline());
        holder.txtNoHp.setText(arrayList.get(position).getUrgensi());
    }

    @Override
    public int getItemCount() {
        return (arrayList != null) ? arrayList.size() : 0;
    }


}