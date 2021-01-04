package org.igorchuchman.service.impl;

import org.igorchuchman.dto.CommentDTO;
import org.igorchuchman.exception.ServiceException;
import org.igorchuchman.mapper.CommentToCommentDTOMapper;
import org.igorchuchman.mapper.GameToGameDTOMapper;
import org.igorchuchman.repository.CommentRepository;
import org.igorchuchman.repository.GameRepository;
import org.igorchuchman.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {


    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentToCommentDTOMapper commentMapper;


    @Override
    public CommentDTO getCommentById(Long id) {
        return commentMapper.toDTO(commentRepository.getCommentById(id));
    }

    @Override
    public List<CommentDTO> getAllComment() {
        return commentRepository.getAllComment().stream()
                .map(e -> commentMapper.toDTO(e))
                .collect(Collectors.toList());
    }

    @Override
    public CommentDTO createComment(CommentDTO commentDTO, Long id) {
        if(commentDTO.getId() != null){
            throw new ServiceException(400, "Comment shouldn't have an id ", null);
        }
        if(!GameRepository.checkSavedGames(id)){
            throw new ServiceException(400, "No game found ", null);
        }

        return commentMapper.toDTO(commentRepository.createComment(commentMapper.toEntity(commentDTO)));
    }

    @Override
    public CommentDTO updateComment(CommentDTO commentDTO) {
        if(commentDTO.getId() == null){
            throw new ServiceException(400, "Game have an id ", null);
        }

        return commentMapper.toDTO(commentRepository.updateComment(commentMapper.toEntity(commentDTO)));
    }

    @Override
    public void deleteCommentById(Long id) {
        commentRepository.deleteCommentById(id);
    }
}
