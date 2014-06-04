
package fr.supinfo.helloworldserver.service;

import javax.ejb.Stateful;

/**
 *
 * @author gbalas
 */

@Stateful
public class HelloServiceBean implements HelloServiceInterface {

    @Override
    public String getHelloMessage() {
        return "Java Rocks !";
    }

}
