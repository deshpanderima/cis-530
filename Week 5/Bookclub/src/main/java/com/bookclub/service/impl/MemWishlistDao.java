package com.bookclub.service.impl;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.WishlistDao;

import java.util.ArrayList;
import java.util.List;

public class MemWishlistDao implements WishlistDao {
    List<WishlistItem> wishlist;

    public MemWishlistDao() {
        this.wishlist = new ArrayList<WishlistItem>();
        this.wishlist.add(new WishlistItem("9780452284240", "To Kill a Mockingbird"));
        this.wishlist.add(new WishlistItem("9780061120084", "The Great Gatsby"));
        this.wishlist.add(new WishlistItem("9781984854801", "1984"));
        this.wishlist.add(new WishlistItem("9780142000670", "The Catcher in the Rye"));

    }

    @Override
    public List<WishlistItem> list() {
        return this.wishlist;
    }

    @Override
    public WishlistItem find(String key) {
        for (WishlistItem item : wishlist) {
            if (item.getIsbn().equals(key)) {
                return item;
            }
        }
        return new WishlistItem();
    }
}