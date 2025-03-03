public interface TelcoSubscription {
        void accept(TelcoPromoVisitor visitor);
        String getTelcoName();
        int getPromoPrice();
        boolean getUnliCallText();
    }
