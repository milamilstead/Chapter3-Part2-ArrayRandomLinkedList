// FUTURE: create a Portfolio class and include functionality of the below

import org.desu.linkedlistbook.DoublyLinkedList;
import org.desu.portfolio.PortfolioHolding;

public class TestDoublyLinkedListsJava {
    // Write this class with parallel functionality to
    // the PortfolioArrayUtilities class in SkillBuilder1
    // Create and print the same portfolio using the
    // DoublyLinkedList, CircularlyLinkedList,
    // and DoublyLinkedList data structures (from the book)

    public static String buildExamplePortfolioDoublyLinkedList() {

        String returnString = "returnString not set";

        // Create portfolio items
        PortfolioHolding item1 = new PortfolioHolding("TLSA", 1.0, 295.88);
        PortfolioHolding item2 = new PortfolioHolding("AAPL", 5.0, 211.10);
        PortfolioHolding item3 = new PortfolioHolding("GOOGL", 3.0, 176.62);
        PortfolioHolding item4 = new PortfolioHolding("IBM", 2.0, 290.14);
        PortfolioHolding item5 = new PortfolioHolding("MSFT", 4.0, 503.51);

        // TODO: create the linked list, call it myDoublyLinkedList
        DoublyLinkedList<PortfolioHolding> myDoublyLinkedList = new DoublyLinkedList<>();
        // Use Java Linked List from collections

        // TODO: uncomment the below code after the item above
        // is worked

        //First add item1 then add item2
        myDoublyLinkedList.addFirst(item1);
        myDoublyLinkedList.addFirst(item2);
        // Next add item3, item4, and item5 to the back
        // of the list in that order
        myDoublyLinkedList.addLast(item3);
        myDoublyLinkedList.addLast(item4);
        myDoublyLinkedList.addLast(item5);
        // Now get the first element in the list
        // Don't remove it
        // Call the variable firstItem
        // This time uses getFirst
        PortfolioHolding firstItem = myDoublyLinkedList.first();
        String firstItemString = firstItem.toString();
        System.out.println("First: ");
        System.out.println(firstItemString);
        // Now get the last element in the list
        // It won't be removed
        // This time uses getLast
        PortfolioHolding lastItem = myDoublyLinkedList.last();
        // Convert it to a string
        String lastItemString = lastItem.toString();
        System.out.println("Last: ");
        System.out.println(lastItemString);
        // Now let's remove all elements from the list
        // And package into a string to see our portfolio
        StringBuilder sb = new StringBuilder();
        while (!myDoublyLinkedList.isEmpty()) {
            PortfolioHolding thisHolding = myDoublyLinkedList.removeFirst();
            sb.append(thisHolding.toString());
            if (!myDoublyLinkedList.isEmpty()) {
                sb.append("\n");
            }
        }
        returnString = sb.toString();

        // NOTE: we can do the above in reverse order as well
        // Using removeLast from the DoublyLinkedList interface
        // Instead of removeFirst



        return returnString;
    }

    public static void main (String[] args) {
        String portfolioString = buildExamplePortfolioDoublyLinkedList();
        System.out.println("\nEntire Portfolio after removal of list elements:");
        System.out.println(portfolioString);
    }

}
