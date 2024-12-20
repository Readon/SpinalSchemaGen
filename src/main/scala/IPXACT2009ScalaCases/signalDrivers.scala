package IPXACT2009ScalaCases

// Generated by <a href="http://IPXACT2009scalaxb.org/">IPXACT2009scalaxb</a>.


case class DefaultValue(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends DriverTypeOption {
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
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class ClockDriver(clockPeriod: ClockPeriod,
  clockPulseOffset: ClockPulseOffset,
  clockPulseValue: ClockPulseValue,
  clockPulseDuration: ClockPulseDuration,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends ClockDriverTypable with DriverTypeOption {
  lazy val clockName = attributes.get("@clockName") map { _.as[String]}
}

      
      


case class SingleShotOffset(value: Seq[Double],
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
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class SingleShotValue(value: String,
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
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class SingleShotDuration(value: Seq[Double],
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
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class SingleShotDriver(singleShotOffset: SingleShotOffset,
  singleShotValue: SingleShotValue,
  singleShotDuration: SingleShotDuration) extends DriverTypeOption
      
      

sealed trait DriverTypeType

object DriverTypeType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2009scalaxb.XMLFormat[DriverTypeType]): DriverTypeType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: DriverTypeType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[DriverTypeType] = Seq(Clock, SingleShot, AnyType)
}

case object Clock extends DriverTypeType { override def toString = "clock" }
case object SingleShot extends DriverTypeType { override def toString = "singleShot" }
case object AnyType extends DriverTypeType { override def toString = "any" }


case class RequiresDriver(value: Boolean,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends WireOption {
  lazy val driverType = attributes("@driverType").as[DriverTypeType]
}

      
      


/** Wire port driver type.
*/
case class DriverType(drivertypeoption: Option[IPXACT2009scalaxb.DataRecord[DriverTypeOption]] = None)
      
      

trait DriverTypeOption

case class ClockPeriod(value: Seq[Double],
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val units = attributes("@units").as[DelayValueUnitType]
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
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class ClockPulseOffset(value: Seq[Double],
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val units = attributes("@units").as[DelayValueUnitType]
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
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class ClockPulseValue(value: String,
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
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class ClockPulseDuration(value: Seq[Double],
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val units = attributes("@units").as[DelayValueUnitType]
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
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


trait ClockDriverTypable {
  def clockPeriod: ClockPeriod
  def clockPulseOffset: ClockPulseOffset
  def clockPulseValue: ClockPulseValue
  def clockPulseDuration: ClockPulseDuration
}


case class ClockDriverType(clockPeriod: ClockPeriod,
  clockPulseOffset: ClockPulseOffset,
  clockPulseValue: ClockPulseValue,
  clockPulseDuration: ClockPulseDuration) extends ClockDriverTypable
      
      


case class OtherClockDriver(clockPeriod: ClockPeriod,
  clockPulseOffset: ClockPulseOffset,
  clockPulseValue: ClockPulseValue,
  clockPulseDuration: ClockPulseDuration,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends ClockDriverTypable {
  lazy val clockName = attributes("@clockName").as[String]
  lazy val clockSource = attributes.get("@clockSource") map { _.as[String]}
}

      
      

