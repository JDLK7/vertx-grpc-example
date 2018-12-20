package com.bq.vertxgrpcexample.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Model {

    public Model() {
        id = "";
        createdAt = -1;
        updatedAt = -1;
        deletedAt = -1;
    }

    @JsonProperty("_id")
    protected String id;
    protected long createdAt;
    protected long updatedAt;
    protected long deletedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }

}
