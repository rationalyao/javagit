import scala.collection.mutable.ArrayBuffer

class NetWork {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]()
  }
  
  private val members = new ArrayBuffer[Member]()
  
  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

val chatter = new NetWork
val myFace= new NetWork

val fred = chatter.join("Fred")
val wilma = chatter.join("Wilma")

fred.contacts += wilma

val barney = myFace.join("Fred")
// no fred.contacts += barney   

class NetWork1 {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]()
  }
  
  private val members = new ArrayBuffer[Member]()
  
  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

val chatter1 = new NetWork1
val myFace1 = new NetWork1

val fred1 = chatter1.join("Fred")
val wilma1 = chatter1.join("Wilma")

fred1.contacts += wilma1
val barney1 = myFace1.join("Barney")
// fred1.contacts  barney1


















































































