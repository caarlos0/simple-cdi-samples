package cdi.example3;

import javax.inject.Named;

@Named("master")
public class MasterCardImpl implements CreditCard {
    @Override
    public String getNumber() {
        return "1111-1111-1111";
    }
}
