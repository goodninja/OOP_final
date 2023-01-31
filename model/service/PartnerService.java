package Lesson07.model.service;

import java.util.ArrayList;
import java.util.List;
import Lesson07.model.data.*;
import Lesson07.model.util.DataReader;
import Lesson07.model.util.DataWriter;

public class PartnerService implements UserService<Partner> {

    private final String path = "partners.txt";
    Partner partner;
    private List<String> address = new ArrayList<>();
    private List<String> email = new ArrayList<>();
    private List<String> phone = new ArrayList<>();
    private List<String> telegram = new ArrayList<>();
    private List<Partner> partners = new ArrayList<>();

    @Override
    public void addContact(Partner partner) {
        partners.add(partner);

    }

    @Override
    public List<Partner> getContact() {
        return new ArrayList<>(partners);
    }

    @Override
    public void load() {
        partners = DataReader.dataRead(path);
    }

    @Override
    public void save() {
        DataWriter.dataWrite(partners);
    }

    public void addTelegram(String telegramAccount) {
        telegram.add(telegramAccount);
    }

    public void removeTelegram(String telegramAccount) {
        telegram.remove(telegramAccount);
    }

    public void addEmail(String emailAccount) {
        email.add(emailAccount);
    }

    public void removeEmail(String emailAccount) {
        email.remove(emailAccount);
    }

    public void addPhone(String phoneNumber) {
        phone.add(phoneNumber);
    }

    public void removePhone(String phoneNumber) {
        phone.remove(phoneNumber);
    }

    public void addAddress(String addressAccount) {
        address.add(addressAccount);
    }

    public void removeAddress(String addressAccount) {
        address.remove(addressAccount);
    }

    public void removeContact(Partner partner) {
        partners.remove(partner);

    }

}
