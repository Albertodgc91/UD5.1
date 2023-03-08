package Dom_Escritura_Ejemplo;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

public class E5_20 {

	private Document crearDocument () {
		Document doc = null;
		
	DocumentBuilderFactory dbf =DocumentBuilderFactory.newDefaultInstance();
	return doc;

	 
 }
	
	private static void guardarDocFile (Document doc) {
		DOMSource domS = new DOMSource(doc);
		try {
			FileWriter fw = new FileWriter("./5.1.1.xml");
			StreamResult sr=new StreamResult(fw);
			TransformerFactory tf = TransformerFactory.newInstance();
			
			Transformer tr = tf.newTransformer();
			tr.setOutputProperty(OutputKeys.INDENT, "yes");
			
			
			tr.transform(domS, sr);
			
		} catch (IOException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	 
}