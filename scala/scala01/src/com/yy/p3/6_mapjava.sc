import scala.collection.JavaConverters._

val ids = java.time.ZoneId.SHORT_IDS.asScala

val props = System.getProperties.asScala

import java.awt.font.TextAttribute._  // Import keys for map below
val attrs = Map(FAMILY -> "Serif", SIZE -> 12)  // A Scala map
val font = ne java.awt.Font(attrs.asJava)