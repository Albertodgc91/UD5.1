package Dom_Escritura_Ejemplo;

import java.io.File;
import java.io.IOException;

import javax.security.sasl.SaslException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
public class E5_0_7 {
public static void main(String[] args) throws Exception {

String xPathExpression = "//aprobado";

DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
Document documento = builder.parse(new File("actividad_propuesta_4_4.xsd\"); 
XPath xpath = XPathFactory.newInstance().newXPath();

NodeList nodos = (NodeList) xpath.evaluate(xPathExpression, documento,
XPathConstants.NODESET);
 for (int=0; i < list.getLenght(); i++)
	 System.outprintln(list.item(i).getAttributes().getNamedItem("nombre".getTextComentet()));

}
}