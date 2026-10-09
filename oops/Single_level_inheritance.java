
//-----------------------Single level inheritance-----------------------------

class MobilePhone {
    void makeCall() {
        System.out.println("Making a phone call");
    }
}

class Smartphone extends MobilePhone {
    void browseInternet() {
        System.out.println("Browsing the internet");
    }
}

public class Single_level_inheritance{
    public static void main(String[] args) {
        Smartphone s = new Smartphone();

        s.makeCall();
        s.browseInternet();
    }
}
