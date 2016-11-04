int seatsInTheater(int nCols, int nRows, int col, int row)
{
    int counter = 0;
    for (int i = col; i <= nCols; i++)
        for (int j = 0; j < nRows-row; j++)
            counter++;
    return counter;
}
