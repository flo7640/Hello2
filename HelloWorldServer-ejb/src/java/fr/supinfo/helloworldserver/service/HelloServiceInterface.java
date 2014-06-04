package fr.supinfo.helloworldserver.service;

import javax.ejb.Remote;

/**
 *
 * @author gbalas
 */

@Remote
public interface HelloServiceInterface {
    public String getHelloMessage();
}
