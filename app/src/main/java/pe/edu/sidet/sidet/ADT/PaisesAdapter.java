package pe.edu.sidet.sidet.ADT;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.edu.sidet.sidet.BE.PaisBE;
import pe.edu.sidet.sidet.R;

/**
 * Created by Administrador on 28/11/2015.
 */
public class PaisesAdapter extends ArrayAdapter{

    public PaisesAdapter(Context context, int resource, List datos) {
        super(context, resource, datos);
    }

    //CONTROL + O
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.model_pais,null);
        }

        PaisBE item = (PaisBE) getItem(position);
        ImageView imgpais = (ImageView) convertView.findViewById(R.id.imagePais);
        TextView txtnombre = (TextView) convertView.findViewById(R.id.name);

        imgpais.setImageResource(item.getDrawableimgID());
        txtnombre.setText(item.getNombre());
        return convertView;
    }
}
