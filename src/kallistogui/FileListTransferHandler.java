/*
Modify from Oracle DnD example code 
*/

package kallistogui;

import javax.xml.parsers.*;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.io.StringReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class FileListTransferHandler extends TransferHandler {
    public int getSourceActions(JComponent c){
        return TransferHandler.COPY_OR_MOVE;
    }
    
    @Override
    public Transferable createTransferable(JComponent c) {
        JList<FileListItem> source = (JList<FileListItem>) c;
        var myList = source.getSelectedValuesList();
        
        StringBuffer infoBuff = new StringBuffer();
        infoBuff.append("<info>");
        for(FileListItem item: myList){
            infoBuff.append(item.serialize());
        }
        infoBuff.append("</info>");
        return new StringSelection(infoBuff.toString());
    }
 
    public boolean canImport(TransferHandler.TransferSupport supp) {        
        return true;
    }
  
    public boolean importData(TransferHandler.TransferSupport info) {
        if (!info.isDrop()) {
            return false;
        }        
        
        JList<FileListItem> list = (JList<FileListItem>) info.getComponent();
        DefaultListModel<FileListItem> listModel = (DefaultListModel<FileListItem>) list.getModel();
        
        
        Transferable t = info.getTransferable();
        String data = "";
        try {
            data = (String)t.getTransferData(DataFlavor.stringFlavor);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        
        Document doc = convertStringToXMLDocument(data);
        
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("item");
        
        
        for(int i = 0; i < nList.getLength(); i++){
            Node node = nList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element el = (Element) node;
                String objName = el.getElementsByTagName("name").item(0).getTextContent();
                String objLoc = el.getElementsByTagName("loc").item(0).getTextContent();
                FileListItem newItem = new FileListItem( objName, objLoc );
                
                listModel.addElement(newItem);
            }
        }
        
        return true;
    }
    
        private static Document convertStringToXMLDocument(String xmlString)
    {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         
        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try
        {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();
             
            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}