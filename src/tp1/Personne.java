/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author sebastian-andreas.si
 */
class Personne {

    private final StringProperty login = new SimpleStringProperty();
    private final StringProperty password = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty address1 = new SimpleStringProperty();
    private final StringProperty address2 = new SimpleStringProperty();
    private final StringProperty citypc = new SimpleStringProperty();
    private final StringProperty tel1 = new SimpleStringProperty();
    private final StringProperty tel2 = new SimpleStringProperty();    
    private final ObjectProperty<Couleur> hair_color = new SimpleObjectProperty();
    private final StringProperty eye_color = new SimpleStringProperty();
    private final DoubleProperty hairLength = new SimpleDoubleProperty();
    private final StringProperty details = new SimpleStringProperty();  

    public Personne(String login, String pw, String name, String address1, String address2, String tel1, String tel2) {
        this.login.set(login);
        this.password.set(pw);
        this.name.set(name);
        this.address1.set(address1);
        this.address2.set(address2);
        this.tel1.set(tel1);
        this.tel2.set(tel2);
    }    
    
    public String getEyeColor(){
        return eye_color.get();
    }
    public StringProperty getEyeColorProperty(){
        return eye_color;
    }
    
    public String getLogin() {
        return login.get();
    }

    public void setLogin(String value) {
        login.set(value);
    }

    public StringProperty loginProperty() {
        return login;
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String value) {
        password.set(value);
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getAddress1() {
        return address1.get();
    }

    public void setAddress1(String value) {
        address1.set(value);
    }

    public StringProperty address1Property() {
        return address1;
    }

    public String getAddress2() {
        return address2.get();
    }

    public void setAddress2(String value) {
        address2.set(value);
    }

    private StringProperty address2Property() {
        return address2;
    }

    public String getCitypc() {
        return citypc.get();
    }

    public void setCitypc(String value) {
        citypc.set(value);
    }

    public StringProperty citypcProperty() {
        return citypc;
    }

    public String getTel1() {
        return tel1.get();
    }

    public void setTel1(String value) {
        tel1.set(value);
    }

    public StringProperty tel1Property() {
        return tel1;
    }

    public String getTel2() {
        return tel2.get();
    }

    public void setTel2(String value) {
        tel2.set(value);
    }

    public StringProperty tel2Property() {
        return tel2;
    }

}
