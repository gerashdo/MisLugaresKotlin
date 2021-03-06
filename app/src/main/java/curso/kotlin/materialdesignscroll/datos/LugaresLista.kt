package curso.kotlin.materialdesignscroll.datos

import curso.kotlin.materialdesignscroll.datos.RepositorioLugares
import curso.kotlin.materialdesignscroll.modelo.Lugar

class LugaresLista: RepositorioLugares {
    val listaLugares = mutableListOf<Lugar>()

    override fun elemento(id: Int): Lugar {
        return listaLugares[id]
    }

    override fun aniade(lugar: Lugar) {
        listaLugares.add(lugar)
    }

    override fun nuevo(): Int {
        val lugar = Lugar("Nuevo Lugar")
        listaLugares.add(lugar)
        return listaLugares.size - 1
    }

    override fun borrador(id: Int) {
        listaLugares.removeAt(id)
    }

    override fun tamanio(): Int {
        return listaLugares.size
    }

    override fun actualiza(id: Int, lugar: Lugar) {
        listaLugares[id] = lugar
    }
}