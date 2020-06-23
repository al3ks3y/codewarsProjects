import org.junit.Test
import kotlin.test.assertEquals

class  HelpTheLibrarian {

    object StockList {
        fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
            //initMap
            if(lstOfArt.isEmpty()||lstOfCat.isEmpty()){return ""}
            var map:HashMap<Char, Int> = LinkedHashMap()
            lstOfCat.forEach { l-> map.put(l.get(0),0) }

            lstOfArt.forEach { a-> if(map.get(a[0])!=null&&a.split(" ")[0].length>=2){
                val before:Int= map.get(a[0])!!
                map.put(a[0], before+ a.split(" ")[1].toInt())
                }
            }
            var result:String=""
            map.forEach{(c, u)->  result=result.plus("(" + c +" : "+ u +") - ")}
            result=result.substring(0,result.length-2)
            return  result.trim()
        }
    }
}
