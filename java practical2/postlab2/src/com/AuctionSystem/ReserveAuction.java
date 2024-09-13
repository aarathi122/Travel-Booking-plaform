package com.AuctionSystem;

public class ReserveAuction extends Auction {
    private double reservePrice;

    public ReserveAuction(AuctionItem auctionItem, double reservePrice) {
        super(auctionItem);
        this.reservePrice = reservePrice;
    }

    @Override
    protected void biddingProcess() {
        System.out.println("Reserve bidding process with reserve price: " + reservePrice);
        // Implement reserve price bidding logic here
    }
}
