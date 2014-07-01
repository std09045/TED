/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import ejbs.RegisterService;
import entities.User;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;



/**
 *
 * @author Mark
 */
@ManagedBean
@Named(value = "registerBean")
@RequestScoped
public class RegisterBean {

    User usertoReg;
    @EJB
    private RegisterService registerService;

    /**
     * Creates a new instance of RegisterBean
     */
    public RegisterBean() {
        usertoReg = new User();
    }

    public User getUsertoReg() {
        return usertoReg;
    }

    public void setUsertoReg(User usertoReg) {
        this.usertoReg = usertoReg;
    }

    public String register() throws Exception {
        String toReturn = "success";
        usertoReg = registerService.createUser(usertoReg);
        return toReturn;
    }
    public String welcome(){
        String firstName = usertoReg.getFirstName();
        String wl = "welcome ";
        return wl + firstName;   
    }
}
