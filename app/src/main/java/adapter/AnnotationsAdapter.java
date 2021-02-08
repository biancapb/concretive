package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import model.Annotations;
import com.example.concrete.R;

import java.util.List;

public class AnnotationsAdapter extends RecyclerView.Adapter<AnnotationsAdapter.MyViewHolder> {

    private List<Annotations> annotationsList;

    public AnnotationsAdapter(List<Annotations> list) {
        this.annotationsList = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.annotations_list, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        Filme filme = listaFilmes.get(position);
//
//        holder.titulo.setText(filme.getTitulo());
//        holder.genero.setText(filme.getGenero());
//        holder.ano.setText(filme.getAno());


        Annotations annotations = annotationsList.get(position);

        holder.titleAnnotation.setText(annotations.getTitle());
        holder.descriptionAnnotation.setText(annotations.getDescription());

    }

    @Override
    public int getItemCount() {
        return annotationsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titleAnnotation, descriptionAnnotation;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titleAnnotation = itemView.findViewById(R.id.title_template);
            descriptionAnnotation = itemView.findViewById(R.id.description_template);
        }
}


}