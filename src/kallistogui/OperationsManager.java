/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kallistogui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author runan.yao
 */
public class OperationsManager {
    private List<Operation> opList = new ArrayList<Operation>();
    private OperationRunner Runner;
    public OperationsManager(){
    }
    
    public void addNewOperation(Operation op){
        opList.add(op);
    }
    
    public void startExecute(OperationRunner.SupportedEnvironment env){
        setupRunner(env);
    }

    private void setupRunner(OperationRunner.SupportedEnvironment env) {
        switch(env){
            case Windows:
                this.Runner = new WindowsOperationRunner();
                break;
            case MacOS:
                
                break;
            case Ubuntu:
                break;
            case CentOS:
                break;
        }
    }
}
