import scala.beans.BeanProperty

class Person {  
  @BeanProperty var name: String = _
  @BeanProperty var hhh: String = _
}

val fred = new Person
fred.setName("Fred")
fred.getName
fred.setHhh("hahah")
fred.getHhh