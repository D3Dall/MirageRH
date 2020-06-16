/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supercompany.miragerh.services;

import fr.jaschavolp.m1.jee.mirageshared.fichedeposte.FichePosteVM;
import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesManagerRemote;
import fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesRHRemote;
import java.util.List;

/**
 *
 * @author FlorianDELSOL
 */
public class RMIRHClientService {
    private final static String URI = "fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesRHRemote";
    
    private InitialContext ctx;
    private ServicesRHRemote remoteSvc;
    
    public RMIRHClientService () throws NamingException{
        ctx = new InitialContext();
        remoteSvc = (ServicesRHRemote) ctx.lookup(URI);
    }

    public ServicesRHRemote getDabRemoteSvc() {
        return remoteSvc;
    }

    
}
