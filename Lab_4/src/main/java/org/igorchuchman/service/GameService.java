package org.igorchuchman.service;

import org.igorchuchman.dto.GameDTO;

import java.util.List;

public interface GameService {
    GameDTO getGameById(Long id);
    List<GameDTO> getAllGame();
    GameDTO createGame(GameDTO gameDTO);
    GameDTO updateGame(GameDTO gameDTO);
    void deleteGameById(Long id);
}
