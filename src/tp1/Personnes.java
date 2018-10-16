/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.List;
import javafx.collections.FXCollections;

/**
 *
 * @author sebastian-andreas.si
 */
class Personnes {
    private final List<Personne> list;
    
    public Personnes(List<Personne> list){
        this.list = list;
    }
    public Personnes(){
        this.list = FXCollections.observableArrayList();
        this.list.add(new Personne("admin","admin", "seb", "5, rue du point", "", "666", "777"));
        this.list.add(new Personne("gentil","monsieur", "noname", "6, rue", "", "123", "456"));
    }
    
    public Personne identification(String login, String pw){
        for (Personne p:list){
            if (p.getLogin().equals(login) && p.getPassword().equals(pw))
                return p;
        }
        return null;
    }
    
    public List<Personne> getListe(){
        return list;
    }
}
