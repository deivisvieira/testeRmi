/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplormi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author aluno
 */
public interface ICalcRemote extends Remote{
    int add (int a, int b )throws RemoteException;
    int sub (int a, int b )throws RemoteException;
}
