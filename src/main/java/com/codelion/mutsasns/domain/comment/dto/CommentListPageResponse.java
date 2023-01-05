package com.codelion.mutsasns.domain.comment.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@Getter
@NoArgsConstructor
public class CommentListPageResponse {
    private List<CommentResponse> content;
    private Pageable pageable;
    private Boolean last;
    private Integer totalPages;
    private Long totalElements;
    private Integer size;
    private Integer number;
    private Sort sort;
    private Integer numberOfElements;
    private Boolean first;
    private Boolean empty;

    @Builder
    public CommentListPageResponse(List<CommentResponse> content, Pageable pageable, Boolean last, Integer totalPages, Long totalElements, Integer size, Integer number, Sort sort, Integer numberOfElements, Boolean first, Boolean empty) {
        this.content = content;
        this.pageable = pageable;
        this.last = last;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.size = size;
        this.number = number;
        this.sort = sort;
        this.numberOfElements = numberOfElements;
        this.first = first;
        this.empty = empty;
    }
}
