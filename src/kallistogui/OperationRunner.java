/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kallistogui;

import java.util.List;

/**
 *
 * @author runan.yao
 */
public abstract class OperationRunner {
    public enum SupportedEnvironment{Windows, MacOS, CentOS, Ubuntu};
    public String runOperationResult; // this need change later. Maybe add an entity
    public abstract void runOperations(List<Operation> opList);
}
