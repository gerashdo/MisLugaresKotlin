package curso.kotlin.materialdesignscroll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PreferenciasActivity:AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction().replace(android.R.id.content,PreferenciasFragment()).commit()
    }
}