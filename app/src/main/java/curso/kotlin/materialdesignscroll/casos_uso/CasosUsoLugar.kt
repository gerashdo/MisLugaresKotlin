package curso.kotlin.materialdesignscroll.casos_uso

import android.app.Activity
import android.content.Intent
import curso.kotlin.materialdesignscroll.datos.RepositorioLugares

class CasosUsoLugar(val actividad:Activity, val lugares:RepositorioLugares) {
// OPERACIONES BASICAS
    fun mostrar(pos:Int) {
        val i = Intent(actividad, VistaLugarActivity::class.java)
        i.putExtra("pos",pos)
        actividad.startActivity(i)
    }
}