/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Domain.Client;
import Logic.CurrentAccount;
import Logic.Log;
import Logic.SavingAccount;

/**
 *
 * @author wtfan
 */
public class LogTesting {

    public LogTesting() {
    }
    public void test(){
    Client clients[]=new Client[10];
    Client client1=new Client("1-1112-4567","joaquin","1234423","limon");
    Client client2=new Client("1-332-5434","steven","56565","moin");
    Client client3=new Client("1-65656-7668","andres","6788889","limon");
    clients[0]=client1;
    clients[1]=client2;
    clients[2]=client3;
    
        
        SavingAccount account1=new SavingAccount("2024-03-15", 10, 5, "14560", 1000, client1);
        SavingAccount account2=new SavingAccount("2023-01-12", 10, 10, "13560", 1000, client2);
        CurrentAccount account=new CurrentAccount(5, "232434", 500, client3);
        Log log[]=new Log[3];
        log[0]=new Log(1,"saving Amount",account1,70000);
        log[1]=new Log(2,"saving Amount",account2,7000);
        log[2]=new Log(2,"saving Amount",account,7000);
        
        for(int i=0; i<log.length;i++){
        if(log[i]!=null)
                System.out.println(log[i].toString());
        
        }
        
        
    }
}
