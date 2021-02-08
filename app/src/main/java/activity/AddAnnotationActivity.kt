package activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.concrete.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import model.AddAnnotations
import model.Annotations
import kotlin.String as String
import com.example.concrete.R.*


class AddAnnotationActivity : AppCompatActivity() {

    companion object{
        val listAddAnnotations = mutableListOf<AddAnnotations>()

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_annotations_layout)


        /*
          this.dateAnnotation = date;
        this.qtdBalde = qtdBalde;
        this.qtdCimento = qtdCimento;
        this.qtdAgua = qtdAgua;
        this.totalBlocos = totalBlocos;
        this.descricao = descricao;

        */

//        val addDate = intent.data
//        val addBalde = intent.getIntExtra("qtdBalde", 0)
//        val addCimento = intent.getIntExtra("qtdCimento", 0)

        //val addAnnotation = AddAnnotations(addBalde, addCimento)
        //precisa pegar os itens e setar numa lista de anotaçoes

        //que isso aqui adicione os itens na lista
        val fabAddAnnotation: FloatingActionButton = findViewById(R.id.fabAddAnnotations)
        fabAddAnnotation.setOnClickListener {
//            val intent = Intent(applicationContext, AnnotationsActivity::class.java)
//            val textDescription = input_description.text.toString()
//            val params = Bundle()
//            params.putString("description", descricao)
        Toast.makeText(applicationContext, "Done", Toast.LENGTH_SHORT).show()

        }

    }
}