/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kallistogui;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


public class FileListItem{
    private String name;
    private String loc;

    public FileListItem(String name, String loc) {
        this.name = name;
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public String getLoc() {
        return loc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
    public String serialize(){
        String nameStr = "<name>" + this.name + "</name>";
        String locStr = "<loc>" + this.loc + "</loc>";
        
        return "<item>"+nameStr+locStr+"</item>";
    }
}
