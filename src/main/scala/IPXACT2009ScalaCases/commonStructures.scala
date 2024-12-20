package IPXACT2009ScalaCases

// Generated by <a href="http://IPXACT2009scalaxb.org/">IPXACT2009scalaxb</a>.

sealed trait UsageTypeType

object UsageTypeType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2009scalaxb.XMLFormat[UsageTypeType]): UsageTypeType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: UsageTypeType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[UsageTypeType] = Seq(Nontyped, Typed)
}

case object Nontyped extends UsageTypeType { override def toString = "nontyped" }
case object Typed extends UsageTypeType { override def toString = "typed" }


/** Name value pair with data type information.
*/
case class NameValueTypeType(nameGroupStringSequence1: NameGroupStringSequence,
  value: Value,
  vendorExtensions: Option[VendorExtensions] = None,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends NameValuePairTypable {
  lazy val dataType = attributes.get("@dataType") map { _.as[String]}
  lazy val usageType = attributes("@usageType").as[UsageTypeType]
}

      
      


case class Parameters(parameter: Seq[NameValuePairTypable] = Nil)
      
      


case class VendorExtensions(any: Seq[IPXACT2009scalaxb.DataRecord[Any]] = Nil)
      
      


case class Value(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


/** Name and value type for use in resolvable elements
*/
trait NameValuePairTypable {
  def nameGroupStringSequence1: NameGroupStringSequence
  def value: Value
  def vendorExtensions: Option[VendorExtensions]
  def attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]]
}


/** Name and value type for use in resolvable elements
*/
case class NameValuePairType(nameGroupStringSequence1: NameGroupStringSequence,
  value: Value,
  vendorExtensions: Option[VendorExtensions] = None,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends NameValuePairTypable
      
      

case class NameGroupStringSequence(name: String,
  displayName: Option[String] = None,
  description: Option[String] = None)
      

case class NameGroupNMTOKENSequence(name: String,
  displayName: Option[String] = None,
  description: Option[String] = None)
      

case class NameGroupSequence(name: String,
  displayName: Option[String] = None,
  description: Option[String] = None)
      

case class NameGroupOptionalSequence(name: Option[String] = None,
  displayName: Option[String] = None,
  description: Option[String] = None)
      

case class NameGroupPortSequence(name: String,
  displayName: Option[String] = None,
  description: Option[String] = None)
      

