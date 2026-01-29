package com.tuorg.publications.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;


public class PublicationRequestDTO {

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @NotNull
    private Long authorId;

 // ===== GETTERS =====
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getAuthorId() {
        return authorId;
    }

    // ===== SETTERS =====
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}


