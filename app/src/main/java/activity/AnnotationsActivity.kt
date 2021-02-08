package activity

import adapter.AnnotationsAdapter
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import click.RecyclerItemClickListener
import com.example.concrete.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import model.Annotations
import java.util.*


class AnnotationsActivity : AppCompatActivity() {
    private var recyclerAnnotations: RecyclerView? = null
    private val annotationsList: MutableList<Annotations> = ArrayList()
    
    companion object {
        val PRODUCT_INTENT = "PRODUCT_INTENT"

        private fun openIntent(context: Context, a: Annotations) {
            val intent = Intent(context, AnnotationsDetailsActivity::class.java)
            intent.putExtra(PRODUCT_INTENT, a)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.annotations_layout)
        callFloatActionButton()
        recyclerAnnotations = findViewById(R.id.recyclerViewAnnotations)
        val description = intent.getStringExtra("description")
        annotationCreated()
        callRecyclerView()
    }

    private fun callRecyclerView() {
        val adapter = AnnotationsAdapter(annotationsList)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)
        recyclerAnnotations!!.layoutManager = layoutManager
        recyclerAnnotations!!.setHasFixedSize(true)
        recyclerAnnotations!!.adapter = adapter
        recyclerAnnotations!!.addOnItemTouchListener(
                RecyclerItemClickListener(
                        applicationContext,
                        recyclerAnnotations,
                        object : RecyclerItemClickListener.OnItemClickListener {
                            override fun onItemClick(view: View, position: Int) {
                                val annotations = annotationsList[position]
                                Toast.makeText(applicationContext, "" + annotations.title, Toast.LENGTH_SHORT).show()
                            }

                            override fun onLongItemClick(view: View, position: Int) {
                                Toast.makeText(applicationContext, "Teste longo", Toast.LENGTH_SHORT).show()
                            }

                            override fun onItemClick(adapterView: AdapterView<*>?, view: View, i: Int, l: Long) {}
                        }
                )
        )
    }

    private fun callFloatActionButton() {
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(applicationContext, AddAnnotationActivity::class.java)
            startActivity(intent)
        }
    }

    fun annotationCreated() {
        var annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
        annotations = Annotations("Teste", "teste")
        annotationsList.add(annotations)
    }
}

