package xmlparse;

import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XMLParser {

    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder;
    Document document;
    private int count = 0;
    private Element em1;
    private Element em2;

    public int convert(String source) {
        try {
            Locale l = new Locale("hi", "IN");
            Locale.setDefault(l);
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = (Document) documentBuilder.newDocument();
            Element rootElement = (Element) document.createElement("sarga");
            document.appendChild(rootElement);
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(source), "UTF-8"));
            Element em = null;
            String data = "";
            while (data != null) {
                data = bufReader.readLine();
                if (data == null) 
                    break;
                data = data.trim();
//                System.out.println(new Locale("hi", "IN", data).getDisplayVariant());
                if (count % 2 == 0) {
                    em1 = document.createElement("sloka");
                    em2 = document.createElement("sloka-number");
                    NumberFormat nf = NumberFormat.getIntegerInstance(l);
                    em2.appendChild(document.createTextNode(nf.format(count / 2 + 1)));
                    em1.appendChild(em2);
                    em = document.createElement("sloka-content");
                    em.appendChild(document.createTextNode(new Locale("hi", "IN", data).getDisplayVariant() + " | "));
                    count++;
                } else {
                    em.appendChild(document.createTextNode(new Locale("hi", "IN", data).getDisplayVariant()));
                    em1.appendChild(em);
                    rootElement.appendChild(em1);
                    count++;
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource sourced = new DOMSource(document);
            FileOutputStream fo = new FileOutputStream(new File(source + ".xml"));
            StreamResult result = new StreamResult(fo);
            transformer.transform(sourced, result);
            System.out.println("Conversion done");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 1;
    }
}
