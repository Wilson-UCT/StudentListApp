package AlumnosAdapter;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView

class AlumnosAdapter(private val listaAlumnos: List<Alumno>) :
        RecyclerView.Adapter<AlumnosAdapter.AlumnoViewHolder>() {

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
    val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_alumno, parent, false)
    return AlumnoViewHolder(itemView)
}

override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
    val alumnoActual = listaAlumnos[position]
    holder.textNombre.text = alumnoActual.nombre
    holder.textEdad.text = "Edad: ${alumnoActual.edad}"
    holder.imageView.setImageResource(alumnoActual.fotoResId)
}

override fun getItemCount() = listaAlumnos.size

class AlumnoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textNombre: TextView = itemView.findViewById(R.id.text_name)
    val textEdad: TextView = itemView.findViewById(R.id.text_age)
    val imageView: ImageView = itemView.findViewById(R.id.image_view)
}
}

