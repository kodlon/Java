package org.igorchuchman.mapper;

import org.igorchuchman.dto.GameDTO;
import org.igorchuchman.entity.Game;

public class GameToGameDTOMapper {
    public Game toEntity(final GameDTO gameDTO){
        final Game game = new Game();

        game.setId(gameDTO.getId());
        game.setGameName(gameDTO.getGameName());
        game.setGenre(gameDTO.getGenre());
        game.setCountComments(gameDTO.getCountComments());

        return game;
    }

    public GameDTO toDTO(final Game game){
        final GameDTO gameDTO = new GameDTO();

        gameDTO.setId(game.getId());
        gameDTO.setGameName(game.getGameName());
        gameDTO.setGenre(game.getGenre());
        gameDTO.setCountComments(game.getCountComments());

        return gameDTO;
    }
}
