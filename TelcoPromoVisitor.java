public interface TelcoPromoVisitor {
        String showAllowance(TelcoSubscription telco);
        String showUnliCallsTextOffer(TelcoSubscription telco);

    void visit(Telco telco);
}
