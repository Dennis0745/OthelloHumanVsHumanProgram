package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int count = 8;

        int xInput, yInput;

        Scanner scanner = new Scanner(System.in);
        OthelloFunction game = new OthelloFunction();
        game.newBoard();

        do
        {
            game.printBoard();
            System.out.println("Player" + game.turn + " : ");
            System.out.println("Please enter row: ");
            yInput = scanner.nextInt();
            System.out.println("Please enter col: ");
            xInput = scanner.nextInt();

            if ((xInput >= 0) && (xInput < count) && (yInput>= 0) && (yInput < count))
            {
                if (game.board[yInput][xInput] > 0)
                {
                    if (game.calculateGained(yInput, xInput) > 0)
                    {
                        game.board[yInput][xInput] = game.turn;
                        game.changeColor(yInput, xInput);
                        if (game.turn == game.playerX)
                        {
                            game.turn = game.playerO;
                        }
                        else
                        {
                            game.turn = game.playerX;
                        }
                    }
                }
            }
        }while ((xInput < count) && (yInput < count));
    }
}
