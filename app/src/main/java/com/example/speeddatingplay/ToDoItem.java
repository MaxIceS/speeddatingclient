package com.example.speeddatingplay;

/**
 * Represents an item in a ToDo list
 */
public class ToDoItem {

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("name")
    private String mName;

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    /**
     * Item Rating
     */
    @com.google.gson.annotations.SerializedName("rating")
    private int mRating;


    @com.google.gson.annotations.SerializedName("email")
    private String mEmail;

    /**
     * ToDoItem constructor
     */
    public ToDoItem() {

    }

    @Override
    public String toString() {
        return getName();
    }

    /**
     * Initializes a new ToDoItem
     *
     * @param name
     *            The item text
     * @param id
     *            The item id
     */
    public ToDoItem(String name, String id) {
        this.setName(name);
        this.setId(id);
    }

    /**
     * Returns the item name
     */
    public String getName() {
        return mName;
    }

    /**
     * Sets the item text
     *
     * @param text
     *            text to set
     */
    public final void setName(String text) {
        mName = text;
    }

    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }

    /**
     * Set the item rating
     */
    public int getRating() {
        return mRating;
    }

    public void setRating(int rating){mRating = rating;}

    @Override
    public boolean equals(Object o) {
        return o instanceof ToDoItem && ((ToDoItem) o).mId == mId;
    }

    /**
     * Indicates if the item is completed
     */
    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
}