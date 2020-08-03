/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa04package;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author JohnSMP
 */
@Stateless
@LocalBean
public class tarefa04Bean {

    public String getMessageFor(String caller) {
        return "Olá para você, " + caller + " !";
    }
}
