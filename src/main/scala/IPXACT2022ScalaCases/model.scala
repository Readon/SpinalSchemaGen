// Generated by <a href="http://IPXACT2022scalaxb.org/">IPXACT2022scalaxb</a>.
package IPXACT2022ScalaCases

/** Design instantiation type.
*/
case class DesignInstantiationType(nameGroupNMTOKENSequence1: IPXACT2022ScalaCases.NameGroupNMTOKENSequence,
  designRef: IPXACT2022ScalaCases.ConfigurableLibraryRefType,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends InstantiationsGroupOption {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


/** Design configuration instantiation type.
*/
case class DesignConfigurationInstantiationType(nameGroupNMTOKENSequence1: IPXACT2022ScalaCases.NameGroupNMTOKENSequence,
  language: Option[IPXACT2022ScalaCases.LanguageType] = None,
  designConfigurationRef: IPXACT2022ScalaCases.ConfigurableLibraryRefType,
  parameters: Option[IPXACT2022ScalaCases.Parameters] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends InstantiationsGroupOption {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class ModuleParameters(moduleParameter: Seq[IPXACT2022ScalaCases.ModuleParameterType] = Nil)
      
      


case class ClearboxElementRefs(clearboxElementRef: Seq[IPXACT2022ScalaCases.ClearboxElementRefType] = Nil)
      
      


/** Component instantiation type
*/
case class ComponentInstantiationType(nameGroupNMTOKENSequence1: IPXACT2022ScalaCases.NameGroupNMTOKENSequence,
  isVirtual: Option[Boolean] = None,
  language: Option[IPXACT2022ScalaCases.LanguageType] = None,
  libraryName: Option[String] = None,
  packageName: Option[String] = None,
  moduleName: Option[String] = None,
  architectureName: Option[String] = None,
  configurationName: Option[String] = None,
  moduleParameters: Option[IPXACT2022ScalaCases.ModuleParameters] = None,
  defaultFileBuilder: Seq[IPXACT2022ScalaCases.FileBuilderType] = Nil,
  fileSetRef: Seq[IPXACT2022ScalaCases.FileSetRef] = Nil,
  constraintSetRef: Seq[IPXACT2022ScalaCases.ConstraintSetRef] = Nil,
  clearboxElementRefs: Option[IPXACT2022ScalaCases.ClearboxElementRefs] = None,
  parameters: Option[IPXACT2022ScalaCases.Parameters] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends InstantiationsGroupOption {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class EnvIdentifier(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class View(nameGroupNMTOKENSequence1: IPXACT2022ScalaCases.NameGroupNMTOKENSequence,
  envIdentifier: Seq[IPXACT2022ScalaCases.EnvIdentifier] = Nil,
  componentInstantiationRef: Option[String] = None,
  designInstantiationRef: Option[String] = None,
  designConfigurationInstantiationRef: Option[String] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Views(view: Seq[IPXACT2022ScalaCases.View] = Nil)
      
      


case class Instantiations(instantiationsoption: Seq[IPXACT2022scalaxb.DataRecord[Any]] = Nil)
      
      

trait InstantiationsOption

case class Ports(port: Seq[IPXACT2022ScalaCases.Port2] = Nil)
      
      


/** Model information.
			
*/
case class ModelType(views: Option[IPXACT2022ScalaCases.Views] = None,
  instantiations: Option[IPXACT2022ScalaCases.Instantiations] = None,
  ports: Option[IPXACT2022ScalaCases.Ports] = None)
      
      


case class EnvIdentifier2(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class View2(nameGroupNMTOKENSequence1: IPXACT2022ScalaCases.NameGroupNMTOKENSequence,
  envIdentifier: Seq[IPXACT2022ScalaCases.EnvIdentifier2] = Nil,
  componentInstantiationRef: Option[String] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Views2(view: Seq[IPXACT2022ScalaCases.View2] = Nil)
      
      


case class Instantiations2(componentInstantiation: Seq[IPXACT2022ScalaCases.ComponentInstantiationType] = Nil)
      
      


case class Ports2(port: Seq[IPXACT2022ScalaCases.AbstractorPortType] = Nil)
      
      


/** Model information for an abstractor.
*/
case class AbstractorModelType(views: Option[IPXACT2022ScalaCases.Views2] = None,
  instantiations: Option[IPXACT2022ScalaCases.Instantiations2] = None,
  ports: Option[IPXACT2022ScalaCases.Ports2] = None)
      
      


/**  Reference to a clearboxElement within a view. The 'name' attribute must refer to a clearboxElement defined within this component.  
*/
case class ClearboxElementRefType(location: Seq[IPXACT2022ScalaCases.SlicesType] = Nil,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val name = attributes("@name").as[String]
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class LanguageType(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val strict = attributes("@strict").as[Boolean]
}

      
      

trait InstantiationsGroupOption
