package models;

import enums.petStatus;

public class Pet { // https://petstore.swagger.io/#/pet/getPetById
    private long id;
    private String name;
    private String[] photoUrls;
    private petStatus status;
    private Category category;
    private Tag[] tags;

    public Pet(String name, String[] photoUrls) {
        this.name = name;
        this.photoUrls = photoUrls;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public petStatus getStatus() {
        return status;
    }

    public Category getCategory() {
        return category;
    }

    public Tag[] getTags() {
        return tags;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStatus(petStatus status) {
        this.status = status;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setTags(Tag[] tags) {
        this.tags = tags;
    }
}
