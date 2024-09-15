package com.AuctionSystem;

import java.util.ArrayList;
import java.util.List;

public class AuctionItem {
    private List<Bidder> bidders = new ArrayList<>();
    private String itemName;

    public AuctionItem(String itemName) {
        this.itemName = itemName;
    }

    public void subscribe(Bidder bidder) {
        bidders.add(bidder);
        System.out.println("Bidder subscribed for " + itemName);
    }

    public void unsubscribe(Bidder bidder) {
        bidders.remove(bidder);
        System.out.println("Bidder unsubscribed from " + itemName);
    }

    public void notifyBidders(String message) {
        for (Bidder bidder : bidders) {
            bidder.update(message);
        }
    }

    public void startAuction() {
        System.out.println("Auction started for: " + itemName);
        notifyBidders("Auction for " + itemName + " has started!");
    }

    public void endAuction() {
        System.out.println("Auction ended for: " + itemName);
        notifyBidders("Auction for " + itemName + " has ended!");
    }
}
