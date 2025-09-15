public class TestDelivery {
    public static void main(String[] args) {
        double packageWeight = 10.0 ;

        ExpressDelivery express = new ExpressDelivery() ;
        EconomyDelivery economy = new EconomyDelivery() ;

        double expressCost = express.calculateShippingCost(packageWeight) ;
        double economyCost = economy.calculateShippingCost(packageWeight) ;

        System.out.println("เปรียบเทียบค่าขนส่งสำหรับสินค้าหนัก " + packageWeight + " กก.") ;
        System.out.println("------------------------------------------");
        System.out.println("บริการแบบ " + express.getServiceType() + ": " + expressCost + " บาท") ;
        System.out.println("บริการแบบ " + economy.getServiceType() + ": " + economyCost + " บาท") ;
    }
}