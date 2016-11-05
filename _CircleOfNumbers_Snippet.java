int circleOfNumbers(int n, int firstNumber) {
    if (n/2 > firstNumber)
        return n/2+firstNumber;
    else if (firstNumber > n/2)
        return n-firstNumber-1;
    else
        return 0;
}
