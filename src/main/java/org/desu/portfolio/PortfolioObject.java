package org.desu.portfolio;

public class PortfolioObject {
    String portfolioName;
    String portfolioBroker;
    // FUTURE: Change this to work with an ArrayList
    public PortfolioHolding[] portfolioHoldingsArray;
    Double portfolioValue;

    public PortfolioObject(String inputName,
                           String inputBroker,
                           PortfolioHolding[] inputPortfolio) {
        portfolioName = inputName;
        portfolioBroker = inputBroker;
        portfolioHoldingsArray = inputPortfolio;
        ComputePortfolioValue();
    }

    // No parameters to constructor builds a sample
    public PortfolioObject() {
        portfolioName = "Sample";
        portfolioBroker = "Robin Hood";
        portfolioHoldingsArray = PortfolioUtilities.buildExamplePortfolio();
        ComputePortfolioValue();
    }

    private void ComputePortfolioValue() {
        // Initialize total to 0
        double grandTotal = 0.0;
        for (int i = 0; i < portfolioHoldingsArray.length; i++) {
            grandTotal = grandTotal + portfolioHoldingsArray[i].getTotal();
        }
        this.portfolioValue = grandTotal;
    }

    public String generatePortfolioString() {
        // StringBuilder concatenation (efficient)
        StringBuilder sb = new StringBuilder("");
        String thisItem, portfolioString;
        sb.append(portfolioName).append("\n");
        sb.append(portfolioBroker).append("\n");
        int portLen = portfolioHoldingsArray.length;
        for (int i = 0; i < portLen; i++) {
            thisItem = portfolioHoldingsArray[i].toString();
            sb.append(thisItem);
            if (i < portLen - 1) {
                sb.append("\n");
            }
        }
        String formattedTotal = String.format("%-11s", portfolioValue);
        sb.append("\n").append("Total Value ");
        sb.append(portfolioValue).append("\n");
        portfolioString = sb.toString();
        return portfolioString;
    }

    public static void main(String[] args) {
        PortfolioObject testPortfolio = new PortfolioObject();
        String testPortfolioString = testPortfolio.generatePortfolioString();
        System.out.println(testPortfolioString);
    }

}
