/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckPMAP;

import java.util.LinkedList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author julieklein
 */
public class Loop {
    public LinkedList<String>getStringfromNodelist(NodeList nodelist){
        LinkedList<String> ll = new LinkedList<String>();
        for (int i=0; i<nodelist.getLength(); i++){
            Node node = nodelist.item(i);
            String nodevalue = node.getNodeValue();
            ll.add(nodevalue);
                    
        }
        
        
        return ll; 
        
    }
}
