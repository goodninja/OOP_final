package Lesson07.model.service;

import java.util.List;
import Lesson07.model.data.User;

public interface UserService<C extends User> {

    void addContact(C contact);

    void save();

    void load();

    List<C> getContact();

}
