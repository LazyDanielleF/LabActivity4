package com.iics1154ita.gazo.daniellefrancisco.labactivity4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class AndroidVersionsAdapter extends ArrayAdapter<AndroidVersions> {
    Context mContext;
    int mResouce;

    public AndroidVersionsAdapter(@NonNull Context context, int resource, @NonNull List<AndroidVersions> objects) {
        super(context, resource, objects);
        mContext = context;
        mResouce = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int image = getItem(position).getLogo();
        String name = getItem(position).getName();
        String version = getItem(position).getVersion();
        String api = getItem(position).getApi();
        String releaseDate = getItem(position).getReleaseDate();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResouce, parent, false);

        TextView tvName = convertView.findViewById(R.id.textView);
        TextView tvVersion = convertView.findViewById(R.id.textView2);
        TextView tvAPI = convertView.findViewById(R.id.textView3);
        TextView tvReleaseDate = convertView.findViewById(R.id.textView4);
        ImageView ivLogo = convertView.findViewById(R.id.imageView);

        ivLogo.setImageResource(image);
        tvName.setText(name);
        tvAPI.setText(api);
        tvVersion.setText(version);
        tvReleaseDate.setText(releaseDate);

        return convertView;
//        return super.getView(position, convertView, parent);
    }
}
