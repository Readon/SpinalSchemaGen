// Generated by <a href="http://IPXACT2022scalaxb.org/">IPXACT2022scalaxb</a>.
package IPXACT2022ScalaCases

case class Assertion(nameGroupSequence1: IPXACT2022ScalaCases.NameGroupSequence,
  assert: IPXACT2022ScalaCases.UnsignedBitExpression,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Assertions(assertion: Seq[IPXACT2022ScalaCases.Assertion] = Nil)
      
      

sealed trait Level

object Level {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.Level]): Level = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: Level) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[Level] = Seq(LowValue, HighValue)
}

case object LowValue extends Level { override def toString = "low" }
case object HighValue extends Level { override def toString = "high" }


case class IsReset(value: Boolean,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val level = attributes.get("@level") map { _.as[Level]}
}

      
      

sealed trait LevelType

object LevelType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.LevelType]): LevelType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: LevelType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[LevelType] = Seq(LowValue2, HighValue2)
}

case object LowValue2 extends LevelType { override def toString = "low" }
case object HighValue2 extends LevelType { override def toString = "high" }


case class IsClockEn(value: Boolean,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val level = attributes.get("@level") map { _.as[LevelType]}
}

      
      

sealed trait LevelType2

object LevelType2 {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.LevelType2]): LevelType2 = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: LevelType2) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[LevelType2] = Seq(LowValue3, HighValue3)
}

case object LowValue3 extends LevelType2 { override def toString = "low" }
case object HighValue3 extends LevelType2 { override def toString = "high" }


case class IsPowerEn(value: Boolean,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val level = attributes.get("@level") map { _.as[LevelType2]}
  lazy val powerDomainRef = attributes.get("@powerDomainRef") map { _.as[String]}
}

      
      

sealed trait FlowType

object FlowType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.FlowType]): FlowType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: FlowType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[FlowType] = Seq(Creditu45return, Ready, Busy, UserValue)
}

case object Creditu45return extends FlowType { override def toString = "credit-return" }
case object Ready extends FlowType { override def toString = "ready" }
case object Busy extends FlowType { override def toString = "busy" }
case object UserValue extends FlowType { override def toString = "user" }


case class IsFlowControl(value: Boolean,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val flowType = attributes.get("@flowType") map { _.as[FlowType]}
  lazy val user = attributes.get("@user") map { _.as[String]}
}

      
      


case class IsUser(value: Boolean,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val user = attributes.get("@user") map { _.as[String]}
}

      
      


