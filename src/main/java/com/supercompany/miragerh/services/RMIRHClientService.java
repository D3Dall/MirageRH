package com.supercompany.miragerh.services;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesRHRemote;

/**
 * Structure un service RMI pour l'interaction entre le serveur et un client MIA-Manager
 * @author FlorianDELSOL
 */
public class RMIRHClientService {
    private final static String URI = "fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesRHRemote";
    
    private InitialContext ctx;
    private ServicesRHRemote remoteSvc;
    
    /**
     * Créer une nouvelle instance
     * @throws NamingException 
     */
    public RMIRHClientService () throws NamingException{
        ctx = new InitialContext();
        remoteSvc = (ServicesRHRemote) ctx.lookup(URI);
    }

    /**
     * @return le service permettant la communication avec le serveur
     */
    public ServicesRHRemote getDabRemoteSvc() {
        return remoteSvc;
    }
}
