/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kallistogui;

import java.util.List;
/**
 *
 * @author Halforc
 */
public class CommandComposer {
    
    String ComposeIndexCommand(String annotationFileName, String idxFileName ){
        annotationFileName = annotationFileName.replaceAll(" ", "\\ ");
        idxFileName = idxFileName.replaceAll(" ", "\\ ");
        return "kallisto index -i " + idxFileName + " " + annotationFileName;
    }
    
    String ComposeIndexCommand(String annotationFileName, String idxFileName, int kmer){
        annotationFileName = annotationFileName.replaceAll(" ", "\\ ");
        idxFileName = idxFileName.replaceAll(" ", "\\ ");
        return "kallisto index -i " + idxFileName + " -k " + kmer + " " + annotationFileName;
    }
    
    String ComposeQuantCommand(String idxFile, String outputFolder, boolean isSingle, List<String> seqFiles ){
        if(!isSingle && seqFiles.size()%2 != 0){
            return "";
        }
        
        if( isSingle ){
            return "kallisto quant -i " + idxFile + " -o " + outputFolder + " --single " + String.join(" ", seqFiles);
        }else{
            return "kallisto quant -i " + idxFile + " -o " + outputFolder + " " + String.join(" ", seqFiles);
        }        
    }
    
    String ComposeDownloadCommand(){
        return "";
    }
}
