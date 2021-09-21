public class DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
        String defanged = "";
        defanged = address.replace(".","[.]");
        return defanged;
    }

    public static void main(String[] args) {
        String ipAddress = "255.100.50.0";
        System.out.println(defangIPaddr(ipAddress));
    }
}
