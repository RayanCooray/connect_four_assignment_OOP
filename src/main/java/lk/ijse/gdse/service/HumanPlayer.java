package lk.ijse.gdse.service;

public class HumanPlayer extends Player{

    public HumanPlayer(Board board) {
        super(board);
    }

    @Override
    public void movePiece(int col) {
        System.out.println("human column : "+col);

        //check the move is legal
        if(board.isLegalMove(col)){
            System.out.println("Legal");
            int row = board.findNextAvailableSpot(col);
            board.updateMove( col,row , Piece.BLUE);
            System.out.println("update 1");
            board.getBoardUI().update(col,true);
            System.out.println("update 2");

            //check there is a winner
            if (board.findWinner().getWinningPiece()==Piece.EMPTY){
                System.out.println("No winner");
                if (!board.existLegalMoves()){
                    System.out.println("game tied");
                    board.getBoardUI().notifyWinner(new Winner(Piece.EMPTY));
                }
            }else{
                System.out.println("Human Winner");
                board.getBoardUI().notifyWinner(board.findWinner());
            }
        }else{
            System.out.println("Illegal");
        }
    }
}
