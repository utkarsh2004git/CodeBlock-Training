public class CallStackCheck {

    public static void A(){
        B();
        System.out.println("App A me hai");
    }
    public static void B(){
        System.out.println("App B me hai" );
        C();
    }
    public static void C(){
        System.out.println("App C me hai");
        D();
    }
    public static void D(){
        System.out.println("App D me hai");
    }

    public static void main(String[] args) {
        A();
    }
}


