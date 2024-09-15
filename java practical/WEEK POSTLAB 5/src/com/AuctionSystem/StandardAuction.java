package com.AuctionSystem;

public class StandardAuction extends Auction {
    public StandardAuction(AuctionItem auctionItem) {
        super(auctionItem);
    }

    @Override
    protected void biddingProcess() {
        System.out.println("Standard bidding process for " + auctionItem);
        // Implement bidding logic here
    }
}
