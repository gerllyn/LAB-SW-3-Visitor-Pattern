public class UnliCallTextPackage implements TelcoPromoVisitor {
    @Override
    public String showAllowance(TelcoSubscription telco) {
            return "Data Usage: Not available for unlimited calls/text package";
        }
    @Override
    public void visit(Telco telco) {
        // Logic for unlimited call/text package offer (if any)
        if (telco.getUnliCallText()) {
            System.out.println("Unlimited Calls/Text to all networks");
        } else {
            System.out.println("No Unlimited Calls/Text Offer");
        }
    }
        @Override
        public String showUnliCallsTextOffer(TelcoSubscription telco) {
            if (((Telco) telco).getUnliCallText()) {
                return "Unlimited Calls/Text to all networks";
            } else {
                return "No Unlimited Calls/Text Offer";
            }
        }
    }