case class QualifierType(isAddress: Option[Boolean] = None,
  isData: Option[Boolean] = None,
  isClock: Option[Boolean] = None,
  isReset: Option[IPXACT2022ScalaCases.IsReset] = None,
  isValid: Option[Boolean] = None,
  isInterrupt: Option[Boolean] = None,
  isClockEn: Option[IPXACT2022ScalaCases.IsClockEn] = None,
  isPowerEn: Option[IPXACT2022ScalaCases.IsPowerEn] = None,
  isOpcode: Option[Boolean] = None,
  isProtection: Option[Boolean] = None,
  isFlowControl: Option[IPXACT2022ScalaCases.IsFlowControl] = None,
  isUser: Option[IPXACT2022ScalaCases.IsUser] = None,
  isRequest: Option[Boolean] = None,
  isResponse: Option[Boolean] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Parameters(parameter: Seq[IPXACT2022ScalaCases.ParameterType] = Nil)
      
      


case class VendorExtensions(any: Seq[IPXACT2022scalaxb.DataRecord[Any]] = Nil)
      
      


case class ViewRef2(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Index(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends UnsignedIntExpressionable {
  lazy val minimum = attributes.get("@minimum") map { _.as[Int]}
  lazy val maximum = attributes.get("@maximum") map { _.as[Int]}
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Indices(index: Seq[IPXACT2022ScalaCases.Index] = Nil)
      
      


case class PortAccessHandle(viewRef: Seq[IPXACT2022ScalaCases.ViewRef2] = Nil,
  indices: Option[IPXACT2022ScalaCases.Indices] = None,
  slices: IPXACT2022ScalaCases.PortSlicesType,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val force = attributes("@force").as[Boolean]
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class ViewRef3(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class SlicedAccessHandle(viewRef: Seq[IPXACT2022ScalaCases.ViewRef3] = Nil,
  slices: IPXACT2022ScalaCases.SlicesType,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val force = attributes("@force").as[Boolean]
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class ViewRef4(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class PathSegments(pathSegment: Seq[IPXACT2022ScalaCases.PathSegmentType] = Nil)
      
      


case class SimpleAccessHandle(viewRef: Seq[IPXACT2022ScalaCases.ViewRef4] = Nil,
  pathSegments: IPXACT2022ScalaCases.PathSegments,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


/** Each slice specifies the HDL path for part of the parent IP-XACT object. The slices must be concatenated to calculate the entire path. If there is only one slice, it is assumed to be the path for the entire IP-XACT object.
*/
case class SlicesType(slice: Seq[IPXACT2022ScalaCases.SliceType] = Nil,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class PathSegments2(pathSegment: Seq[IPXACT2022ScalaCases.PathSegmentType] = Nil)
      
      


/** Contains the HDL path information for a slice of the IP-XACT object. 
*/
case class SliceType(pathSegments: IPXACT2022ScalaCases.PathSegments2,
  range: Option[IPXACT2022ScalaCases.RangeType] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


/** Identifies one level of hierarchy in the view specifed by viewNameRef. This is a simple name and optionally some indices into a multi dimensional element.
*/
case class PathSegmentType(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends UnresolvedStringExpressionable {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


/** Each slice specifies the HDL path for part of the parent IP-XACT object. The slices must be concatenated to calculate the entire path. If there is only one slice, it is assumed to be the path for the entire IP-XACT object.
*/
case class PortSlicesType(slice: Seq[IPXACT2022ScalaCases.PortSliceType] = Nil)
      
      


case class PathSegments3(pathSegment: Seq[IPXACT2022ScalaCases.PortPathSegmentType] = Nil)
      
      


/** Contains the HDL path information for a slice of the IP-XACT object. 
*/
case class PortSliceType(pathSegments: IPXACT2022ScalaCases.PathSegments3,
  range: Option[IPXACT2022ScalaCases.RangeType] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


/** Identifies one level of hierarchy in the view specifed by viewNameRef. This is a simple name and optionally some indices into a multi dimensional element.
*/
case class PortPathSegmentType(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends StringExpressionable {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class ParameterType(nameGroupStringSequence1: IPXACT2022ScalaCases.NameGroupStringSequence,
  vectors: Option[IPXACT2022ScalaCases.Vectors2] = None,
  arrays: Option[IPXACT2022ScalaCases.ConfigurableArrays] = None,
  value: IPXACT2022ScalaCases.StringExpressionable,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
  lazy val parameterId = attributes.get("@parameterId") map { _.as[String]}
  lazy val prompt = attributes.get("@prompt") map { _.as[String]}
  lazy val choiceRef = attributes.get("@choiceRef") map { _.as[String]}
  lazy val order = attributes.get("@order") map { _.as[Float]}
  lazy val configGroups = attributes.get("@configGroups") map { _.as[Seq[String]]}
  lazy val minimum = attributes.get("@minimum") map { _.as[String]}
  lazy val maximum = attributes.get("@maximum") map { _.as[String]}
  lazy val typeValue = attributes("@type").as[FormatType]
  lazy val sign = attributes.get("@sign") map { _.as[SignType]}
  lazy val prefix = attributes.get("@prefix") map { _.as[Prefix]}
  lazy val unit = attributes.get("@unit") map { _.as[UnitType]}
  lazy val resolve = attributes("@resolve").as[Resolve]
}

      
      

sealed trait UsageTypeType

object UsageTypeType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.UsageTypeType]): UsageTypeType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: UsageTypeType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[UsageTypeType] = Seq(Nontyped, Typed, Runtime)
}

case object Nontyped extends UsageTypeType { override def toString = "nontyped" }
case object Typed extends UsageTypeType { override def toString = "typed" }
case object Runtime extends UsageTypeType { override def toString = "runtime" }


case class Vector(left: IPXACT2022ScalaCases.UnsignedIntExpressionable,
  right: IPXACT2022ScalaCases.UnsignedIntExpressionable,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val vectorId = attributes.get("@vectorId") map { _.as[String]}
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Vectors(vector: Seq[IPXACT2022ScalaCases.Vector] = Nil)
      
      


/** Name value pair with data type information.
*/
case class ModuleParameterType(nameGroupStringSequence1: IPXACT2022ScalaCases.NameGroupStringSequence,
  vectors: Option[IPXACT2022ScalaCases.Vectors] = None,
  arrays: Option[IPXACT2022ScalaCases.ModuleParameterArrays] = None,
  value: IPXACT2022ScalaCases.StringExpressionable,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
  lazy val parameterId = attributes.get("@parameterId") map { _.as[String]}
  lazy val prompt = attributes.get("@prompt") map { _.as[String]}
  lazy val choiceRef = attributes.get("@choiceRef") map { _.as[String]}
  lazy val order = attributes.get("@order") map { _.as[Float]}
  lazy val configGroups = attributes.get("@configGroups") map { _.as[Seq[String]]}
  lazy val minimum = attributes.get("@minimum") map { _.as[String]}
  lazy val maximum = attributes.get("@maximum") map { _.as[String]}
  lazy val typeValue = attributes("@type").as[FormatType]
  lazy val sign = attributes.get("@sign") map { _.as[SignType]}
  lazy val prefix = attributes.get("@prefix") map { _.as[Prefix]}
  lazy val unit = attributes.get("@unit") map { _.as[UnitType]}
  lazy val resolve = attributes("@resolve").as[Resolve]
  lazy val dataType = attributes.get("@dataType") map { _.as[String]}
  lazy val usageType = attributes("@usageType").as[UsageTypeType]
  lazy val dataTypeDefinition = attributes.get("@dataTypeDefinition") map { _.as[String]}
  lazy val constrained = attributes.get("@constrained") map { _.as[Seq[String]]}
}

      
      


/** Name and value type for use in resolvable elements
*/
trait NameValuePairTypable {
  def nameGroupStringSequence1: IPXACT2022ScalaCases.NameGroupStringSequence
  def value: IPXACT2022ScalaCases.StringExpressionable
  def vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions]
  def xmlid: Option[String]
}


/** Name and value type for use in resolvable elements
*/
case class NameValuePairType(nameGroupStringSequence1: IPXACT2022ScalaCases.NameGroupStringSequence,
  value: IPXACT2022ScalaCases.StringExpressionable,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends NameValuePairTypable {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Vector2(left: IPXACT2022ScalaCases.UnsignedIntExpressionable,
  right: IPXACT2022ScalaCases.UnsignedIntExpressionable,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Vectors2(vector: Seq[IPXACT2022ScalaCases.Vector2] = Nil)
      
      


case class RangeType(left: IPXACT2022ScalaCases.UnsignedIntExpressionable,
  right: IPXACT2022ScalaCases.UnsignedIntExpressionable) extends PartSelectOption
      
      


case class PartSelect(partselectoption: IPXACT2022scalaxb.DataRecord[IPXACT2022ScalaCases.PartSelectOption],
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      

case class PartSelectSequence1(indices: IPXACT2022ScalaCases.IndicesType,
  range: Option[IPXACT2022ScalaCases.RangeType] = None) extends PartSelectOption
      

trait PartSelectOption

case class SubPortReference(partSelect: Option[IPXACT2022ScalaCases.PartSelect] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val subPortRef = attributes("@subPortRef").as[String]
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class AddressBlockRef(indices: Option[IPXACT2022ScalaCases.IndicesType] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val addressBlockRef = attributes("@addressBlockRef").as[String]
}

      
      


case class RegisterFileRef(indices: Option[IPXACT2022ScalaCases.IndicesType] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val registerFileRef = attributes("@registerFileRef").as[String]
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class RegisterRef(indices: Option[IPXACT2022ScalaCases.IndicesType] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val registerRef = attributes("@registerRef").as[String]
}

      
      


case class AlternateRegisterRef(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val alternateRegisterRef = attributes("@alternateRegisterRef").as[String]
}

      
      


case class FieldRef(indices: Option[IPXACT2022ScalaCases.IndicesType] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val fieldRef = attributes("@fieldRef").as[String]
}

      
      


case class BankRef(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val bankRef = attributes("@bankRef").as[String]
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class MemoryRemapRef(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val memoryRemapRef = attributes("@memoryRemapRef").as[String]
}

      
      


case class AddressSpaceRef(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends FieldSliceReferenceGroupOption1 {
  lazy val addressSpaceRef = attributes("@addressSpaceRef").as[String]
}

      
      


case class MemoryMapRef(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val memoryMapRef = attributes("@memoryMapRef").as[String]
}

      
      


case class AddressSpaceRef2(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends FieldReferenceGroupOption1 {
  lazy val addressSpaceRef = attributes("@addressSpaceRef").as[String]
}

      
      


case class MemoryMapRef2(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val memoryMapRef = attributes("@memoryMapRef").as[String]
}

      
      


case class ArrayType(left: IPXACT2022ScalaCases.UnsignedIntExpressionable,
  right: IPXACT2022ScalaCases.UnsignedIntExpressionable,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class ConfigurableArrays(array: Seq[IPXACT2022ScalaCases.ArrayType] = Nil)
      
      


case class ArrayType2(left: IPXACT2022ScalaCases.UnsignedIntExpressionable,
  right: IPXACT2022ScalaCases.UnsignedIntExpressionable,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val arrayId = attributes.get("@arrayId") map { _.as[String]}
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class ModuleParameterArrays(array: Seq[IPXACT2022ScalaCases.ArrayType2] = Nil)
      
      


case class IndicesType(index: Seq[IPXACT2022ScalaCases.Index2] = Nil)
      
      


case class ExternalModeReference(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val modeRef = attributes("@modeRef").as[String]
}

      
      


case class ModeReference(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val modeRef = attributes("@modeRef").as[String]
}

      
      


case class ModeLink(externalModeReference: IPXACT2022ScalaCases.ExternalModeReference,
  modeReference: IPXACT2022ScalaCases.ModeReference,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class ModeLinks(modeLink: Seq[IPXACT2022ScalaCases.ModeLink] = Nil)
      
      


case class ExternalViewReference(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val viewRef = attributes("@viewRef").as[String]
}

      
      


case class ViewReference(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val viewRef = attributes("@viewRef").as[String]
}

      
      


case class ViewLink(externalViewReference: IPXACT2022ScalaCases.ExternalViewReference,
  viewReference: IPXACT2022ScalaCases.ViewReference,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class ViewLinks(viewLink: Seq[IPXACT2022ScalaCases.ViewLink] = Nil)
      
      


case class ExternalResetTypeReference(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val resetTypeRef = attributes("@resetTypeRef").as[String]
}

      
      


case class ResetTypeReference(attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val resetTypeRef = attributes("@resetTypeRef").as[String]
}

      
      


case class ResetTypeLink(externalResetTypeReference: IPXACT2022ScalaCases.ExternalResetTypeReference,
  resetTypeReference: IPXACT2022ScalaCases.ResetTypeReference,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class ResetTypeLinks(resetTypeLink: Seq[IPXACT2022ScalaCases.ResetTypeLink] = Nil)
      
      


case class Index2(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends UnsignedIntExpressionable {
  lazy val minimum = attributes.get("@minimum") map { _.as[Int]}
  lazy val maximum = attributes.get("@maximum") map { _.as[Int]}
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      

sealed trait Prefix

object Prefix {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.Prefix]): Prefix = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: Prefix) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[Prefix] = Seq(Deca, Hecto, Kilo, Mega, Giga, Tera, Peta, Exa, Zetta, Yotta, Deci, Centi, Milli, Micro, Nano, Pico, Femto, Atto, Zepto, Yocto)
}

case object Deca extends Prefix { override def toString = "deca" }
case object Hecto extends Prefix { override def toString = "hecto" }
case object Kilo extends Prefix { override def toString = "kilo" }
case object Mega extends Prefix { override def toString = "mega" }
case object Giga extends Prefix { override def toString = "giga" }
case object Tera extends Prefix { override def toString = "tera" }
case object Peta extends Prefix { override def toString = "peta" }
case object Exa extends Prefix { override def toString = "exa" }
case object Zetta extends Prefix { override def toString = "zetta" }
case object Yotta extends Prefix { override def toString = "yotta" }
case object Deci extends Prefix { override def toString = "deci" }
case object Centi extends Prefix { override def toString = "centi" }
case object Milli extends Prefix { override def toString = "milli" }
case object Micro extends Prefix { override def toString = "micro" }
case object Nano extends Prefix { override def toString = "nano" }
case object Pico extends Prefix { override def toString = "pico" }
case object Femto extends Prefix { override def toString = "femto" }
case object Atto extends Prefix { override def toString = "atto" }
case object Zepto extends Prefix { override def toString = "zepto" }
case object Yocto extends Prefix { override def toString = "yocto" }

sealed trait UnitType

object UnitType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.UnitType]): UnitType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: UnitType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[UnitType] = Seq(Second, Ampere, Kelvin, Hertz, Joule, Watt, Coulomb, Volt, Farad, Ohm, Siemens, Henry, Celsius)
}

case object Second extends UnitType { override def toString = "second" }
case object Ampere extends UnitType { override def toString = "ampere" }
case object Kelvin extends UnitType { override def toString = "kelvin" }
case object Hertz extends UnitType { override def toString = "hertz" }
case object Joule extends UnitType { override def toString = "joule" }
case object Watt extends UnitType { override def toString = "watt" }
case object Coulomb extends UnitType { override def toString = "coulomb" }
case object Volt extends UnitType { override def toString = "volt" }
case object Farad extends UnitType { override def toString = "farad" }
case object Ohm extends UnitType { override def toString = "ohm" }
case object Siemens extends UnitType { override def toString = "siemens" }
case object Henry extends UnitType { override def toString = "henry" }
case object Celsius extends UnitType { override def toString = "Celsius" }

sealed trait UnitTypeType

object UnitTypeType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.UnitTypeType]): UnitTypeType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: UnitTypeType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[UnitTypeType] = Seq(SecondValue, AmpereValue, KelvinValue, HertzValue, JouleValue, WattValue, CoulombValue, VoltValue, FaradValue, OhmValue, SiemensValue, HenryValue, CelsiusValue)
}

case object SecondValue extends UnitTypeType { override def toString = "second" }
case object AmpereValue extends UnitTypeType { override def toString = "ampere" }
case object KelvinValue extends UnitTypeType { override def toString = "kelvin" }
case object HertzValue extends UnitTypeType { override def toString = "hertz" }
case object JouleValue extends UnitTypeType { override def toString = "joule" }
case object WattValue extends UnitTypeType { override def toString = "watt" }
case object CoulombValue extends UnitTypeType { override def toString = "coulomb" }
case object VoltValue extends UnitTypeType { override def toString = "volt" }
case object FaradValue extends UnitTypeType { override def toString = "farad" }
case object OhmValue extends UnitTypeType { override def toString = "ohm" }
case object SiemensValue extends UnitTypeType { override def toString = "siemens" }
case object HenryValue extends UnitTypeType { override def toString = "henry" }
case object CelsiusValue extends UnitTypeType { override def toString = "Celsius" }

sealed trait Resolve

object Resolve {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.Resolve]): Resolve = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: Resolve) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[Resolve] = Seq(Immediate, UserValue2, Generated)
}

case object Immediate extends Resolve { override def toString = "immediate" }
case object UserValue2 extends Resolve { override def toString = "user" }
case object Generated extends Resolve { override def toString = "generated" }

case class NameGroupStringSequence(name: String,
  displayName: Option[String] = None,
  shortDescription: Option[String] = None,
  description: Option[String] = None)
      

trait FieldSliceReferenceGroupOption1
case class FieldSliceReferenceGroupSequence2(memoryMapRef: IPXACT2022ScalaCases.MemoryMapRef,
  memoryRemapRef: Option[IPXACT2022ScalaCases.MemoryRemapRef] = None) extends FieldSliceReferenceGroupOption1
      

case class FieldSliceReferenceGroupSequence(fieldslicereferencegroupoption1: IPXACT2022scalaxb.DataRecord[IPXACT2022ScalaCases.FieldSliceReferenceGroupOption1],
  bankRef: Seq[IPXACT2022ScalaCases.BankRef] = Nil,
  addressBlockRef: IPXACT2022ScalaCases.AddressBlockRef,
  registerFileRef: Seq[IPXACT2022ScalaCases.RegisterFileRef] = Nil,
  registerRef: IPXACT2022ScalaCases.RegisterRef,
  alternateRegisterRef: Option[IPXACT2022ScalaCases.AlternateRegisterRef] = None,
  fieldRef: IPXACT2022ScalaCases.FieldRef,
  range: Option[IPXACT2022ScalaCases.RangeType] = None)
      

case class NameGroupNMTOKENSequence(name: String,
  displayName: Option[String] = None,
  shortDescription: Option[String] = None,
  description: Option[String] = None)
      

case class NameGroupSequence(name: String,
  displayName: Option[String] = None,
  shortDescription: Option[String] = None,
  description: Option[String] = None)
      

case class NameGroupOptionalSequence(name: Option[String] = None,
  displayName: Option[String] = None,
  shortDescription: Option[String] = None,
  description: Option[String] = None)
      

case class NameGroupPortSequence(name: String,
  displayName: Option[String] = None,
  shortDescription: Option[String] = None,
  description: Option[String] = None)
      

case class FieldReferenceGroupSequence2(memoryMapRef: IPXACT2022ScalaCases.MemoryMapRef2,
  memoryRemapRef: Option[IPXACT2022ScalaCases.MemoryRemapRef] = None) extends FieldReferenceGroupOption1
      

trait FieldReferenceGroupOption1
case class FieldReferenceGroupSequence(fieldreferencegroupoption1: Option[IPXACT2022scalaxb.DataRecord[IPXACT2022ScalaCases.FieldReferenceGroupOption1]] = None,
  bankRef: Seq[IPXACT2022ScalaCases.BankRef] = Nil,
  addressBlockRef: Option[IPXACT2022ScalaCases.AddressBlockRef] = None,
  registerFileRef: Seq[IPXACT2022ScalaCases.RegisterFileRef] = Nil,
  registerRef: Option[IPXACT2022ScalaCases.RegisterRef] = None,
  alternateRegisterRef: Option[IPXACT2022ScalaCases.AlternateRegisterRef] = None,
  fieldRef: IPXACT2022ScalaCases.FieldRef)
      


case class Parameteru46resolveu46att(resolve: IPXACT2022ScalaCases.Resolve)


case class Parameteru46att(parameterId: Option[String] = None,
  prompt: Option[String] = None,
  choiceRef: Option[String] = None,
  order: Option[Float] = None,
  configGroups: Option[Seq[String]] = None,
  minimum: Option[String] = None,
  maximum: Option[String] = None,
  typeValue: IPXACT2022ScalaCases.FormatType,
  sign: Option[IPXACT2022ScalaCases.SignType] = None,
  prefix: Option[IPXACT2022ScalaCases.Prefix] = None,
  unit: Option[IPXACT2022ScalaCases.UnitType] = None)


case class Parameteru46unitu46att(unit: Option[IPXACT2022ScalaCases.UnitTypeType] = None)
