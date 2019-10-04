package mn.data.poc

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("mn.data.poc")
                .mainClass(Application.javaClass)
                .start()
    }
}