package org.desu.portfolio;

public class PortfolioUtilities {

    // FUTURE: rewrite the two functions below to store the portfolio as an
    // ArrayList of PortfolioHolding instead of an array of PortfolioHolding
    // Or rewrite to store portfolio through a generic type

    public static PortfolioHolding[] buildExamplePortfolio() {
        PortfolioHolding item1 = new PortfolioHolding("TLSA", 1.0, 295.88);
        PortfolioHolding item2 = new PortfolioHolding("AAPL", 5.0, 211.10);
        PortfolioHolding item3 = new PortfolioHolding("GOOGL", 3.0, 176.62);
        PortfolioHolding item4 = new PortfolioHolding("IBM", 2.0, 290.14);
        PortfolioHolding item5 = new PortfolioHolding("MSFT", 4.0, 503.51);
        // Now create the array of PortfolioHoldings
        PortfolioHolding[] ourPortfolio = {item1, item2, item3, item4, item5};
        return ourPortfolio;
    }

    public static String buildDisplayString(PortfolioHolding[] ourHoldings, char Separator) {
        StringBuilder sb = new StringBuilder();
        sb.append("Symbol    Shares    Price     Total");
        sb.append(Separator);
        int lenHoldings = ourHoldings.length;
        for (int i = 0; i < lenHoldings; i++) {
            sb.append(ourHoldings[i].toString().stripTrailing());
            // Add a CR if not the last one
            if (i < (lenHoldings - 1))
                sb.append(Separator);
        }
        return sb.toString();
    }

}
