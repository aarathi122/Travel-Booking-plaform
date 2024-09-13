package com.AuctionSystem;

public abstract class Auction {
    protected AuctionItem auctionItem;

    public Auction(AuctionItem auctionItem) {
        this.auctionItem = auctionItem;
    }

    // Template method defining the steps for an auction
    public final void conductAuction() {
        notifyStart();
        biddingProcess();
        notifyEnd();
    }

    protected void notifyStart() {
        auctionItem.startAuction();
    }

    protected void notifyEnd() {
        auctionItem.endAuction();
    }

    // Step to be customized by subclasses
    protected abstract void biddingProcess();
}
