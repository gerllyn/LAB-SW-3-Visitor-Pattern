public class TelcoAllowance implements TelcoPromoVisitor {

        @Override
        public void visit(Telco telco) {
            // Logic for data usage and price for the telco provider
            System.out.println("Data Usage: " + telco.getDataAllowance() + " GB for ₱" + telco.getPromoPrice());
        }
        public String showAllowance(Telco telco) {
            return "Data Usage: " + telco.getDataAllowance() + " GB for ₱" + telco.getPromoPrice();
        }
        public String showAllowance(TelcoSubscription telco) {
            return "Data Usage: " + ((Telco) telco).getDataAllowance() + " GB for ₱" + ((Telco) telco).getPromoPrice();
        }
        @Override
        public String showUnliCallsTextOffer(TelcoSubscription telco) {
            return "No Unlimited Calls/Text Offer";
        }
    }

