package code.model

import net.liftweb.mapper._

class Parent extends LongKeyedMapper[Parent] with IdPK {
  def getSingleton = Parent
}

object Parent extends Parent with LongKeyedMetaMapper[Parent] with CRUDify[Long, Parent] {

}


class Child extends LongKeyedMapper[Child] with IdPK {
  def getSingleton = Child

  object parent extends MappedLongForeignKey(this, Parent)

}

object Child extends Child with LongKeyedMetaMapper[Child] with CRUDify[Long, Child] {

}
