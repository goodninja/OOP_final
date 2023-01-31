package Lesson07.view;

import Lesson07.model.data.Partner;
import Lesson07.model.service.UserService;

public class PartnerView extends UserView<Partner> {

    public PartnerView(UserService<Partner> model) {
        super(model);
    }

    @Override
    public void showContacts() {
        super.showContacts();
    }

}