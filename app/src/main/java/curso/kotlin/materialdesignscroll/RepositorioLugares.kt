package curso.kotlin.mislugares

interface RepositorioLugares {
    fun elemento (id: Int): Lugar // Devuelve el elemento dado su id
    fun aniade (lugar: Lugar) // Añade el elemento indicado
    fun nuevo (): Int // añade un elemento en blanco y devuelve su id
    fun borrador (id: Int) // Elimina el elemento con el id indicado
    fun tamanio (): Int // Devuelve el número de elementos
    fun actualiza (id: Int, lugar: Lugar) // Remplaza un elemento

    fun añadeEjemplos() {
        aniade(Lugar("Escuela Politécnica Superior de Gandía",
            "C/ Paranimf, 1 46730 Gandia (SPAIN)", GeoPunto(-0.166093,
                38.995656),TipoLugar.EDUCACION,"" , 962849300,"http://www.epsg.upv.es","Good", valoracion = 3f))
    }
}