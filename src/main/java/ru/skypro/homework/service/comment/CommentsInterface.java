package ru.skypro.homework.service.comment;

import ru.skypro.homework.entity.Comment;
import ru.skypro.homework.model.comment.CommentDto;
import ru.skypro.homework.model.comment.CommentsList;

public interface CommentsInterface {

    CommentsList getAllComments(int adPk);

    Comment setComments(int adPk);

    CommentDto getComment(int pk, int id);

    void removeComment(int pk, int id);

    CommentDto updateComment(int pk, int id);
}
