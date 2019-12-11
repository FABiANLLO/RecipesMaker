fun main(arg: Array<String>) {
    println(":: Bienvenido a Recipe Maker ::" )
    Salirprograma@ do {
        val menu = """
            Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent()
        println(menu)
        var opcion : Int = readLine()?.toInt() as Int
        when(opcion){
            1 ->{
                println("Hacer una receta")
                println("Agrega los Ingredientes")
                do {
                    val menu = """
                       1. Agua
                       2. Leche
                       3. Carne
                       4. Verduras
                       5. Frutas
                       6. Cereal
                       7. Huevos
                       8. Aceite
                       9. Salir al menu
                    """.trimIndent()
                    println(menu)
                    val ingre: Int = readLine()?.toInt() as Int
                    when(ingre){
                        1 -> println("Agua agregada")
                        2 -> println("Leche agregada")
                        3 -> println("Carne agregada")
                        4 -> println("Verduras agregadas")
                        5 -> println("Frutas agregada")
                        6 -> println("Cereal agregado")
                        7 -> println("Huevos agregados")
                        8 -> println("Aceite agregado")
                        9 -> println("Receta guardada...")
                        else -> println("Ingrediente no encontrado")
                    }
                }while (ingre!=9)
            }
            2 -> println("Ver mis recetas")
            else -> break@Salirprograma
        }
    }while (opcion!=3)
}