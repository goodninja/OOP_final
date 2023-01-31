package Lesson07.model.contactMethod;

import Lesson07.model.contactMethod.address.Address;
import Lesson07.model.contactMethod.email.Email;
import Lesson07.model.contactMethod.phone.Phone;
import Lesson07.model.contactMethod.telegram.Telegram;

public class UserListContactMethod implements Address, Email, Phone, Telegram {

    @Override
    public void addressMethod() {
    }

    @Override
    public void emailMethod() {
    }

    @Override
    public void phoneMethod() {
    }

    @Override
    public void telegramMethod() {
    }

}
