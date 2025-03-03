public class Telco implements TelcoSubscription {
        private int dataAllowance;
        private int promoPrice;
        private String telcoName;
        private boolean unliCallText;

        public Telco(int dataAllowance, int promoPrice, String telcoName, boolean unliCallText) {
            this.dataAllowance = dataAllowance;
            this.promoPrice = promoPrice;
            this.telcoName = telcoName;
            this.unliCallText = unliCallText;
        }
        @Override
        public void accept(TelcoPromoVisitor visitor) {
            visitor.visit(this);
        }

        public String getTelcoName() {
            return telcoName;
        }

        public int getPromoPrice() {
            return promoPrice;
        }

        public boolean getUnliCallText() {
            return unliCallText;
        }

        public int getDataAllowance() {
            return dataAllowance;
        }
    }

