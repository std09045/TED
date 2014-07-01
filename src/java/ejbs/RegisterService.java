/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejbs;

import entities.User;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class RegisterService {
    @PersistenceContext EntityManager em;
    public User createUser(User toCreate){
        em.persist(toCreate);
        return toCreate;
    }
}
