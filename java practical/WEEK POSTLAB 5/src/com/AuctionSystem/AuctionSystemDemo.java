package com.AuctionSystem;

public class AuctionSystemDemo {
    public static void main(String[] args) {
        // Create auction items
        AuctionItem item1 = new AuctionItem("Antique Vase");
        AuctionItem item2 = new AuctionItem("Luxury Car");

        // Create bidders
        Bidder bidder1 = new ConcreteBidder("John");
        Bidder bidder2 = new ConcreteBidder("Alice");
        Bidder bidder3 = new ConcreteBidder("Bob");

        // Subscribe bidders to auction events
        item1.subscribe(bidder1);
        item1.subscribe(bidder2);
        item2.subscribe(bidder3);

        // Conduct a standard auction for item1
        Auction standardAuction = new StandardAuction(item1);
        standardAuction.conductAuction();

        System.out.println("-----");

        // Conduct a reserve auction for item2
        Auction reserveAuction = new ReserveAuction(item2, 50000);
        reserveAuction.conductAuction();
    }
}
