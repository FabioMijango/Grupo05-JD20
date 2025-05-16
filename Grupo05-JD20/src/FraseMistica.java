public class FraseMistica {
    //Frases místicas
    private static final String[] frasesMisticas = {
            "El portal al reino sumergido se abrirá cuando el sol cruce la cima del monte hueco.",
            "Bajo la tercera luna de piedra, encontrarás la biblioteca olvidada del conocimiento prohibido.",
            "El mapa del tesoro está oculto en la última página del códice rojo, sellado por el sabio Alerion.",
            "Cuando las campanas de cristal resuenen al anochecer, la puerta de las ruinas eternas se revelará.",
            "Solo al recitar el verso perdido frente al espejo de obsidiana, se abrirá el sendero al santuario oculto.",
            "En la sombra del eclipse doble, renacerá el puente hacia el templo del tiempo olvidado.",
            "El grimorio de las almas errantes yace bajo la raíz más antigua del bosque silente.",
            "Al tocar la melodía ancestral con el laúd de ceniza, despertarás al guardián del umbral secreto.",
            "En la novena torre del castillo sin nombre, duerme el pergamino que revela el juicio de los antiguos.",
            "Solo bajo la lluvia de estrellas negras, la fuente del eco eterno mostrará su verdadero rostro."
    };

    // Métodos para obtener una frase mística aleatoria
    public static String obtenerFraseMistica() {
        int indiceAleatorio = (int) (Math.random() * frasesMisticas.length);
        return frasesMisticas[indiceAleatorio];
    }
}
