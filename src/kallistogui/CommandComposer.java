/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kallistogui;

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
    
    String ComposeQuantCommand(){
        return "Not Impelement";
    }
}
