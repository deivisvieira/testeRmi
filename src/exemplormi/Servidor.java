/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplormi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author aluno
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            CalcRemote cr = new CalcRemote();
            Naming.rebind("calculcadora", cr);            
        } catch (RemoteException | MalformedURLException ex)
        {
            System.out.println("Erro ");
        }
    }
    
}
