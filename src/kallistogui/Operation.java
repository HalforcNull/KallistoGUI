/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kallistogui;

/**
 *
 * @author runan.yao
 */


public class Operation {
    public enum OperationType { BuildKallistoIndex, RunKallistoQuant, DownloadAnnotation, UnDefined };
    
    private OperationType type;
    private String AnnotationDataUrl;
    private String AnnotationFileLocalPath;
    
    public Operation(){
        type = OperationType.UnDefined;
    }
    
    public void SetAsDownloadAnnotation(String Url){
        this.type = OperationType.DownloadAnnotation;
        this.AnnotationDataUrl = Url;
    }
}
