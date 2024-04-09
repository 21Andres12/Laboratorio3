/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author wtfan
 */
public class Client {
    private String id;
    private String name;
    private String phone;
    private String addres;

    public Client() {
    }

    public Client(String id, String name, String phone, String addres) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.addres = addres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        String result="Client Information"
                +"\n------------------------"
                +"\nId: "+this.getId()
                +"\nName: "+this.getName()
                +"\nName: "+this.getPhone()
                +"\nName: "+this.getAddres();
        return result;
     
    }
    
    
}
