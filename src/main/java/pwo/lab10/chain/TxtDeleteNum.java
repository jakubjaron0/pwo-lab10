/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.chain;

/**
 *
 * @author Kuba
 */
public class TxtDeleteNum extends TxtProc{
    public static String ACTION = "DELETE";
    
    
    @Override
    public String processRequest(Request request) {

        if (request.action.toUpperCase().equals(ACTION)) {
            
            
            return request.text.replaceAll("[0-9]", "");
            
            
        } else {
            return next(request);
        }
    }
}
