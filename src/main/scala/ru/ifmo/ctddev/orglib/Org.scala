package ru.ifmo.ctddev.orglib

import java.util.Date

/**
 * Created by volhovm on 11/21/15.
 */

/*
data OrgFile = OrgFile Name Path OrgText [OrgItem]
data OrgItem = OrgItem Heading [Tag] ItemCounter [OrgText] [OrgItem]
data ItemCounter = PercentCounter Double | IntCounter Int Int
newtype Tag = String
newtype Name = String
newtype Value = String
newtype Heading = String
data OrgText = SimpleText String | Property Prop | OrgTable Table
data OrgTable = String // for now
Prop = PropClock Clock
  | Logbook [Clock]
  | Deadline Clock
  | Scheduled Clock
  | AbstractProp Name Value

data Clock = Clock javaDate
*/
case class OrgFile(p: List[OrgText], items: List[OrgItem])

case class OrgItem(h: Heading, tags: List[Tag], counter: ItemCounter,
                   text: List[OrgText], children: List[OrgItem])

sealed trait ItemCounter
case class PercentCounter() extends ItemCounter
case class FractionCounter() extends ItemCounter

sealed trait OrgText
case class SimpleText(s: String) extends OrgText
case class MetaComment(n: Name, v: Value) extends OrgText
case class Property(o: OrgProperty) extends OrgText
case class OrgTable(s: String) extends OrgText

case class OrgDate(date: Date)

sealed trait OrgProperty
case class PropClock(c: OrgDate) extends OrgProperty
case class Logbook(from: OrgDate, to: OrgDate) extends OrgProperty
case class Deadline(d: OrgDate) extends OrgProperty
case class Scheduled(d: OrgDate) extends OrgProperty
case class AbstractProp(n: Name, v: Value)

