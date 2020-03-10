import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

object Tiempo {
//Realizamos la conexion con la web
    var doc: Document = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get()
    //Obtenemos los datos de los div de la pagina web
    var elementoTemperatura: Elements = doc.getElementsByClass("today_nowcard-temp")
    var temperatura:String = elementoTemperatura.text()
    var elementoTiempo: Elements = doc.getElementsByClass("today_nowcard-phrase")
    var tiempo:String = elementoTiempo.text()

    fun imprimir(){
    //Mostrar datos
        println("$temperatura $tiempo. Datos extraídos de ${doc.title()}")





    }
}