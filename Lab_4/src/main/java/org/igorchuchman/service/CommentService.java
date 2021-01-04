package org.igorchuchman.service;

import org.igorchuchman.dto.CommentDTO;

import java.util.List;

public interface CommentService {

    CommentDTO getCommentById(Long id);
    List<CommentDTO> getAllComment();
    CommentDTO createComment(CommentDTO commentDTO);
    CommentDTO updateComment(CommentDTO commentDTO);
    void deleteCommentById(Long id);
}
