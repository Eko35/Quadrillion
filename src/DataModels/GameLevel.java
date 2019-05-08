package DataModels;

public class GameLevel {

    public PieceOnBoardInfo[] pieceInfos;
    public GridOnBoardInfo[] gridInfos;

    // Default constructor for level editor
    public GameLevel(){

    }

    public GameLevel(int level){
        if (level == 1){
            gridInfos = new GridOnBoardInfo[] {
                    new GridOnBoardInfo(2,5, 1, 2),
                    new GridOnBoardInfo(1,9, 3, 3),
                    new GridOnBoardInfo(4,5, 5, 1),
                    new GridOnBoardInfo(3,9, 7, 0)
            };

            pieceInfos = new PieceOnBoardInfo[] {
                    new PieceOnBoardInfo(9, true, 4, 1, 1),
                    new PieceOnBoardInfo(4, true, 6, 0, 2),
                    new PieceOnBoardInfo(7, true, 7, 2, 3),
                    new PieceOnBoardInfo(1, true, 5, 4, 1),
                    new PieceOnBoardInfo(8, true, 5, 6, 1),
                    new PieceOnBoardInfo(3, true, 6, 6, 5),
                    new PieceOnBoardInfo(12, true, 8, 7, 1),
                    new PieceOnBoardInfo(10, true, 10, 2, 2),
                    new PieceOnBoardInfo(5, true, 10, 4, 0),

                    new PieceOnBoardInfo(2, false, 0, 0, 0),
                    new PieceOnBoardInfo(6, false, 0, 0, 0),
                    new PieceOnBoardInfo(11, false, 0, 0, 0)
            };
        }

        if (level == 2){
            gridInfos = new GridOnBoardInfo[] {
                    new GridOnBoardInfo(6,1, 3, 3),
                    new GridOnBoardInfo(5,5, 3, 2),
                    new GridOnBoardInfo(3,9, 3, 2),
                    new GridOnBoardInfo(8,13, 3, 0)
            };

            pieceInfos = new PieceOnBoardInfo[] {
                    new PieceOnBoardInfo(4, true, 1, 4, 3),
                    new PieceOnBoardInfo(5, true, 2, 3, 0),
                    new PieceOnBoardInfo(10, true, 3, 4, 3),
                    new PieceOnBoardInfo(1, true, 4, 2, 1),
                    new PieceOnBoardInfo(9, true, 6, 2, 0),
                    new PieceOnBoardInfo(12, true, 5, 4, 3),
                    new PieceOnBoardInfo(6, true, 8, 4, 6),
                    new PieceOnBoardInfo(3, true, 9, 3, 4),

                    new PieceOnBoardInfo(2, false, 0, 0, 0),
                    new PieceOnBoardInfo(7, false, 0, 0, 0),
                    new PieceOnBoardInfo(8, false, 0, 0, 0),
                    new PieceOnBoardInfo(11, false, 0, 0, 0)
            };
        }

        if (level == 3){
            gridInfos = new GridOnBoardInfo[] {
                    new GridOnBoardInfo(3,8, 1, 3),
                    new GridOnBoardInfo(6,4, 3, 0),
                    new GridOnBoardInfo(5,10, 5, 0),
                    new GridOnBoardInfo(8,6, 7, 0)
            };

            pieceInfos = new PieceOnBoardInfo[] {
                    new PieceOnBoardInfo(4, true, 7, 1, 1),
                    new PieceOnBoardInfo(6, true, 9, 1, 0),
                    new PieceOnBoardInfo(7, true, 9, 3, 1),
                    new PieceOnBoardInfo(1, true, 11, 5, 2),
                    new PieceOnBoardInfo(8, true, 10, 6, 2),
                    new PieceOnBoardInfo(11, true, 9, 6, 2),
                    new PieceOnBoardInfo(10, true, 7, 8, 3),
                    new PieceOnBoardInfo(5, true, 6, 8, 1),
                    new PieceOnBoardInfo(12, true, 5, 6, 3),

                    new PieceOnBoardInfo(2, false, 0, 0, 0),
                    new PieceOnBoardInfo(3, false, 0, 0, 0),
                    new PieceOnBoardInfo(9, false, 0, 0, 0)
            };
        }

        // level 12
        if (level == 4){
            gridInfos = new GridOnBoardInfo[] {
                    new GridOnBoardInfo(2,5, 2, 2),
                    new GridOnBoardInfo(4,9, 2, 3),
                    new GridOnBoardInfo(1,5, 6, 0),
                    new GridOnBoardInfo(3,9, 6, 3)
            };

            pieceInfos = new PieceOnBoardInfo[] {
                    new PieceOnBoardInfo(10, true, 10, 2, 3),
                    new PieceOnBoardInfo(1, true, 9, 4, 7),
                    new PieceOnBoardInfo(11, true, 9, 6, 0),
                    new PieceOnBoardInfo(6, true, 9, 7, 5),
                    new PieceOnBoardInfo(12, true, 10, 7, 3),
                    new PieceOnBoardInfo(5, true, 7, 6, 2),
                    new PieceOnBoardInfo(7, true, 5, 6, 3),
                    new PieceOnBoardInfo(2, true, 5, 7, 4),

                    new PieceOnBoardInfo(3, false, 0, 0, 0),
                    new PieceOnBoardInfo(4, false, 0, 0, 0),
                    new PieceOnBoardInfo(8, false, 0, 0, 0),
                    new PieceOnBoardInfo(9, false, 0, 0, 0)
            };
        }
/*
        if (level == 1){
            gridInfos = new GridOnBoardInfo[] {
                    new GridOnBoardInfo(2,5, 1, 2),
                    new GridOnBoardInfo(1,9, 3, 3),
                    new GridOnBoardInfo(4,5, 5, 1),
                    new GridOnBoardInfo(3,9, 7, 0)
            };

            pieceInfos = new PieceOnBoardInfo[] {
                    new PieceOnBoardInfo(9, true, 4, 1, 1),
                    new PieceOnBoardInfo(4, true, 6, 0, 2),
                    new PieceOnBoardInfo(7, true, 7, 2, 3),
                    new PieceOnBoardInfo(1, true, 5, 4, 1),
                    new PieceOnBoardInfo(8, true, 5, 6, 1),
                    new PieceOnBoardInfo(3, true, 6, 6, 5),
                    new PieceOnBoardInfo(12, true, 8, 7, 1),
                    new PieceOnBoardInfo(10, true, 10, 2, 2),
                    new PieceOnBoardInfo(5, true, 10, 4, 0),

                    new PieceOnBoardInfo(2, false, 0, 0, 0),
                    new PieceOnBoardInfo(6, false, 0, 0, 0),
                    new PieceOnBoardInfo(11, false, 0, 0, 0)
            };
        }*/

        if (level == 11){
            gridInfos = new GridOnBoardInfo[] {
                    new GridOnBoardInfo(2,7, 5, 3),
                    new GridOnBoardInfo(1,11, 7, 3),
                    new GridOnBoardInfo(3,9, 11, 0),
                    new GridOnBoardInfo(4,5, 9, 0)
            };

            pieceInfos = new PieceOnBoardInfo[] {
                    new PieceOnBoardInfo(3, true, 7, 4, 5),
                    new PieceOnBoardInfo(7, true, 9, 5, 2),
                    new PieceOnBoardInfo(9, true, 7, 6, 6),
                    new PieceOnBoardInfo(4, true, 7, 9, 3),
                    new PieceOnBoardInfo(10, true, 12, 6, 2),
                    new PieceOnBoardInfo(5, true, 12, 8, 0),
                    new PieceOnBoardInfo(12, true, 10, 8, 3),

                    new PieceOnBoardInfo(1, false, 0, 0, 0),
                    new PieceOnBoardInfo(2, false, 0, 0, 0),
                    new PieceOnBoardInfo(3, false, 0, 0, 0),
                    new PieceOnBoardInfo(4, false, 0, 0, 0),
                    new PieceOnBoardInfo(11, false, 0, 0, 0)
            };
        }

        // level 33
        if (level == 12){
            gridInfos = new GridOnBoardInfo[] {
                    new GridOnBoardInfo(5,9, 1, 3),
                    new GridOnBoardInfo(6,5, 3, 3),
                    new GridOnBoardInfo(7,9, 5, 1),
                    new GridOnBoardInfo(4,5, 7, 1)
            };

            pieceInfos = new PieceOnBoardInfo[] {
                    new PieceOnBoardInfo(10, true, 8, 2, 2),
                    new PieceOnBoardInfo(6, true, 5, 3, 0),
                    new PieceOnBoardInfo(5, true, 5, 6, 0),
                    new PieceOnBoardInfo(1, true, 4, 7, 0),
                    new PieceOnBoardInfo(3, true, 6, 8, 1),

                    new PieceOnBoardInfo(2, false, 0, 0, 0),
                    new PieceOnBoardInfo(12, false, 0, 0, 0),
                    new PieceOnBoardInfo(4, false, 0, 0, 0),
                    new PieceOnBoardInfo(7, false, 0, 0, 0),
                    new PieceOnBoardInfo(8, false, 0, 0, 0),
                    new PieceOnBoardInfo(9, false, 0, 0, 0),
                    new PieceOnBoardInfo(11, false, 0, 0, 0)
            };
        }

        // level 34
        if (level == 13){
            gridInfos = new GridOnBoardInfo[] {
                    new GridOnBoardInfo(2,7, 2, 3),
                    new GridOnBoardInfo(6,3, 6, 3),
                    new GridOnBoardInfo(7,7, 6, 1),
                    new GridOnBoardInfo(4,11, 6, 1)
            };

            pieceInfos = new PieceOnBoardInfo[] {
                    new PieceOnBoardInfo(10, true, 8, 2, 2),
                    new PieceOnBoardInfo(6, true, 5, 3, 0),
                    new PieceOnBoardInfo(5, true, 5, 6, 0),
                    new PieceOnBoardInfo(1, true, 4, 7, 0),
                    new PieceOnBoardInfo(3, true, 6, 8, 1),

                    new PieceOnBoardInfo(2, false, 0, 0, 0),
                    new PieceOnBoardInfo(12, false, 0, 0, 0),
                    new PieceOnBoardInfo(4, false, 0, 0, 0),
                    new PieceOnBoardInfo(7, false, 0, 0, 0),
                    new PieceOnBoardInfo(8, false, 0, 0, 0),
                    new PieceOnBoardInfo(9, false, 0, 0, 0),
                    new PieceOnBoardInfo(11, false, 0, 0, 0)
            };
        }

        if (level == 31){
            gridInfos = new GridOnBoardInfo[] {
                    new GridOnBoardInfo(1,7, 5, 2),
                    new GridOnBoardInfo(4,11, 7, 2),
                    new GridOnBoardInfo(2,9, 11, 1),
                    new GridOnBoardInfo(1,5, 9, 1)
            };

            pieceInfos = new PieceOnBoardInfo[] {
                    new PieceOnBoardInfo(9, false, 0, 0, 0),
                    new PieceOnBoardInfo(4, false, 0, 0, 0),
                    new PieceOnBoardInfo(7, false, 0, 0, 0),
                    new PieceOnBoardInfo(1, false, 0, 0, 0),
                    new PieceOnBoardInfo(8, false, 0, 0, 0),
                    new PieceOnBoardInfo(3, false, 0, 0, 0),
                    new PieceOnBoardInfo(12, false, 0, 0, 0),
                    new PieceOnBoardInfo(10, false, 0, 0, 0),
                    new PieceOnBoardInfo(5, false, 0, 0, 0),
                    new PieceOnBoardInfo(2, false, 0, 0, 0),
                    new PieceOnBoardInfo(6, false, 0, 0, 0),
                    new PieceOnBoardInfo(11, false, 0, 0, 0)
            };
        }
    }
}
