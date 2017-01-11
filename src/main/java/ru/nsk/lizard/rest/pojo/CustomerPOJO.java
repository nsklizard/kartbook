package ru.nsk.lizard.rest.pojo;

/**
 * Created by dkim on 22.11.2016.
 */
public class CustomerPOJO {

    private Long id;

    private String login;

    private String password;

    private String name;

    private String phone;

    private String email;

    public CustomerPOJO() {

    }

    public CustomerPOJO(Long id, String login, String password, String name, String phone, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public static CustomerPOJO fromDBEntity(ru.nsk.lizard.db.entities.Customer c){
        return new CustomerPOJO(c.getId(), c.getLogin(),c.getPassword(),c.getName(),c.getPhone(),c.getEmail());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
