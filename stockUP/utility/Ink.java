

package utility;
import java.util.ArrayList;

import objects.*;

public class Ink {

      // ANSI color codes for formatting
      public static final String ANSI_RESET = "\u001B[0m";
      public static final String ANSI_CYAN = "\u001B[36m";
      public static final String ANSI_GREEN = "\u001B[32m";
      public static final String ANSI_YELLOW = "\u001B[33m";
      public static final String ANSI_BOLD = "\u001B[1m";
  
  
  public Ink() {
    // do nothing
  }

  public void printWelcome() {
    System.out.println(ANSI_CYAN + "*** Richer Every Day with stockUP ***" + ANSI_RESET + "\n");
  }

  public void printGoodday() {
    System.out.println(ANSI_CYAN + "*** Richer Every Day with stockUP ***" + ANSI_RESET + "\n");
  }

  public void printStock(Stock stock) {
    System.out.printf("Name: %s\nSymbol: %s\nPrice: $%.2f", ANSI_CYAN,
      stock.getName(), stock.getSymbol(), stock.getPrice(), ANSI_RESET);
    System.out.println("\nHow many units of this stock would you like?? ");
  } // printStock()

  public void printPortfolio(ArrayList<Stock> stocks, double networth, 
    double balance) {
    for(int i = 0; i < stocks.size(); i++) {
      System.out.printf("(%d) Name: %s Symbol: %s Price: $%.2f Qty: %d\n",
        i + 1, ANSI_CYAN,
        stocks.get(i).getName(), ANSI_RESET,
        stocks.get(i).getSymbol(), ANSI_CYAN,
        stocks.get(i).getPrice(), 
        stocks.get(i).getQty(), ANSI_RESET);
    } // for
    System.out.printf("Networth: $%.2f\n", networth);
    System.out.printf("Balance: $%.2f\n", balance);
  } // printPortfolio()

  public void printMarket(ArrayList<Stock> stocks) {
    for(int i = 0; i < stocks.size(); i++) {
      System.out.printf("(%d) Name: %s Symbol: %s Price: $%.2f\n",
        i + 1, ANSI_CYAN,
        stocks.get(i).getName(), ANSI_RESET,
        stocks.get(i).getSymbol(), ANSI_CYAN,
        stocks.get(i).getPrice(), ANSI_RESET);
    } // for
    System.out.println("Which stock would you like to buy?: ");
  } // printMarket()

  public void printMenu() {
    System.out.println(ANSI_BOLD + ANSI_CYAN + "=== Main Menu ===" + ANSI_RESET);
    System.out.println(ANSI_YELLOW + "(1)" + ANSI_RESET + " Show Portfolio");
    System.out.println(ANSI_YELLOW + "(2)" + ANSI_RESET + " Show Stocks");
    System.out.println(ANSI_YELLOW + "(3)" + ANSI_RESET + " Add Funds");
    System.out.println(ANSI_YELLOW + "(4)" + ANSI_RESET + " Exit");
}

public void printStockDetail(Stock stock) {
  System.out.printf("%sName:%s %s | %sSymbol:%s %s | %sPrice:%s $%.2f | %sQty:%s %d\n",
          ANSI_BOLD, ANSI_RESET, stock.getName(), ANSI_BOLD, ANSI_RESET,
          stock.getSymbol(), ANSI_BOLD, ANSI_RESET, stock.getPrice(),
          ANSI_BOLD, ANSI_RESET, stock.getQty());
}

public void printAddFunds(double balance) {
  System.out.printf("%sCurrent balance:%s $%.2f\n%sAmount to add?: ",
          ANSI_BOLD, ANSI_RESET, balance, ANSI_BOLD);
}
} // class