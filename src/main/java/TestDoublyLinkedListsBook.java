// FUTURE: create a Portfolio class and include functionality of the below

import org.desu.linkedlistbook.DoublyLinkedList;
import org.desu.portfolio.PortfolioHolding;

public class TestDoublyLinkedListsBook {
    // We will write this class with parallel functionality to
    // the PortfolioArrayUtilities class in SkillBuilder1
    // Create and print the same portfolio using the
    // DoublyLinkedList, CircularlyLinkedList,
    // and DoublyLinkedList data structures (from the book)

    public static String buildExamplePortfolioDoublyLinkedList() {

        // Create portfolio items
        PortfolioHolding item1 = new PortfolioHolding("TLSA", 1.0, 295.88);
        PortfolioHolding item2 = new PortfolioHolding("AAPL", 5.0, 211.10);
        PortfolioHolding item3 = new PortfolioHolding("GOOGL", 3.0, 176.62);
        PortfolioHolding item4 = new PortfolioHolding("IBM", 2.0, 290.14);
        PortfolioHolding item5 = new PortfolioHolding("MSFT", 4.0, 503.51);

        // Create the linked list, call it myDoublyLinkedList
        // Use book interface
        DoublyLinkedList<PortfolioHolding> myDoublyLinkedList = new DoublyLinkedList<>();
        myDoublyLinkedList.addFirst(item1);
        myDoublyLinkedList.addFirst(item2);
        // First add item1 then add item2

        myDoublyLinkedList.addLast(item3);
        myDoublyLinkedList.addLast(item4);
        myDoublyLinkedList.addLast(item5);
        // of the list in that order

        myDoublyLinkedList.first();
        // Don't remove it
        // Call the variable firstItem

        // TODO: Uncomment the below to see the first item
        PortfolioHolding firstItem = myDoublyLinkedList.first();
        String firstItemString = firstItem.toString();
        System.out.println("First: ");
        System.out.println(firstItemString);
        myDoublyLinkedList.last();
        // It won't be removed

        // TODO: Uncomment the below to see the last item
        //Convert it to a string
        PortfolioHolding lastItem = myDoublyLinkedList.last();
        String lastItemString = lastItem.toString();
        System.out.println("Last: ");
        System.out.println(lastItemString);
        // Now let's remove all elements from the list
        // And package into a string to see our portfolio
        StringBuilder sb = new StringBuilder();
        while (!myDoublyLinkedList.isEmpty()) {
            PortfolioHolding thisHolding = myDoublyLinkedList.removeFirst();
            // And enter it into thisHolding

            // TODO: uncomment the below lines to build the string
            sb.append(thisHolding.toString());
            if (!myDoublyLinkedList.isEmpty()) {
                sb.append("\n");
            }
        }
        String returnString = sb.toString();
        return returnString;
    }

    public static void main (String[] args) {
        String portfolioString = buildExamplePortfolioDoublyLinkedList();
        System.out.println("\nEntire Portfolio after removal of list elements:");
        System.out.println(portfolioString);
    }

}
