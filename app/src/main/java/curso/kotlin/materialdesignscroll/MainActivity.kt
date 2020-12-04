package curso.kotlin.materialdesignscroll

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        val btnAcercaDe = findViewById<Button>(R.id.btnAcercaDe)
        btnAcercaDe.setOnClickListener {
            lanzarAcercaDe()
        }
        val btnPreferencias = findViewById<Button>(R.id.btnPreferencias)
        btnPreferencias.setOnClickListener {
            lanzarPreferencias()
        }
        val btnSalir = findViewById<Button>(R.id.btnSalir)
        btnSalir.setOnClickListener{finish()}
        /**
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title = title
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        **/
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> {
                lanzarPreferencias()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun lanzarAcercaDe(view:View? = null) {
        val i = Intent(this,AcercaDeActivity::class.java)
        startActivity(i)
    }

    fun lanzarPreferencias(view:View? = null) {
        val i = Intent(this,PreferenciasActivity::class.java)
        startActivity(i)
    }
}